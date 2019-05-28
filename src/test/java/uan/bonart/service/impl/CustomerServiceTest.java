package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Customer;
import uan.bonart.entities.TypeCustomer;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class CustomerServiceTest {
    @Mock
    CustomerRepository customerRepository;
    @InjectMocks
    CustomerService customerService;

    Customer customerMock = new Customer();

    TypeCustomer typeCustomerMock = new TypeCustomer();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        typeCustomerMock.setCodetype(1);
        typeCustomerMock.setTypec("ADULTO");
        typeCustomerMock.setPrice(20000f);


        customerMock.setEmail("lrodriguez52@uan.edu.co");
        customerMock.setFlag(1);
        customerMock.setTypeCustomer(typeCustomerMock);


        when(customerRepository.findByDocument("123456789")).thenReturn(Optional.of(customerMock));
        when(customerRepository.save(customerMock)).thenReturn(customerMock);
        when(customerRepository.findAll()).thenReturn(customerList());
        when(customerRepository.getTotal()).thenReturn(2000f);
    }

    @Test
    public void testCreate() throws Exception {
        Customer result = customerService.create(customerMock);
        Assert.assertEquals(result, customerMock);
    }

    @Test
    public void testFindAll() throws Exception {
        customerService.findAll();
    }

    @Test (expected = ResourceNotFoundException.class)
    public void testUpdateFail() throws ResourceNotFoundException {
        customerService.update(customerMock);
    }

    @Test
    public void testUpdate() throws ResourceNotFoundException {
        customerMock.setDocument("123456789");
        Customer result = customerService.update(customerMock);
        Assert.assertEquals(result, customerMock);
    }

    @Test (expected = ResourceNotFoundException.class)
    public void testDeleteFail() throws ResourceNotFoundException {
        customerService.delete(customerMock);
    }

    @Test
    public void testDelete() throws ResourceNotFoundException {
        customerMock.setDocument("123456789");
        customerService.delete(customerMock);
    }


    @Test
    public void testFindByDocument() throws Exception {
        customerService.findByDocument("1014293634");
    }
    @Test
    public void testFindByDocument_() throws Exception {
        customerService.findByDocument_("1014293634");
    }

    @Test
    public void testGetTotal() throws Exception {
        customerService.getTotal();
    }

    public List<Customer> customerList(){
        List<Customer> result = new ArrayList<>();
        result.add(customerMock);
        return result;
    }
}

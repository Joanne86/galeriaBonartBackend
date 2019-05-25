package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Customer;
import uan.bonart.entities.TypeCustomer;
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



        when(customerRepository.save(customerMock)).thenReturn(customerMock);
        when(customerRepository.findAll()).thenReturn(customerList());
        when(customerRepository.findByDocument(anyString())).thenReturn(Optional.of(customerMock));
    }

    @Test
    public void testCreate() throws Exception {
       customerService.create(customerMock);
    }

    @Test
    public void testFindAll() throws Exception {
        customerService.findAll();
    }

    @Test
    public void testFindByDocument() throws Exception {
        customerService.findByDocument("1014293634");
    }

    public List<Customer> customerList(){
        List<Customer> result = new ArrayList<>();
        result.add(customerMock);
        return result;
    }
}

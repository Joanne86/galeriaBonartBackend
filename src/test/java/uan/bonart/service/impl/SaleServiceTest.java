package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.ArtworkSaled;
import uan.bonart.entities.Customer;
import uan.bonart.entities.Sale;
import uan.bonart.entities.TypeCustomer;
import uan.bonart.repositories.SaleRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class SaleServiceTest {
    @Mock
    SaleRepository saleRepository;
    @InjectMocks
    SaleService saleService;

    Sale saleMock = new Sale();
    Customer customerMock = new Customer();
    TypeCustomer typeCustomerMock = new TypeCustomer();
    ArtworkSaled artworkSaledMock = new ArtworkSaled();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        typeCustomerMock.setCodetype(1);
        typeCustomerMock.setTypec("ADULTO");
        typeCustomerMock.setPrice(20000f);

        customerMock.setEmail("lrodriguez52@uan.edu.co");
        customerMock.setFlag(1);
        customerMock.setTypeCustomer(typeCustomerMock);

        artworkSaledMock.setArtist("LeidyRFART");
        artworkSaledMock.setInscription_code(1);
        artworkSaledMock.setName("la monalisa");
        artworkSaledMock.setNumber_room(2);
        artworkSaledMock.setPrice(1000000f);

        saleMock.setArtworkSaled(artworkSaledMock);
        saleMock.setCustomer(customerMock);
        saleMock.setId(1);

        when(saleRepository.save(saleMock)).thenReturn(saleMock);
        when(saleRepository.findAll()).thenReturn(salesList());

    }

    @Test
    public void testCreate() throws Exception {
        saleService.create(saleMock);
    }

    @Test
    public void testFindAll() throws Exception {
        saleService.findAll();
    }

    public List<Sale> salesList(){
        List<Sale> result = new ArrayList<>();
        result.add(saleMock);
        return result;
    }
}

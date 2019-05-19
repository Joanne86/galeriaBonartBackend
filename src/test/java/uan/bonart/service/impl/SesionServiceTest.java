package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Seller;
import uan.bonart.entities.Sesion;
import uan.bonart.repositories.SesionRepository;

import static org.mockito.Mockito.*;

public class SesionServiceTest {
    @Mock
    SesionRepository sesionRepository;
    @InjectMocks
    SesionService sesionService;

    Seller sellerMock = new Seller();
    Sesion sesionMock = new Sesion();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        sellerMock.setCellphone("3227525187");
        sellerMock.setDocument("1014293634");
        sellerMock.setName("David Parra");

        sesionMock.setSeller(sellerMock);
        sesionMock.setId(1);
        sesionMock.setPassword("Colombia1");
        sesionMock.setUser("lrodr78");

        when(sesionRepository.getSesion(anyString(), anyString())).thenReturn(sesionMock);
    }

    @Test
    public void testGetSesion() throws Exception {
       sesionService.getSesion("lrodr78", "Colombia1");
    }
}

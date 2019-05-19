package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Seller;
import uan.bonart.repositories.SellerRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class SellerServiceTest {
    @Mock
    SellerRepository sellerRepository;
    @InjectMocks
    SellerService sellerService;

    Seller sellerMock = new Seller();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        sellerMock.setCellphone("3227525187");
        sellerMock.setDocument("1014293634");
        sellerMock.setName("David Parra");

        when(sellerRepository.save(sellerMock)).thenReturn(sellerMock);
        when(sellerRepository.findAll()).thenReturn(sellerList());
    }

    @Test
    public void testCreate() throws Exception {
        sellerService.create(new Seller());
    }

    @Test
    public void testFindAll() throws Exception {
        sellerService.findAll();
    }
    public List<Seller> sellerList(){
        List<Seller> result = new ArrayList<>();
        result.add(sellerMock);
        return result;
    }
}

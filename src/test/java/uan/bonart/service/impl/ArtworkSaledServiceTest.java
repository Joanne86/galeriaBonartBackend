package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.ArtworkSaled;
import uan.bonart.repositories.ArtworkSaledRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class ArtworkSaledServiceTest {
    @Mock
    ArtworkSaledRepository artworkSaledRepository;
    @InjectMocks
    ArtworkSaledService artworkSaledService;

    ArtworkSaled artworkSaledMock = new ArtworkSaled();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        artworkSaledMock.setArtist("LeidyRFART");
        artworkSaledMock.setInscription_code(1);
        artworkSaledMock.setName("la monalisa");
        artworkSaledMock.setNumber_room(2);
        artworkSaledMock.setPrice(1000000f);
        when(artworkSaledRepository.findAllByNumber_room(anyInt())).thenReturn(artworkSaledList());
        when(artworkSaledRepository.save(artworkSaledMock)).thenReturn(artworkSaledMock);
        when(artworkSaledRepository.getTotal(anyInt())).thenReturn(anyFloat());
    }

    @Test
    public void testCreate() throws Exception {
        artworkSaledService.create(artworkSaledMock);
    }

    @Test
    public void testFindAllByNumber_room() throws Exception {
       artworkSaledService.findAllByNumber_room(2);
    }

    @Test
    public void testGetTotal() throws Exception {
        artworkSaledService.getTotal(2);

    }
    public List<ArtworkSaled> artworkSaledList(){
        List<ArtworkSaled> result = new ArrayList<>();
        result.add(artworkSaledMock);
        return result;
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Artist;
import uan.bonart.repositories.ArtistRepository;

import java.util.ArrayList;
import java.util.Optional;


import static org.mockito.Mockito.*;

public class ArtistServiceTest {
    @Mock
    ArtistRepository artistRepository;
    @InjectMocks
    ArtistService artistService;

    Artist artistMock = new Artist();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        artistRepository = mock(ArtistRepository.class);
        artistService = mock(ArtistService.class);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreate() throws Exception {
        when(artistRepository.save(artistMock)).thenReturn(artistMock);
        when(artistService.create(artistMock)).thenReturn(artistMock);

    }


    @Test
    public void testFindAll() throws Exception {

        when(artistRepository.findAll()).thenReturn(artistServiceTest());

    }

    @Test
    public void testFindByDocumentTrue() throws Exception {
        when(artistRepository.findByDocument(anyString())).thenReturn(Optional.of(artistMock));
        //when(artistRepository.findByDocument(anyString())).thenReturn(true);
    }
    @Test
    public void testFindByDocumentFalse() throws Exception {
        when(artistService.findByDocument(anyString())).thenReturn(false);

    }

    public  Iterable<Artist> artistServiceTest(){
        Iterable<Artist> result = new ArrayList<>();
        return result;
    }

}

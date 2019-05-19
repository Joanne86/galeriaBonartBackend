package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Artist;
import uan.bonart.repositories.ArtistRepository;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class ArtistServiceTest2 {
    @Mock
    ArtistRepository artistRepository;
    @InjectMocks
    ArtistService artistService;

    @Before
    public void setUp() {
        //doNothing().when(artistRepository.save(new Artist()));
        when(artistRepository.save(getArtist())).thenReturn(getArtist());
        MockitoAnnotations.initMocks(this);
    }

    public Artist getArtist (){
        Artist artist = new Artist();
        return artist;
    }

    @Test
    public void testCreate() throws Exception {
        Artist result = artistService.create(new Artist());

        Assert.assertEquals(new Artist(), result);
    }

    @Test
    public void testFindAll() throws Exception {
        when(artistRepository.findAll()).thenReturn(artistServiceTest());
        Iterable<Artist> result = artistService.findAll();
        Assert.assertEquals(null, result);
    }

    @Test
    public void testFindByDocument() throws Exception {
        when(artistRepository.findByDocument(anyString())).thenReturn(null);

        boolean result = artistService.findByDocument("document");
        Assert.assertEquals(true, result);
    }
    public  Iterable<Artist> artistServiceTest(){
        Iterable<Artist> result = new ArrayList<>();
        return result;
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
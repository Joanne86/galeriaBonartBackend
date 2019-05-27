package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Artist;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.ArtistRepository;

import java.util.ArrayList;
import java.util.List;
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

        artistMock.setAddress("San telmo");
        artistMock.setCity("bogota");
        artistMock.setExhibitions("corferias");
        artistMock.setCellphone("3125256290");
        //artistMock.setDocument("1014293634");
        artistMock.setName("leidy rodriguez");


        when(artistRepository.findByDocument("123456789")).thenReturn(Optional.of(artistMock));
        when(artistRepository.save(artistMock)).thenReturn(artistMock);
        when(artistRepository.findAll()).thenReturn(artistsList());

    }

    @Test
    public void testCreate() throws Exception {
        artistService.create(artistMock);
    }


    @Test
    public void testFindAll() throws Exception {
        artistService.findAll();
    }

    @Test
    public void testFindByDocument() throws Exception {
        artistService.findByDocument(anyString());
    }
    @Test
    public void testFindByDocument_() throws Exception {
        artistMock.setDocument("123456789");
        artistService.findByDocument_("123456789");
    }

    @Test
    public void testUpdate() throws ResourceNotFoundException {
        artistMock.setDocument("123456789");
        artistService.update(artistMock);
    }
    @Test (expected = ResourceNotFoundException.class)
    public void testUpdateFail() throws ResourceNotFoundException {
        artistService.update(artistMock);
    }

  @Test
    public void testDelete() throws ResourceNotFoundException {
        //artistMock.setDocument("123456789");
        artistService.delete("123456789");
    }

    @Test (expected = ResourceNotFoundException.class)
    public void testDeleteFail() throws ResourceNotFoundException {
        artistService.delete("12345679");
    }

    public List<Artist> artistsList(){
        List<Artist> result = new ArrayList<>();
        result.add(artistMock);
        return result;
    }

}

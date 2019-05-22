package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Mock
    Artist artistMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        artistMock.setAddress("San telmo");
        artistMock.setCity("bogota");
        artistMock.setExhibitions("corferias");
        artistMock.setCellphone("3125256290");
        artistMock.setDocument("1014293634");
        artistMock.setName("leidy rodriguez");

        when(artistRepository.save(artistMock)).thenReturn(artistMock);
        when(artistRepository.findAll()).thenReturn(artistsList());
        when(artistRepository.findByDocument(anyString())).thenReturn(Optional.of(artistMock));

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
    public void testUpdate() throws ResourceNotFoundException {
        artistService.update(artistMock);
    }

  /*  @Test
    public void testDelete() throws ResourceNotFoundException {
        when(artistRepository.findByDocument(anyString())).thenReturn(Optional.of(artistMock));
        artistService.delete(artistMock);
    }*/

    public List<Artist> artistsList(){
        List<Artist> result = new ArrayList<>();
        result.add(artistMock);
        return result;
    }

}

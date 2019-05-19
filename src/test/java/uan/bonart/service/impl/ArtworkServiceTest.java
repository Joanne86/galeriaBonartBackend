package uan.bonart.service.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.Stubber;
import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;
import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;
import uan.bonart.repositories.ArtworkRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class ArtworkServiceTest {
    @Mock
    ArtworkRepository artworkRepository;
    @InjectMocks
    ArtworkService artworkService;

    Artwork artworkMock = new Artwork();
    Artist artistMock = new Artist();
    Room roomMock = new Room();
    Seller sellerMock = new Seller();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        artistMock.setAddress("San telmo");
        artistMock.setCity("bogota");
        artistMock.setExhibitions("corferias");
        artistMock.setCellphone("3125256290");
        artistMock.setDocument("1014293634");
        artistMock.setName("leidy rodriguez");

        sellerMock.setCellphone("3227525187");
        sellerMock.setDocument("1014293634");
        sellerMock.setName("David Parra");

        roomMock.setCode(1);
        roomMock.setName("pinturas");
        roomMock.setSeller(sellerMock);

        artworkMock.setArtist(artistMock);
        artworkMock.setInscription_code(2);
        artworkMock.setName("Claudia Hernandez");
        artworkMock.setPrice(500000f);
        artworkMock.setRoom(roomMock);

        when(artworkRepository.save(artworkMock)).thenReturn(artworkMock);
        when( artworkRepository.findAll()).thenReturn( artworkList());
        when(artworkRepository.findByName(anyString())).thenReturn(artworkMock);
        when(artworkRepository.findByRoomCode(anyInt())).thenReturn(artworkList());
        //doNothing(artworkRepository.deleteByInscription_code(anyInt()));
        when(artworkRepository.findByInscription_code(anyInt())).thenReturn(Optional.of(artworkMock));
    }

    @Test
    public void testCreate() throws Exception {
       artworkService.create(new Artwork());
    }

    @Test
    public void testFindAll() throws Exception {
        artworkService.findAll();

    }

    @Test
    public void testFindByName() throws Exception {
        artworkService.findByName("name");
    }

    @Test
    public void testFindByRoomCode() throws Exception {
        artworkService.findByRoomCode(1);
    }

    @Test
    public void testDeleteByInscription_code() throws Exception {
        artworkService.deleteByInscription_code(1);
    }

    @Test
    public void testFindByInscription_code() throws Exception {
        artworkService.findByInscription_code(0);
    }

    public List<Artwork> artworkList(){
        List<Artwork> result = new ArrayList<>();
        result.add(artworkMock);
        return result;
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
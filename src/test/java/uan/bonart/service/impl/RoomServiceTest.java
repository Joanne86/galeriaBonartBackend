package uan.bonart.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uan.bonart.entities.Room;
import uan.bonart.entities.Seller;
import uan.bonart.repositories.RoomRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class RoomServiceTest {
    @Mock
    RoomRepository roomRepository;
    @InjectMocks
    RoomService roomService;

    Room roomMock = new Room();
    Seller sellerMock = new Seller();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        sellerMock.setCellphone("3227525187");
        sellerMock.setDocument("1014293634");
        sellerMock.setName("David Parra");

        roomMock.setCode(1);
        roomMock.setName("pinturas");
        roomMock.setSeller(sellerMock);

        when(roomRepository.save(roomMock)).thenReturn(roomMock);
        when(roomRepository.findAll()).thenReturn(roomList());
        when(roomRepository.getCode(anyString())).thenReturn(roomMock);
    }

    @Test
    public void testCreate() throws Exception {
        roomService.create(new Room());
    }

    @Test
    public void testFindAll() throws Exception {
        roomService.findAll();
    }

    @Test
    public void testGetCode() throws Exception {
        roomService.getCode("document");
    }

    public List<Room> roomList(){
        List<Room> result = new ArrayList<>();
        result.add(roomMock);
        return result;
    }
}

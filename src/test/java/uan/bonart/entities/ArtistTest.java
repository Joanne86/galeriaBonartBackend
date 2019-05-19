package uan.bonart.entities;

import org.junit.Test;
import javax.xml.datatype.DatatypeConfigurationException;
import java.lang.reflect.InvocationTargetException;

public class ArtistTest {
    @Test
    public void test() throws InvocationTargetException, DatatypeConfigurationException, InstantiationException, IllegalAccessException {
        EntitieTest.testEntitie(Artist.class);
    }
}

package uan.bonart.entities;

import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import java.lang.reflect.InvocationTargetException;

public class ArtworkTest {
    @Test
    public void test() throws InvocationTargetException, DatatypeConfigurationException, InstantiationException, IllegalAccessException {
        EntitieTest.testEntitie(Artwork.class);
    }
}


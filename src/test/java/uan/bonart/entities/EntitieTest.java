package uan.bonart.entities;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;

import static org.junit.Assert.assertNotNull;

public class EntitieTest {
    public static void testEntitie(Class<?> claseDto) throws InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException, DatatypeConfigurationException {
        Object dto = claseDto.newInstance();
        List<Method> metodos = Arrays.asList(claseDto.getDeclaredMethods());
        for (Method method : metodos) {
            if (method.getName().startsWith("set")) {
                Class<?>[] params = method.getParameterTypes();
                List<Object> args = getParameters(params);
                if (!args.isEmpty()) {
                    method.invoke(dto, args.toArray());
                }
            }
        }
        for (Method method : metodos) {
            if (method.getName().startsWith("get") && !method.getReturnType().isEnum()) {
                assertNotNull(method.invoke(dto));
            }
        }
        Constructor<?>[] constructors = claseDto.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            List<Object> args = getParameters(params);
            dto = constructor.newInstance(args.toArray());
            assertNotNull(dto);
        }
        assertNotNull(dto.hashCode());
        assertNotNull(dto.toString());
    }
    private static List<Object> getParameters(Class<?>[] params)
            throws DatatypeConfigurationException, InstantiationException, IllegalAccessException {
        List<Object> args = new ArrayList<Object>();
        for (int i = 0; i < params.length; i++) {
            if (params[i].equals(Integer.class) || params[i].equals(int.class) || params[i].equals(float.class)) {
                args.add(1);
            } else if (params[i].equals(String.class)) {
                args.add("2018-09-13");
            } else if (params[i].equals(Boolean.class) || params[i].equals(boolean.class)) {
                args.add(true);
            } else if (params[i].equals(Long.class) || params[i].equals(long.class)) {
                args.add(new Long(1));
            } else if (params[i].equals(Double.class) || params[i].equals(double.class)) {
                args.add(new Double(1));
            } else if (params[i].equals(Map.class)) {
                args.add(Collections.EMPTY_MAP);
            } else if (params[i].equals(List.class)) {
                args.add(Collections.EMPTY_LIST);
            } else if (params[i].equals(Set.class)) {
                args.add(Collections.EMPTY_SET);
            } else if (params[i].equals(byte.class)) {
                args.add((byte) 1);
            } else if (params[i].equals(BigDecimal.class)) {
                args.add(BigDecimal.ZERO);
            } else if (params[i].equals(Float.class)) {
                args.add(Float.MIN_NORMAL);
            } else if (params[i].equals(BigInteger.class)) {
                args.add(BigInteger.ONE);
            } else if (params[i].equals(XMLGregorianCalendar.class)) {
                GregorianCalendar date = new GregorianCalendar();
                args.add(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
            } else if (params[i].equals(Date.class)) {
                args.add(new Date());
            } else if (params[i].isEnum()) {
            } else if (params[i].equals(Timestamp.class)) {
                args.add(new Timestamp(1));
            } else if (params[i].equals(Byte.class)) {
                args.add(new Byte("123"));
            } else {
                args.add(params[i].newInstance());
            }
        }
        return args;
    }
}

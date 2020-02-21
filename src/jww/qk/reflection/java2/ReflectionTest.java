package jww.qk.reflection.java2;

import jww.qk.reflection.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.AccessException;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -15:29
 * @title
 **/
public class ReflectionTest {

    //
    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();
        Field id = clazz.getField("id");

        id.set(person,100);

        Object o = id.get(person);
        System.out.println(o);

    }

    //
    @Test
    public void testField2() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();

        Field id = clazz.getDeclaredField("name");

        id.setAccessible(true);
        id.set(person,"tom");

        Object o = id.get(person);
        System.out.println(o);

    }

    //
    @Test
    public void testMethod() throws Exception {
        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();

        Method method = clazz.getDeclaredMethod("show", String.class);

        method.setAccessible(true);
        Object chn = method.invoke(person, "CHN");

        System.out.println(chn);

        Method showDesc = clazz.getDeclaredMethod("showDesc");

        showDesc.setAccessible(true);
        Object invoke = showDesc.invoke(Person.class);

        System.out.println(invoke);

    }



    //
    @Test
    public void testConstructor() throws Exception {
        Class<Person> clazz = Person.class;

        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);

        Person ton = constructor.newInstance("Ton");


        System.out.println(ton);

    }
}

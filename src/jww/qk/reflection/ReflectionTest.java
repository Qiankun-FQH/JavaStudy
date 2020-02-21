package jww.qk.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -13:09
 * @title
 **/
public class ReflectionTest {

    public static void main(String[] args) throws Exception {

        //Person p = new Person("tom",11);


        Class clazz = Person.class;

        Constructor cons = clazz.getConstructor(String.class, int.class);

        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;

        System.out.println(p);

        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        Constructor s1 = clazz.getDeclaredConstructor(String.class);
        s1.setAccessible(true);
        Person p1 = (Person) s1.newInstance("Jack");
        System.out.println(p1);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeiMei");
        System.out.println(p1);

        Method showNo = clazz.getDeclaredMethod("showNo");
        showNo.setAccessible(true);
        Object invoke = showNo.invoke(p1);
        System.out.println(invoke);

    }

    //测试反射
    @Test
    public void testReflection() throws ClassNotFoundException {
        Class<Person> clazz1 = Person.class;//class jww.qk.reflection.Person
        System.out.println(clazz1);

        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        Class clazz3 = Class.forName("jww.qk.reflection.Person");
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);

        ClassLoader clazzLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = clazzLoader.loadClass("jww.qk.reflection.Person");
        System.out.println(clazz4);

    }
}

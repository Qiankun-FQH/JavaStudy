package jww.qk.reflection.java2;

import jww.qk.reflection.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -15:10
 * @title
 **/
public class OtherTest {

    public static void main(String[] args){
        Class<Person> personClass = Person.class;

        Constructor<?>[] constructors =
                personClass.getConstructors();

        for(Constructor c : constructors){
            System.out.println(c);
        }


        Constructor<?>[] constructors2 =
                personClass.getDeclaredConstructors();

        for(Constructor c : constructors2){
            System.out.println(c);
        }


    }

    //
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);


        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);


    }
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType)
                genericSuperclass;

        Type[] types = parameterizedType.getActualTypeArguments();

        System.out.println(types[0].getTypeName());


    }

    @Test
    public void test3(){
        Class<Person> clazz = Person.class;

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

    @Test
    public void test4(){
        Class<Person> clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }


}

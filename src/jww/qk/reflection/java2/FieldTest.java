package jww.qk.reflection.java2;

import jww.qk.reflection.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -14:44
 * @title
 **/
public class FieldTest {
    //
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();

        for(Field f : fields){
            System.out.println(f);
        }


        System.out.println("-----------------------");


        Field[] fields1 = personClass.getDeclaredFields();
        for(Field f : fields1){
            System.out.println(f);
        }

    }
    //
    @Test
    public void test2(){
        Class<Person> personClass = Person.class;
        Field[] fields1 = personClass.getDeclaredFields();
        for(Field f : fields1){
            int modifiers = f.getModifiers();
            System.out.println(modifiers+ "\t" + Modifier.toString(modifiers) + "\t");

           // System.out.println("---------------");
            Class<?> type = f.getType();
            System.out.print(type + "\t");


            String name = f.getName();
            System.out.println(name + "\t");
        }
    }
}

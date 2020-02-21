package jww.qk.reflection;

import org.junit.Test;

import java.util.Random;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -14:17
 * @title
 **/
public class NewInstanceTest {
    //
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);

        Class<Random> randomClass = Random.class;
        Random random = randomClass.newInstance();


    }
}

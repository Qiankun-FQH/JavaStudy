package jww.qk.reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -14:04
 * @title
 **/
public class ClassLoaderTest {
    //测试
    @Test
    public void test1(){
        //自定义类，系统加载器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        //系统类类，扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        //扩展类加载器，无法加载
        ClassLoader parent = classLoader1.getParent();
        System.out.println(parent);

        ClassLoader classLoader2 = String.class.getClassLoader();
        System.out.println(classLoader2);
    }

    //
    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();

//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        pros.load(fis);

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();

        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(user+" : "+password);;

    }
}

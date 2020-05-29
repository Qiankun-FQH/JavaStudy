package jww.qk.map;

import jww.qk.map.entity.User;
import org.junit.Test;

import java.util.*;

/**
 * @author Administrator
 * @date 2020-05-09 16:33
 * @title
 **/
public class MapTest {

    //
    @Test
    public void testT1() {
//        HashMap<String,String> hashMap = new HashMap();
//        hashMap.put("aa", "1");
//        hashMap.put("bb", "2");
//
//        for (String s : hashMap.keySet()) {
//            if(s.equals("aa")){
//                hashMap.remove(s);
//            }
//        }



    }

    // HashMap ConCurrentHashMap
    @Test
    public void test() {
        Map map = new HashMap<>();

        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);
        map.put("AA", 87);
        System.out.println(map);

        System.out.println("_____________");
        Map map2 = new HashMap();
        map2.put("Jw2", "jw20301");
        map2.put("Qk", "qk0724");
        map.putAll(map2);
        System.out.println(map);

        System.out.println("_____________");
        Object aa = map.remove("AA");
        System.out.println(aa);
        System.out.println(map);

        System.out.println("_____________");
        System.out.println(map.get(45));
        System.out.println(map.containsKey(444));
        System.out.println(map.size());
        System.out.println(map.containsValue(123));
        System.out.println(map.isEmpty());

        System.out.println("*************");
        Set set = map.entrySet();
        set.forEach(System.out::println);

        System.out.println("*************");
        Set set1 = map.keySet();
        set1.forEach(System.out::println);

        System.out.println("*************");
        Collection values = map.values();
        values.forEach(System.out::println);
    }

    //TreeMap
    @Test
    public void testTreeMap() {
        TreeMap map = new TreeMap<>();
        User aa = new User("aa", 1);
        User bb = new User("bb", 5);
        User cc = new User("cc", 4);
        User dd = new User("dd", 5);
        map.put(aa, 98);
        map.put(bb, 98);
        map.put(cc, 98);
        map.put(dd, 98);
        Set set = map.entrySet();
        set.forEach(System.out::println);
    }
}

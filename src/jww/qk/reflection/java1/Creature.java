package jww.qk.reflection.java1;

import java.io.Serializable;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -14:30
 * @title
 **/
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    
    private void breath(){
        System.out.println("生物呼吸");

    }
    public void eat(){
        System.out.println("生物进食");

    }
}

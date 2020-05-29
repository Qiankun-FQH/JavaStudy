package jww.qk.map.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @date 2020-05-10 12:21
 * @title
 **/
//@AllArgsConstructor
public class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User) o;
            int compare = -this.name.compareTo(user.name);
            if(compare != 0){
                return compare;
            }else {
                return Integer.compare(this.age,user.age);
            }
        }else {
           throw new RuntimeException("输入的类型不正确");
        }
    }
}

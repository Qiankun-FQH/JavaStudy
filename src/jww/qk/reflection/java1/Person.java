package jww.qk.reflection.java1;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -13:09
 * @title
 **/
@MyAnnotation(value = "WWJ")
public class Person extends Creature<String> implements Comparable<String>, MyInterface{

    private String name;

    int age;

    public int id;

    public Person() {
    }


    @MyAnnotation(value = "abc")
    public Person(String name){
        this.name = name;
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;

    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我的国籍是" + nation);
        return nation;
    }

    public String display(String interests) throws RuntimeException, Exception{
        return interests;
    }
    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {

        System.out.println("我是一个人");
    }

    private static void showDesc(){
        System.out.println("我是一个可爱的人");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

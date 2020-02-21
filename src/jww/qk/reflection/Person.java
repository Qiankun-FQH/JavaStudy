package jww.qk.reflection;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -13:09
 * @title
 **/
public class Person {
    private String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Person(String name) {

        this.name = name;

    }



    public Person(String name, int age) {

        this.name = name;
        this.age = age;
            }


    public Person() {
    }

    public void show(){
        System.out.println("ren");
    }
    public void showNo(){
        System.out.println("ZhongGuoren");
    }
}

package jww.qk.meiju;

/**
 * @author Qiankun
 * @date 2020/2/24 0024 -10:17
 * @title
 **/
public class SeasonTest1 {
    public static void main(String[] args){
        Season1 winter = Season1.WINTER;
        System.out.println(winter);
        for (Season1 value : Season1.values()) {
            System.out.println(value);

        };

       // Season1 winter1 = Season1.valueOf("WINjTER");
        //System.out.println(winter1);

        winter.show();

    }
}
interface Info{
    void show();
}
enum Season1 implements Info{

    Spring("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    SUMMER("夏天", "xia"){
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    AUTUMN("秋天", "qiu"){
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    WINTER("冬天", "dong"){
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };
    private final String name;
    private final String des;

    Season1(String name, String des) {
        this.name = name;
        this.des = des;
    }
}
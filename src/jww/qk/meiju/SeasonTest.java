package jww.qk.meiju;

/**
 * @author Qiankun
 * @date 2020/2/24 0024 -10:08
 * @title
 **/
public class SeasonTest {

    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }

}


class Season{

    private final String seasonName;
    private final String seasonDes;

    public Season(String seasonName, String seasonDes) {
        this.seasonName = seasonName;
        this.seasonDes = seasonDes;
    }

    public static final Season SPRING =
            new Season("春天", "春暖花开");
    public static final Season SUMMER =
            new Season("夏天", "xia");
    public static final Season AUTUMN =
            new Season("秋天", "qiu");
    public static final Season WINTER =
            new Season("冬天", "dong");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDes='" + seasonDes + '\'' +
                '}';
    }


}
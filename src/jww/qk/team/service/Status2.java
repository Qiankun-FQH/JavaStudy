package jww.qk.team.service;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:20
 **/
public class Status2 {
    private final String NAME;
    private Status2(String name){
        this.NAME = name;
    }
    public static final Status2 FREE = new Status2("FREE");
    public static final Status2 BUSY = new Status2("BUSY");
    public static final Status2 VOCATION = new Status2("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}

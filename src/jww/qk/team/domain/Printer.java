package jww.qk.team.domain;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:13
 **/
public class Printer implements Equipment {
    @Override
    public String getDescription() {
        return name + "(" + type +")";
    }

    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

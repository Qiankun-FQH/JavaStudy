package jww.qk.team.domain;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:09
 **/
public class PC implements Equipment {

    /**
     * 机器型号
     */
    private String model;

    /**
     * 显示器名称
     */
    private String display;
    @Override
    public String getDescription() {
        return model + "("+ display +")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }
}

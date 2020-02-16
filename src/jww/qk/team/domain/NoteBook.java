package jww.qk.team.domain;

import com.sun.javafx.scene.control.skin.DoubleFieldSkin;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:11
 **/
public class NoteBook implements Equipment {
    @Override
    public String getDescription() {
        return model + "(" + price +")";
    }
    /**
     * 型号
     */
    private String model;

    /**
     * 价格
     */
    private double price;

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public NoteBook() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

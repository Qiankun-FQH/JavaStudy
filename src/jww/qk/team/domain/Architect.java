package jww.qk.team.domain;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:30
 **/
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bouns, int stock) {
        super(id, name, age, salary, equipment, bouns);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return getDetails() + "\t架構師\t"
                + getStatus() + "\t"
                + getBouns() + "\t"
                + stock + "\t"
                + getEquipment().getDescription();
    }
}

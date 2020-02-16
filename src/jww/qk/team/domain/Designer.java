package jww.qk.team.domain;

import jww.qk.team.service.Status;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:28
 **/
public class Designer extends Programmer{
    private double bouns;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bouns) {
        super(id, name, age, salary, equipment);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public String toString() {
        return getDetails() + "\t設計師\t"
                + getStatus() + "\t"
                + bouns + "\t\t"
                + getEquipment().getDescription();
    }
}

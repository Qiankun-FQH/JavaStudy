package jww.qk.team.domain;

import jww.qk.team.service.Status;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -14:18
 **/
public class Programmer extends Employee {
    private int numberId;
    private Status status = Status.FREE;
    private Equipment equipment;


    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String toString() {
        return getDetails() + "\t程序員\t" + status
                + "\t\t\t" + equipment.getDescription();
    }
}

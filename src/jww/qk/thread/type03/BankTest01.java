package jww.qk.thread.type03;

/**
 * @author Qiankun
 * @date 2020/2/18 0018 -13:03
 * @title
 **/
public class BankTest01 {

    public static void main(String[] args){
        Bank2 bank2_1 = Bank2.getBank2();
        Bank2 bank2_2 = Bank2.getBank2();
        System.out.println(bank2_1 == bank2_2);
    }
}

class Bank{
    private Bank(){}

    private static Bank instence = null;

    public static Bank getInstance(){

        if(instence == null){
            synchronized (Bank.class){
                if(instence == null){
                    instence = new Bank();
                }
            }
        }
        return instence;
    }
}

class Bank2 {
    private static final Bank2 bank2 = new Bank2();
    private Bank2(){}

    public static Bank2 getBank2(){
        return bank2;
    }
}
class Bank3 {
    private static final Bank3 bank3;
    static {
        bank3 = new Bank3();
    }

    private Bank3(){}
    public static Bank3 getBank3(){
        return bank3;
    }
}
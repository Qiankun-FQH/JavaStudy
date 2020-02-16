package jww.qk.team.service;

import com.sun.org.apache.bcel.internal.generic.IFNONNULL;
import jww.qk.team.domain.Architect;
import jww.qk.team.domain.Designer;
import jww.qk.team.domain.Employee;
import jww.qk.team.domain.Programmer;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -15:40
 **/
public class TeamService {
    private static int counter = 1;//自增

    private final int MAX_MENMBER = 5;
    private Programmer[] team = new Programmer[MAX_MENMBER];
    private int total;

    public TeamService() {
    }

    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee e) throws TeamException {
        if(total >= MAX_MENMBER){
            throw  new TeamException("成員已滿，無法添加");
        }

        if(!(e instanceof  Programmer)){
            throw  new TeamException("您不是開發人員，無法添加");
        }

        if(isExit(e)){
            throw new TeamException("該員工已在開發團隊中");
        }

        Programmer p = (Programmer) e;
        if(p.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("該員工已在其他開發團隊中");
        }else if(p.getStatus().getNAME().equals("VOCATION")){
            throw new TeamException("該員工已在其他開發團隊中");
        }

        int numOfArch = 0,numOfDes = 0, numOfPro = 0;
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                numOfArch++;
            }else if(team[i] instanceof Designer){
                numOfArch++;
            }else if(team[i] instanceof Programmer){
                numOfPro++;
            }
        }

        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("該團隊只能有一名架構師");
            }
        }else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("該團隊只能有兩名設計師");
            }
        }else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("該團隊只能有三名程序員");
            }
        }

        team[total++] = p;

        p.setStatus(Status.BUSY);
        p.setNumberId(counter);
    }

    private boolean isExit(Employee e) {
        for(int i=0;i<total;i++){
            if(team[i].getId() == e.getId()){
               return true;
            }
        }
        return false;
    }

    public void removemember(int memberId) throws TeamException {
        int i = 0;
        for(; i < total; i++){
            if(team[i].getNumberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if(i == total){
            throw new TeamException("刪除失敗，找不到"+ memberId
                    + "號的員工");
        }

        for(int j = i + 1; j < total; j++){
            team[j-1] = team[j];
        }

        team[--total] = null;
    }
}

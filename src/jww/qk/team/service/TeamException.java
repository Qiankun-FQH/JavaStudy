package jww.qk.team.service;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -15:08
 **/
public class TeamException extends Exception{
    static final long ser = -2222222222222L;
    public TeamException(){}
    public TeamException(String msg){
        super(msg);
    }
}

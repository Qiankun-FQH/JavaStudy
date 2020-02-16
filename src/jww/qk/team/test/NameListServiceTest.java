package jww.qk.team.test;

import jww.qk.team.domain.Employee;
import jww.qk.team.service.NameListService;
import jww.qk.team.service.TeamException;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -15:12
 **/
public class NameListServiceTest {
    public static void main(String[] args)  {
           NameListService service = new NameListService();
        try {
            Employee employee = service.getEmployee(1000);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}

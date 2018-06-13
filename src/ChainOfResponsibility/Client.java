package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：员工
 */
public class Client {
    public static void main(String[] args) {
        Manager departmentManager = new DepartmentManager();
        Manager majordomo = new Majordomo();
        Manager generalManager = new GeneralManager();

        departmentManager.setNextManage(majordomo);
        majordomo.setNextManage(generalManager);

        Request request = new Request("请假", 2);
        departmentManager.handleRequest(request);

        Request request2 = new Request("加薪", 1500);
        departmentManager.handleRequest(request2);
    }
}

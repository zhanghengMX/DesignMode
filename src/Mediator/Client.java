package Mediator;

/**
 * author：heng.zhang
 * date：2018/6/20
 * description：
 */
public class Client {

    public static void main(String[] args) {
        DepartmentManager departmentManager = new DepartmentManager();
        EmployeeA employeeA = new EmployeeA(departmentManager);
        EmployeeB employeeB = new EmployeeB(departmentManager);

        departmentManager.setEmployeeA(employeeA);
        departmentManager.setEmployeeB(employeeB);

        employeeA.sendMsg("发给employeeB的消息");

        employeeB.sendMsg("发给employeeA的消息");
    }
}

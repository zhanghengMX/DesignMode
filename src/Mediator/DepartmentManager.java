package Mediator;

/**
 * author：heng.zhang
 * date：2018/6/20
 * description：
 */
class DepartmentManager extends Manager{
    private EmployeeA employeeA;
    private EmployeeB employeeB;

    public void setEmployeeA(EmployeeA employeeA) {
        this.employeeA = employeeA;
    }

    public void setEmployeeB(EmployeeB employeeB) {
        this.employeeB = employeeB;
    }

    @Override
    void dealMsg(String msg, Employee sender) {
            if (sender == employeeA) {
                employeeB.notifyMsg(msg);
            } else if (sender == employeeB) {
                employeeA.notifyMsg(msg);
            }
    }
}

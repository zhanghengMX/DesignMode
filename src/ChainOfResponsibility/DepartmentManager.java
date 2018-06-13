package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：部门经理，只能通过3天以内的请假申请
 */
class DepartmentManager extends Manager{
    @Override
    void handleRequest(Request request) {
        if("请假".equals(request.type) && request.value <= 3) {
            System.out.println("请假申请通过——部门经理");
        } else {
            getNextManage().handleRequest(request);
        }
    }
}

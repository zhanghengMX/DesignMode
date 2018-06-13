package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：总经理，处理部门经理和总监无权限的请求
 */
class GeneralManager extends Manager{
    @Override
    void handleRequest(Request request) {
        if("请假".equals(request.type)) {
            if (request.value <= 30) {
                System.out.println("请假申请通过——总经理");
            } else {
                System.out.println("不能请超过30天的假——总经理");
            }
        } else if("加薪".equals(request.type)) {
            if (request.value <= 1000) {
                System.out.println("加薪申请通过——总经理");
            } else {
                System.out.println("考虑一下——总经理");
            }
        }
    }
}

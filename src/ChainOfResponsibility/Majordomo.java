package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：总监，可以处理3天至15天的请假申请，和500以内的加薪申请
 */
class Majordomo extends Manager{
    @Override
    void handleRequest(Request request) {
        if("请假".equals(request.type) && request.value <= 15) {
            System.out.println("请假申请通过——总监");
        } else if("加薪".equals(request.type) && request.value <= 500) {
            System.out.println("加薪申请通过——总监");
        } else {
            getNextManage().handleRequest(request);
        }
    }
}

package ChainOfResponsibility;

/**
 * author：heng.zhang
 * date：2018/6/13
 * description：请求实体类
 */
class Request {
    String type;//请求类型：请假、加工资
    int value; //请求的具体数值

    Request(String type, int value) {
        this.type = type;
        this.value = value;
    }
}

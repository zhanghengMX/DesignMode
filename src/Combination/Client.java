package Combination;

/**
 * author：heng.zhang
 * date：2018/6/10
 * description：
 */
class Client {
    public static void main(String[] args) {
        Component company = new Company("东拉西扯");
        Component administrationDepartment = new Department("行政部");
        Component financeDepartment = new Department("财务部");
        company.addComponent(new Boss());
        company.addComponent(administrationDepartment);
        company.addComponent(financeDepartment);

        administrationDepartment.addComponent(new Employee("梅西"));
        administrationDepartment.addComponent(new Employee("C罗"));

        financeDepartment.addComponent(new Employee("内马尔"));
        financeDepartment.addComponent(new Employee("苏牙"));

        company.describeMyself();
    }
}

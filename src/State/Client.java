package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：
 */
class Client {
    public static void main(String[] args) {
        Room roomA = new Room("1001");
        Room roomB = new Room("9527");

        roomA.checkIn();
        roomA.checkIn();
        roomA.checkOut();
        roomA.reservation();

        roomB.reservation();
        roomB.checkOut();
        roomB.checkIn();
        roomB.cancelBooking();
    }
}

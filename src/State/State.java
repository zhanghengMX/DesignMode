package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：状态接口
 */
interface State {
    void reservation(Room room);

    void checkIn(Room room);

    void cancelBooking(Room room);

    void checkOut(Room room);
}

package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：预定状态，可以响应取消预定、入住
 */
class ReservationState implements State{

    @Override
    public void reservation(Room room) {
        System.out.println(String.format("%s房间已经被预定",room.getRoomNO()));
    }

    @Override
    public void checkIn(Room room) {
        System.out.println(String.format("入住%s房间，房间%s改为入住状态", room.getRoomNO(),room.getRoomNO()));
        room.setCurrentState(room.getCheckInState());
    }

    @Override
    public void cancelBooking(Room room) {
        System.out.println(String.format("退订%s房间，房间%s改为空闲状态", room.getRoomNO(),room.getRoomNO()));
        room.setCurrentState(room.getIdleState());
    }

    @Override
    public void checkOut(Room room) {
        System.out.println(String.format("%s房间仅预定，暂无入住，不能退房",room.getRoomNO()));
    }
}

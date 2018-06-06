package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：空闲状态，可以响应预定、入住
 */
class IdleState implements State{

    @Override
    public void reservation(Room room) {
        System.out.println(String.format("预定%s房间，房间%s改为预定状态", room.getRoomNO(),room.getRoomNO()));
        room.setCurrentState(room.getReservationState());
    }

    @Override
    public void checkIn(Room room) {
        System.out.println(String.format("入住%s房间，房间%s改为入住状态", room.getRoomNO(),room.getRoomNO()));
        room.setCurrentState(room.getCheckInState());
    }

    @Override
    public void cancelBooking(Room room) {
        System.out.println(String.format("%s房间未被预定，不能退订",room.getRoomNO()));
    }

    @Override
    public void checkOut(Room room) {
        System.out.println(String.format("%s房间没有客人入住，不能退房",room.getRoomNO()));
    }
}

package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：入住状态，可以响应退房
 */
class CheckInState implements State{
    @Override
    public void reservation(Room room) {
        System.out.println(String.format("%s房间已经有客人入住定",room.getRoomNO()));
    }

    @Override
    public void checkIn(Room room) {
        System.out.println(String.format("%s房间已经有客人入住",room.getRoomNO()));
    }

    @Override
    public void cancelBooking(Room room) {
        System.out.println(String.format("%s房间已经入住，不能退订",room.getRoomNO()));
    }

    @Override
    public void checkOut(Room room) {
        System.out.println(String.format("%s房间退房，房间%s改为空闲状态", room.getRoomNO(),room.getRoomNO()));
        room.setCurrentState(room.getIdleState());
    }
}

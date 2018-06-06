package State;

/**
 * author：heng.zhang
 * date：2018/6/6
 * description：
 */
class Room {
    private State idleState;
    private State reservationState;
    private State checkInState;

    private State currentState;

    private String roomNO;

    public Room(String roomNO) {
        this.roomNO = roomNO;
        idleState = new IdleState();
        reservationState = new ReservationState();
        checkInState = new CheckInState();

        currentState = idleState;
    }

    public String getRoomNO() {
        return roomNO;
    }

    public void setRoomNO(String roomNO) {
        this.roomNO = roomNO;
    }

    public State getIdleState() {
        return idleState;
    }

    public void setIdleState(State idleState) {
        this.idleState = idleState;
    }

    public State getReservationState() {
        return reservationState;
    }

    public void setReservationState(State reservationState) {
        this.reservationState = reservationState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //预定房间
    public void reservation() {
        currentState.reservation(this);
    }

    //取消预定
    public void cancelBooking() {
        currentState.cancelBooking(this);
    }

    //入住
    public void checkIn() {
        currentState.checkIn(this);
    }

    //退房
    public void checkOut() {
        currentState.checkOut(this);
    }
}

public abstract class Room {
    private int roomNumber;
    private int maxPeople;
    private int pricePerNight;
    private boolean isReserved;

    public Room(int roomNumber, int maxPeople, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.maxPeople = maxPeople;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }

    public int getRoomNumber() { return roomNumber; }
    public int getMaxPeople() { return maxPeople; }
    public int getPricePerNight() { return pricePerNight; }
    public boolean isReserved() { return isReserved; }
    public void setReserved(boolean reserved) { isReserved = reserved; }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + roomNumber +
                ", maxPeople=" + maxPeople +
                ", price=" + pricePerNight +
                ", reserved=" + isReserved +
                '}';
    }
}
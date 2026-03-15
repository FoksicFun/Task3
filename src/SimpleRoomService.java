public class SimpleRoomService implements RoomService<Room> {

    @Override
    public void clean(Room room) {
        System.out.println("Комната №" + room.getRoomNumber() + " очищена.");
    }

    @Override
    public void reserve(Room room) throws RoomAlreadyReservedException {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException(
                    "Комната №" + room.getRoomNumber() + " уже забронирована!"
            );
        }
        room.setReserved(true);
        System.out.println("Комната №" + room.getRoomNumber() + " забронирована.");
    }

    @Override
    public void free(Room room) {
        room.setReserved(false);
        System.out.println("Комната №" + room.getRoomNumber() + " освобождена.");
    }
}
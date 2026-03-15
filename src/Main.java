public class Main {
    public static void main(String[] args) {
        RoomService<Room> service = new SimpleRoomService();

        // Создаём разные комнаты
        Room economy = new EconomyRoom(101);
        Room standard = new StandardRoom(102);
        Room lux = new LuxRoom(103);
        Room ultraLux = new UltraLuxRoom(104);

        System.out.println("Очистка комнат");
        service.clean(economy);
        service.clean(standard);
        service.clean(lux);
        service.clean(ultraLux);

        System.out.println("\nБронирование");
        service.reserve(economy);
        service.reserve(standard);

        System.out.println("\nПопытка повторного бронирования");
        try {
            service.reserve(economy);
        } catch (RoomAlreadyReservedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\nОсвобождение");
        service.free(economy);
        service.free(standard);

        System.out.println("\nПовторное бронирование после освобождения");
        service.reserve(economy);
    }
}
interface RestaurantMeal {
    String name = "Streak Dinner";
    double price = 600;
}
interface HotelService {
    String serviceName = "Room Service";
    double fee = 24;
    int roomNumber = 1202;
}
class RoomServiceMeal implements RestaurantMeal, HotelService {
    void display() {
        System.out.println("A '"+name+"' costing Rs. "+price+" is a '"+serviceName+"' provided to room "+roomNumber+" for Rs "+fee+" fee");
    }
    public static void main(String[] args) {
        RoomServiceMeal a = new RoomServiceMeal();
        a.display();
    }
}

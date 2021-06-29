import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;

    private List<Item> menu = new ArrayList<Item>();
    public List<String> order=new ArrayList<String>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    //>>>>>>>>>>>>METHOD FOR RESTAURANT OPEN/CLOSE<<<<<<<<<<<<<<

    public boolean isRestaurantOpen() {
        LocalTime currentTime=getCurrentTime();

        return currentTime.isAfter(openingTime) && currentTime.isBefore(closingTime);

    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    //>>>>>>>>>>>>>METHOD TO GET MENU<<<<<<<<<<<<<<<<<<<<

    public List<Item> getMenu() {
        return menu;
    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

    //>>>>>>>>METHOD TO DISPLAY TOTAL AMOUNT OF THE ORDER<<<<<<<<<<<<<

    public int totalAmount(List<String> order) {
        int total=0;
        int itemPrice;

        for(String name:order){
            itemPrice=findItemByName(name).getPrice();
            total+=itemPrice;
        }
        return total;

    }

}

public class Items implements Sellable{
    private String description;
    private int price;

    private int lowestPrice;
    private boolean available;

    public Items(String desc, int pr, boolean av){
        description = desc;
        price = price;
        available = av;
    }

    public String getDescription() {
        return description;
    }
    public int getPrice(){
        return price;
    }
    public boolean isAvailable(){
        return available;
    }
    public int getLowestPrice(){
        return price/2;
    }
}

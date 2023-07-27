public class Flower {
    private String name;
    private int petalNum;
    private double price;


    public Flower(String n, int pN, double pr){
       this.name = n;
       this.petalNum = pN;
       this.price = pr;
    }


    public String getName(){
        return name;
    }
    public int getPetals(){return petalNum;}

    public double getPrice(){return price;}


    public double updatePrice(double amount){
        price += amount;
        return price;
    }

    public String setName(String newName){
        this.name = newName;
        return name;
    }

    public int setPetals(int number){
        petalNum += number;
        return petalNum;
    }


    public static void main (String[] args){
        Flower Sunflower = new Flower("sunflower", 6, 44.5);

        System.out.println("flower name :"+ Sunflower.getName());
        System.out.println("petal number : " + Sunflower.getPetals());
        System.out.println("price: "+Sunflower.getPrice());

        Sunflower.updatePrice(400.4);
        System.out.println("updated price is : "+ Sunflower.getPrice());
    }
}

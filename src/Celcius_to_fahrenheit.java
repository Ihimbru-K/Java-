public class Celcius_to_fahrenheit {


    public static double converter(int celcius){
        return (celcius*1.8)+32;
    }


    public static void main(String[] args){
        System.out.println(converter(45));
    }
}

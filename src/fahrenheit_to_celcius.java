public class fahrenheit_to_celcius {

    public static double convert(double f){
        return (f-32)*(5.0/9.0);
    }

    public static void main(String[] args){

        System.out.println(convert(350.0));

    }
}

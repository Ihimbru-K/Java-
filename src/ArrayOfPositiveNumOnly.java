import java.lang.constant.Constable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ArrayOfPositiveNumOnly {



    public static class ArrP{
        private List<Integer> Arr;

        public ArrP(){Arr = new ArrayList<>();}
        public void add(int e){
            Arr.add(e);

        }
        public List<Integer> RemoveNegative (){
            for (int i = Arr.size()-1; i>=0; i--){
                if(Arr.get(i)<0){
                    Arr.remove(i);
                }
            }
            return Arr;
        }

        @Override
        public String toString(){
            return "Elements of array are : "+Arr.toString();
        }

    }


//    static List<Integer> arrlist = new ArrayList<>();
//
//    public static <arrlist> ArrayList<Integer> PositiveArr(arrlist arr){
//
//        for(Object l : arrlist){
//            System.out.println(l);
//        }
//        return arrlist;
//    }


    public static void main(String[] args){
        ArrP negativeArr = new ArrP();
        negativeArr.add(1);
        negativeArr.add(2);
        negativeArr.add(3);
        negativeArr.add(4);
        negativeArr.add(5);
        negativeArr.add(6);
        negativeArr.add(7);
        negativeArr.add(8);
        negativeArr.add(9);
        negativeArr.add(10);


        System.out.println(negativeArr.RemoveNegative().toString());

        System.out.println(negativeArr.toString());




    }


}

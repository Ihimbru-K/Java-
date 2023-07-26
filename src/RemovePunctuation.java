public class RemovePunctuation {

    public static String removePunctuation(String phrase){
        StringBuilder word = new StringBuilder();
        word.append(phrase);

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c == '\'' || c == ',' || c == '!' || c == '.' || c == '-'){
                word.deleteCharAt(i);
                i--;
            }

        }
        String realword = word.toString();
        return realword;

        
    }


    public static String RemovePunctuation2(String word){
        word.replace("'","");
        word.replace(",", "");
        word.replace("-", "");
        word.replace(".", "");

        return word;
    }

    public static void main(String[] args){

        System.out.println(removePunctuation("John-Mike's sister is sleeping. Wake her up !"));
        System.out.println(RemovePunctuation2("John-Mike's sister is sleeping. Wake her up !"));
    }
}

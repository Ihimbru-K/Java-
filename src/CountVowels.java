public class CountVowels {

    public static int CountVowels(String word){
        int wordCount = 0;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c=='E' || c == 'I' || c == 'O' || c == 'U')
                wordCount ++;
        }
        return wordCount;
    }

    public static int CountVowels2(String word){
        int wc = 0;
        for(int j = 0; j < word.length(); j++){
            char c = word.charAt(j);
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    wc ++;
                    break;
                default:
                    break;
            }

        }
        return wc;
    }



    public static void main(String[] args){
        System.out.println(CountVowels("BAzoooookae"));
        System.out.println(CountVowels2("Abracadabra"));
    }

}

public class EbookReader {

    public static class Ebook{
        private String title;
        private String author;
        private String publicationDate;
        private int price;

        public Ebook(String ti, String auth, String pubd, int pr){

            this.title = ti;
            this.author = auth;
            this.publicationDate = pubd;
            this.price = pr;
        }

        public String getTitle(){
            return title;
        }

        public int getPrice(){
            return price;

        }

        public void setPrice(int pr){
            price += pr;
        }

        public void setTitle(String tit){
            title = tit;
        }
    }
}

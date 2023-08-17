public class ClassA {
    protected String name;

    public ClassA(){
        this.name = name;
    }

    public class ClassB extends ClassA{

        public ClassB(String name) {
            super();
        }
    }

    public class ClassC extends ClassB{

        public ClassC(String name) {
            super(name);
        }

        public void setName(String nm){
            super.name = nm;
        }

        public String getName(){
            return super.name;
        }



    }


    public static void main(String[] args){

ClassC myClass = new ClassA().new ClassC("Ihimbru");
        System.out.println("Your name is "+myClass.getName());

        myClass.setName("Kanyimi");
        System.out.println("Your other name is "+myClass.getName());
    }

}


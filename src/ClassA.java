public class ClassA {
    protected String name;

    public ClassA(String name){
        name = this.name;
    }

    public class ClassB extends ClassA{

        public ClassB(String name) {
            super(name);
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

}

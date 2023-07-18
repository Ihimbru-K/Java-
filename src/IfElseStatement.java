public class IfElseStatement {
    public static void main (String[] args){
        Instruction("open");
        Instruction("nothing");
        Instruction("nothing");

    }

    public static void Instruction(String instr){
        if(instr.equals("open")){
            System.out.println("Opening door");
        }
        else if(instr.equals("close")){
            System.out.println("closing door");
        }
            else{System.out.println("no action");
        }

    }
}

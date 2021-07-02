package javaexample18somelogicoperators;

public class JavaExample18SomeLogicOperators {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("--- Logic AND operation ---");
        System.out.println("true AND false: " + (b1 & b2));
        System.out.println("true AND true: " + (b1 & b3));
        System.out.println("false AND true: " + (b2 & b3));
        System.out.println("false AND false: " + (b2 & b4));
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("%%% Logic OR operation %%%");
        System.out.println("true OR false: " + (b1 | b2));
        System.out.println("true OR true: " + (b1 | b3));
        System.out.println("false OR true: " + (b2 | b3));
        System.out.println("false OR false: " + (b2 | b4));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();

        System.out.println("### Logic OR operation ###");
        System.out.println("true XOR false: " + (b1 ^ b2));
        System.out.println("true XOR true: " + (b1 ^ b3));
        System.out.println("false XOR true: " + (b2 ^ b3));
        System.out.println("false XOR false: " + (b2 ^ b4));
        System.out.println("##########################");
        System.out.println();

        System.out.println("*** Logic NOT operation ***");
        System.out.println("NOT false: " + (!b2));
        System.out.println("NOT true: " + (!b1));
        System.out.println("**************************");
        System.out.println();
        
        

    }

}

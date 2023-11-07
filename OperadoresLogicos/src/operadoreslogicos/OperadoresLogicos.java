package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        System.out.println("Operadores Lógicos: ");
        System.out.println("A=3, B=4, C=5 \n");
        boolean and = (a < b && b < c) ? true : false;
        System.out.println("AND: " + and);
        boolean not = (and == false) ? true : false;
        System.out.println("NOT: " + not);
        boolean or = (a < b || b < c) ? true : false;
        System.out.println("OR: " + or);
        boolean xor = (a < b ^ b < c) ? true : false;
        System.out.println("XOR: " + xor);
        
        System.out.println("\n=============================\n");
    }

}

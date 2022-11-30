public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(4,5));
        System.out.println(calculator.subtraction(4,5));
    }
}

class Calculator {
    public int add (int numberA, int numberB){
        return numberA + numberB;
    }

    public int subtraction (int numberA, int numberB) {
        return numberA - numberB;
    }
}
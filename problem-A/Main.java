public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(1, -5);
        cal.setB(1);
        try {
            System.out.println("Add " + cal.Add());
            System.out.println("Subtract " + cal.Subtract());
            System.out.println("Multiplication "  + cal.Multiplay());
            System.out.println("Division " + cal.Divison());
        }
        catch (ArithmeticException a){
            System.out.println("Are you sure you entered the correct numbers? Your numbers must not be negative or zero.");
        }
    }
}

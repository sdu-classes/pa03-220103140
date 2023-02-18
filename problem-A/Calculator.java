public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Calculator(){

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Add() throws ArithmeticException{
        if(a < 0 || b < 0)throw new ArithmeticException();
        return a + b;
    }
    public int Subtract(){
        if(a < 0 || b < 0)throw new ArithmeticException();
        return a - b;
    }
    public int Multiplay(){
        if(a == 0 || b == 0)throw new ArithmeticException();
        return a * b;
    }
    public int Divison(){
        if(a == 0 || b == 0)throw new ArithmeticException();
        return a / b;
    }
}

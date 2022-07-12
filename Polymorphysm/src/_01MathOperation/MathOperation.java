package _01MathOperation;

public class MathOperation implements Mathable{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}

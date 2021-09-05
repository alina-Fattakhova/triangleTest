public class Triangle {
    //треугольник равнобедренный!
    private int a;
    private int b;
    private int c;
    private double p;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double ploschadTreugolnika() {
        if (a == 0 || b == 0 || c == 0) {
            throw new ArithmeticException("At least one side of given triangle is zero! Check your parameters.");
        } else if (a < 0 || b < 0 || c < 0) {
            throw new ArithmeticException("One or more sides of given triangle are negative! Check your parameters.");
        }
        p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void info() {
        System.out.println("Ploschad treugolnika = " + ploschadTreugolnika());
    }

    public static void main(String[] args) {
        Triangle t1= new Triangle();
        System.out.println(t1.ploschadTreugolnika());

    }
}


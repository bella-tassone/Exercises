public class Complex {

    private double real;
    private double imaginary;

    public Complex(double r) {
        real = r;
        imaginary = 0.0;
    }

    public Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public double abs() {
        double sum = Math.pow(real, 2) + Math.pow(imaginary, 2);
        sum = Math.sqrt(sum);
        return sum;
    }

    public Complex add(Complex other) {
        double x = (this.real + other.real);
        double y = (this.imaginary + other.imaginary);
        Complex sum = new Complex(x, y);
        return sum;
    }

    public Complex addConstant(double other) {
        double x = (this.real + other);
        double y = this.imaginary;
        Complex sum = new Complex(x, y);
        return sum;
    }

    public Complex multiply(Complex other) {
        double a = (this.real * other.real) + (this.imaginary * other.imaginary * -1.0);
        double b = (this.real*other.imaginary) + (this.imaginary*other.real);
        Complex product = new Complex(a, b);
        return product;
    }

    public Complex multiplyConstant(double other) {
        double a = (this.real * other);
        double b = (this.imaginary * other);
        Complex product = new Complex(a, b);
        return product;
    }

    public String toString() {
            return (real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex a = new Complex(6.5, 4);
        Complex b = new Complex(8,-2.75);
        Complex c = new Complex(1.5);
        System.out.println(a.abs());
        System.out.println(b.abs());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.addConstant(8.6));
        System.out.println(a.multiplyConstant(8.0));
        System.out.println(c.multiplyConstant(4.0));
    }
}

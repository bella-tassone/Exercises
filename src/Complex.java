//Isabella Tassone              3B                  February 11, 2020

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

    public Complex add(double other) { //overloaded method
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

    public Complex multiply(double other) { //overloaded method
        double a = (this.real * other);
        double b = (this.imaginary * other);
        Complex product = new Complex(a, b);
        return product;
    }

    public String toString() {
            return (real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex a = new Complex(6.5, 4.25);
        Complex b = new Complex(1.5,2.75);
        Complex c = new Complex(1.5);
        System.out.println(a.abs());
        System.out.println(b.abs());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.add(8.6));
        System.out.println(c.add(13.3));
        System.out.println(a.multiply(8.0));
        System.out.println(b.multiply(4.5));
        System.out.println(c.multiply(3.0));
    }
}

/* OUTPUT:

7.766112283504533
3.132491021535417
8.0 + 7.0i
-1.9375 + 24.25i
15.1 + 4.25i
14.8 + 0.0i
52.0 + 34.0i
6.75 + 12.375i
4.5 + 0.0i

 */
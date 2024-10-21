package task_x;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public int getReal() {
        return this.real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void displayInfo() {
        System.out.println("Complex number is looking like this: " + this.real + " + " + this.imaginary + "*i.");
    }

}

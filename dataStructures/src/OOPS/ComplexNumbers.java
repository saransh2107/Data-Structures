package OOPS;

public class ComplexNumbers {
	private int real;
	private int imaginary;
	
	public ComplexNumbers(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void plus(ComplexNumbers c1) {
		
		this.real=this.real+c1.real;
		this.imaginary=this.imaginary+c1.imaginary;
	}
	public void multiply(ComplexNumbers c1) {
		int x=(this.real*c1.real)-(this.imaginary*c1.imaginary);
		int y=(this.real*c1.imaginary)+(this.imaginary*c1.real);
		this.real=x;
		this.imaginary=y;
	}
	public void print() {
		String x=Integer.toString(real)+" + "+"i"+Integer.toString(imaginary);
		System.out.println(x);
	}

}

class ComplexNumber
{
private double real; 
private double imag;

public double getReal() { return this.real; }

public double getImag() { return this.imag; }

public void setReal(double real) { this.real = real; }

public void setImag(double imag) { this.imag = imag; }

public boolean isEqual(ComplexNumber other)
{

boolean b1 = this.real == other.real; 

boolean b2 = this.imag == other.imag; 

return b1 && b2;
} 

public ComplexNumber add(ComplexNumber other)
{
ComplexNumber cN = new ComplexNumber();
cN.setReal( this.getReal() + other.getReal());
cN.setImag(this.getImag() + other.getImag());
return cN;
} 

public ComplexNumber sub(ComplexNumber other)
{
ComplexNumber cN = new ComplexNumber();
cN.setReal( this.getReal() - other.getReal());
cN.setImag(this.getImag() - other.getImag());
return cN;
}

public void display()
{
System.out.println(" Real Part : " + real);
System.out.println("Imaginary Part : " + imag);
}
}

class ComplexNumberTest
{
public static void main(String args[])
{

ComplexNumber cn1 = new ComplexNumber();

cn1.display();

cn1.setReal(10.5);

cn1.setImag(20.5);

cn1.display();

ComplexNumber cn2 = new ComplexNumber();

cn2.setReal(10.5);

cn2.setImag(20.5);

boolean bb = cn1.isEqual(cn2);
System.out.println(bb);
ComplexNumber cn3 = cn1.add(cn2);
cn3.display();
ComplexNumber cn4 = cn1.sub(cn2); 
cn4.display();
ComplexNumber cn5 = cn2.sub(cn1); 
cn5.display();
}
}
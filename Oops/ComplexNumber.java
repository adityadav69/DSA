public class ComplexNumber {

    public static void print(Complex a){
        System.out.println(a.real+" + i("+a.imag+")");
    }
    public static Complex add(Complex a,Complex b){
        Complex c=new Complex();
        c.real=(a.real+b.real);
        c.imag=(a.imag+b.imag);
        return c;
    }
    public static Complex sub(Complex a,Complex b){
        Complex c=new Complex();
        c.real=(a.real-b.real);
        c.imag=(a.imag-b.imag);
        return c;
    }
    public static Complex mul(Complex a,Complex b){
        Complex c=new Complex();
        c.real=(a.real*b.real);
        c.imag=(a.imag*b.imag);
        return c;
    }

    public static void main(String[] args) {
        Complex c1=new Complex(4, 2);
        Complex c2=new Complex(2, 2);

        print(c1);
        print(c2);
        Complex result=new Complex();
        result=add(c1, c2);
        print(result);
        result=sub(c1, c2);
        print(result);


    }
}

class Complex{
    int real;
    int imag;
    Complex(){

    }

    Complex(int r,int i){
        this.real=r;
        this.imag=i;
    }
 
}
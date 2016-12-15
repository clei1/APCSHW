/*
Connie Lei
APCS1 pd1
HW37 -- Be More Rational
2016-11-30
*/

public class Rational {
    int num;
    int den;
    
    public Rational () {
	num = 0;
	den = 1;
    }

    public Rational (int numb, int deno){
	num = numb;
	den = deno;
	if (deno == 0){
	    System.out.println("Invalid denominator attempted.");
	    num = 0;
	    den = 1;
	}
    }

    public String toString(){
	String ratNumb;
	ratNumb = num + "/" + den;
	return ratNumb;
    }
    
    public int getNum(){
	return num;
    }
    
    public int getDen(){
	return den;
    }

    public double floatValue(){
	double x;
	x = (double) (num) / den;
	return x;
    }
    
    public void multiply(Rational a){
	num = num * a.getNum();
	den = den * a.getDen();
    }
    
    public void divide(Rational a){
	if (a.getNum() == 0){ }
	else {
	    num = num * a.getDen();
	    den = den * a.getNum();
	}
    }

    public void add(Rational a){
	num = a.getNum() * den + num * a.getDen();
	den = a.getDen() * den;	
    }

    public void subtract(Rational a){
	num = num * a.getDen() = a.getNum() * den;
	den = a.getDen() * den;
    }

    public int gcd(){
	int a = den;
	int b = num;
	if (num > den){
	    a = num;
	    b = den;
	}
	while (a % b != 0) {
	    int temp = a;
	    a = b;
	    b = temp % b;
	}
	return b;
    }

    public void reduce(){
	den = den / gcd();
	nom = nom / gcd();
    }

    public static int gcd(int denom, int numer){
	int a = denom;
	int b = numer;
	if (numer > denom){
	    a = numer;
	    b = denom;
	}
	while (a % b != 0) {
	    int temp = a;
	    a = b;
	    b = temp % b;
	}
	return b;
    }

    public int compareTo(Rational a){
	if (a.floatValue() == floatValue()){
	    return 0;
	}
	if(a.floatValue() > floatValue()){
	    return 1;
	}
	return -1;
    }
      
}

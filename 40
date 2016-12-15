/*
Connie Lei
APCS1 pd1
HW40 -- Rational Equality
2016-12-06
*/

public class Rational implements  Comparable{
    int num;
    int den;
    
    public Rational() {
	num = 0;
	den = 1;
    }

    public Rational(int numb, int deno){
	this();
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
	num = num * a.getDen() - a.getNum() * den;
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
	num = num / gcd();
    }

    public static int gcd(int denum, int numer){
	int a = denum;
	int b = numer;
	if (numer > denum){
	    a = numer;
	    b = denum;
	}
	while (a % b != 0) {
	    int temp = a;
	    a = b;
	    b = temp % b;
	}
	return b;
    }

    public int compareTo(Object a){
		Rational b = (Rational) a;
		if (b.getDen() * num > b.getNum() * den){
			return -1;
		}
		if(b.getDen() * num < b.getNum() * num){
			return 1;
		}
		return 0;
    }
	
	public boolean equals(Object a){
		return (a instanceof Rational && this.compareTo(a) == 0);
	}
    
	public static void main(String[] args){
		Rational s = new Rational(1,2);
		Rational t = new Rational(2,4);
		System.out.println(t.equals(s));
	}
}

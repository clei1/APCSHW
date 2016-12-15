/*
Connie Lei
APCS1 pd1
HW36 -- Be Rational
2016-11-28
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
}

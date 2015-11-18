public class Driver {

    public static void main( String[] args ) {
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
	t.reduce(); //Changes t to 2/9

	System.out.println(r);
	System.out.println(s);
	System.out.println(t);
	r.subtract(s);
	r.reduce();
	System.out.println(r);
    }
}

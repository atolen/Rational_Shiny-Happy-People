public class Rational {
    // instvars
    private int numerator;
    private int denominator;

    // constructors
    public Rational() {
	setNumerator( 0 );
	setDenominator( 1 );
    }

    public Rational( int n, int d ) {
	this();
	if( d != 0 ) {
	    setNumerator( n );
	    setDenominator( d );
	}
    } // close Rational(n,d)

    // accessors
    public int getNumerator() {
	return numerator;
    }

    public int getDenominator() {
	return denominator;
    }
    
    // mutators
    public void setNumerator( int n ) {
	numerator = n;
    }

    public void setDenominator( int d ) {
	denominator = d;
    }

    // other methods
    public String toString() {
	String retStr = numerator + "/" + denominator;
	return retStr;
    }

    public double floatValue() {
	double retDub = (double)numerator / denominator;
	return retDub;
    }
    
    public void multiply( Rational r ) {
	int n = this.numerator * r.getNumerator();
	int d = this.denominator * r.getDenominator();
	this.setNumerator( n );
	this.setDenominator( d );
    }
    
	
    public void divide( Rational r ) {
       	int n = this.numerator * r.denominator;
	int d = this.denominator * r.numerator;
	this.setNumerator( n );
	this.setDenominator( d );
    }
    
} // close class Rational

	    

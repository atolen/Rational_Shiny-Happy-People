<<<<<<< HEAD
/* Team Angry Inch -- Anna Tolen
APCS1 pd10
HW33 -- Do You Even Add, Bro?
2015-11-18 */

public class Rational {
    // instvars
    private int n;
    private int d;

    // constructors
    public Rational() {
	setN( 0 );
	setD( 1 );
=======
/* Team Shiny Happy People -- Shamaul Dilmohamed, Anna Tolen
APCS1 pd10
HW32 -- Irrationality Stops Here
2015-11-17 */

public class Rational {
    // instvars
    private int numerator;
    private int denominator;

    // constructors
    public Rational() {
	setNumerator( 0 );
	setDenominator( 1 );
>>>>>>> 43eeb7414121ec5bbf65193b448c28b1e7343ea7
    }

    public Rational( int n, int d ) {
	this();
	if( d != 0 ) {
<<<<<<< HEAD
	    setN( n );
	    setD( d );
	}
    } // close Rational(n,d)
  
    // mutators
    public void setN( int newN ) {
	n = newN;
    }

    public void setD( int newD ) {
	d = newD;
=======
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
>>>>>>> 43eeb7414121ec5bbf65193b448c28b1e7343ea7
    }

    // other methods
    public String toString() {
<<<<<<< HEAD
	String retStr = n + "/" + d;
=======
	String retStr = numerator + "/" + denominator;
>>>>>>> 43eeb7414121ec5bbf65193b448c28b1e7343ea7
	return retStr;
    }

    public double floatValue() {
<<<<<<< HEAD
	double retDub = (double)n / d;
=======
	double retDub = (double)numerator / denominator;
>>>>>>> 43eeb7414121ec5bbf65193b448c28b1e7343ea7
	return retDub;
    }
    
    public void multiply( Rational r ) {
<<<<<<< HEAD
	int n = this.n * r.n;
	int d = this.d * r.d;
	this.setN( n );
	this.setD( d );
    }
	
    public void divide( Rational r ) {
       	int n = this.n * r.d;
	int d = this.d * r.n;
	this.setN( n );
	this.setD( d );
    }

    public void add( Rational r ) {
	this.setN( (this.n * r.d) + (r.n * this.d) );
	this.setD( this.d * r.d );	
    }

    public void subtract( Rational r ) {
	this.setN( (this.n * r.d) - (r.n * this.d) );
	this.setD( this.d * r.d );
    }

    // employs Euclid's algorithm iteratively
    public int gcd( int a, int b ) {
	int c = (a % b);
	while( c != 0 ) {
	    a = b;
	    b = c;
	    c = (a % b);
	} 
	return b;
    } 

    
    public void reduce() {
	int n = this.n;
	int d = this.d;
	
	int gcd = gcd( Math.max(n,d) , Math.min(n,d) );
	setN( n / gcd );
	setD( d / gcd );
=======
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
>>>>>>> 43eeb7414121ec5bbf65193b448c28b1e7343ea7
    }
    
} // close class Rational

	    

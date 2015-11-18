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
    }
    // mutators
    public void setN( int newN ) {
	n = newN;
    }

    public void setD( int newD ) {
	d = newD;
    }

    // other methods
    public String toString() {
	String retStr = n + "/" + d;
	return retStr;
    }

    public double floatValue() {
	double retDub = (double)n / d;
	return retDub;
    }
    
    public void multiply( Rational r ) {
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
	int gcd = gcd( Math.max(n,d) , Math.min(n,d) );
	setN( n / gcd );
	setD( d / gcd );
    }
        
} // close class Rational

	    

public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    super( ((double) nume) / deno);
    if(deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if(deno < 0 && nume > 0) {
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else if(deno < 0 && nume < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue() {
    double result = (double)numerator/denominator;
    return result;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    int newNume = getNumerator();
    int newDeno = getDenominator();
    RationalNumber reciprocal = new RationalNumber(newDeno, newNume);
    return reciprocal;
  }

  public boolean equals(RationalNumber other) {
    return(this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator());
  }

  public String toString() {
    return(numerator + "/" + denominator);
  }

  public static int gcd(int a, int b) {
    int gcd = 0;
    for(int i = 1; i <= a && i <= b; i++) {
          if(a % i == 0 && b % i == 0)
              gcd = i;
    }
    return gcd;
  }

}

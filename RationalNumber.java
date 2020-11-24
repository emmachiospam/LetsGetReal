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

}

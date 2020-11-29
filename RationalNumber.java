public class RationalNumber extends Number{
  private int numerator, denominator;

  public RationalNumber (int nume, int deno) {
    if(deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else if(deno < 0 && nume > 0) {
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    }
    else if(deno < 0 && nume < 0) {
      numerator = nume * -1;
      denominator = deno * -1;
      reduce();
    }
    else{
      numerator = nume;
      denominator = deno;
      reduce();
    }
  }

  public double getValue() {
    double result = (double)numerator/denominator;
    if(denominator == 1) {
      return numerator;
    }
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
    if(numerator == 0) {
      return "0";
    }
    if(denominator == 1) {
      return (numerator + "");
    }
    return(numerator + "/" + denominator);
  }

  public static int gcd(int a, int b) {
    int gcd = 1;
    for(int i = 1; i <= a && i <= b; i++) {
          if(a % i == 0 && b % i == 0)
              gcd = i;
    }
    return gcd;
  }

  private void reduce() {
    int gcdValue = gcd(Math.abs(numerator), Math.abs(denominator));
    int newNum = numerator / gcdValue;
    numerator = newNum;
    int newDeno = denominator / gcdValue;
    denominator = newDeno;
  }

  public RationalNumber multiply(RationalNumber other){
    int productNume = this.getNumerator() * other.getNumerator();
    int productDeno = this.getDenominator() * other.getDenominator();
    RationalNumber product = new RationalNumber(productNume, productDeno);
    return product;
  }

  public RationalNumber divide(RationalNumber other){
    int quotientNume = this.getNumerator() * other.getDenominator();
    int quotientDeno = this.getDenominator() * other.getNumerator();
    RationalNumber quotient = new RationalNumber(quotientNume, quotientDeno);
    return quotient;
  }

  public RationalNumber add(RationalNumber other){
    int sumDeno = this.getDenominator() * other.getDenominator();
    int sumNume1 = this.getNumerator() * other.getDenominator();
    int sumNume2 = other.getNumerator() * this.getDenominator();
    int sumFinal = sumNume1 + sumNume2;
    RationalNumber sum = new RationalNumber(sumFinal, sumDeno);
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    int differenceDeno = this.getDenominator() * other.getDenominator();
    int differenceNume1 = this.getNumerator() * other.getDenominator();
    int differenceNume2 = other.getNumerator() * this.getDenominator();
    int differenceFinal = differenceNume1 - differenceNume2;
    RationalNumber difference = new RationalNumber(differenceFinal, differenceDeno);
    return difference;
  }

}

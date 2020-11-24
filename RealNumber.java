public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other) {
    double a = other.getValue();
    double b = this.getValue();
    if(a == 0 && b == 0) {
      return true;
    }
    else if (((Math.abs(a - b))/a) < 0.00001) {
      return true;
    }
    else {
      return false;
    }
  }

}

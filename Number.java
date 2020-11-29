public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other) {
    double thisValue = this.getValue();
    double otherValue = other.getValue();
    if(thisValue == otherValue) {
      return 0;
    }
    else if (thisValue < otherValue) {
      return -1;
    }
    else{
      return 1;
    }
  }

  public boolean equals(Number other) {
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
//

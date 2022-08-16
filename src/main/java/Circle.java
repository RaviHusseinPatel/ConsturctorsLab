public class Circle {
    double radius;
    double circumfrence;

public void setRadius (double newRadius) {
    radius = newRadius;
}
 public Circle (double newRadiusSize, double newCircumfrenceSize) {

     this.radius = newRadiusSize;
     this.circumfrence = newCircumfrenceSize;
 }


 double getRadius () {
     return this.radius;
 }
public double getCircumfrence() {
     return this.radius * 2 * 3.149;
}






}

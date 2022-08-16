public class Rectangle {

    double length;
    double width;

    public void setSize (double rectangleLength, double rectangleWidth) {
        width= rectangleWidth;
        length= rectangleLength;
    }

   double getLength(){
        return this.length;
   }
   double getWidth(){
        return this.width;
   }
   void setLength(double newlength){
        length= newlength;
   }
   void setWidth (double newwidth){
        width= newwidth;
   }

   double getPerimeter(){
        return this.length * 2 + 2 * width;
   }

   double getArea (){
        return this.length * width;
   }

}

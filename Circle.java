public class Circle {

  private double radius;
  private double x;
  private double y;

  public Circle(double radius, double x, double y){
    
   this.radius = radius;
   this.x = x;
   this.y = y;
    
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double getRadius(){
    return radius;
  }
  public void setX(double x){
    this.x = x;
  }
  public void setY(double y){
    this.y = y;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getArea(){
    return Math.PI * Math.pow(radius, 2);
  }
  public boolean doesOverlap(Circle otherCircle){
    double distanceBetween = Math.sqrt(Math.pow(otherCircle.getX() - this.x, 2) +     
                             Math.pow(otherCircle.getY() - this.y, 2));
    double sumRadius = this.radius + otherCircle.getRadius();
    return sumRadius >= distanceBetween;
  }
    
}

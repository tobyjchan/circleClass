class Main {
  public static void main(String[] args) {

    Circle c1 = new Circle(3.0,0.0,0.0);
    Circle c2 = new Circle(2.5,3.0,0.0);
    Circle c3 = new Circle(4.0,8.0,0.0);

  
    System.out.println();
    System.out.println("Area of Circle 1: " + c1.getArea());
    System.out.println("Area of Circle 2: " + c2.getArea());
    System.out.println("Area of Circle 3: " + c3.getArea());
    System.out.println();

    if(c1.doesOverlap(c2)){
      System.out.println("Circle 1 overlaps Circle 2.");
    } else {
      System.out.println("Circle 1 doesn't overlap Circle 2.");
    }
    if(c1.doesOverlap(c3)){
      System.out.println("Circle 1 overlaps Circle 3.");
    } else {
      System.out.println("Circle 1 doesn't overlap Circle 3.");
    }
    if(c2.doesOverlap(c3)){
      System.out.println("Circle 2 overlaps Circle 3.");
    } else {
      System.out.println("Circle 2 doesn't overlap Circle 3.");
    }
  }
}

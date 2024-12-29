package ooops;

class Pen {
  String color;
  String type; // ballppen,jel,etc;

  public void write() {
    System.out.println("Writing something"); //pen is performing thhis task
  }

  public void printcolor() {
    System.out.println(this.color);
  }
}

public class concept { //C:\Users\jatin\Desktop\Core Java\ooops\concept.java

  public static void main(String[] args) {
    Pen pen1 = new Pen();
    pen1.color = "blue";
    pen1.type = "get";

    Pen pen2 = new Pen();
    pen2.color = "yellow";
    pen2.type = "canva";

    pen1.printcolor();
    pen2.printcolor();
  }
}

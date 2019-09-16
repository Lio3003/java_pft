package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello();
    Rectangle r = new Rectangle(5, 7);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.pr());
    Square s = new Square(10);
    System.out.println("Площадь квадрата со стороной " + s.x + " = " + s.kv());

  }

  public static String a = "world!";

  public static void hello() {
    System.out.println("Hello " + a);
  }
  }


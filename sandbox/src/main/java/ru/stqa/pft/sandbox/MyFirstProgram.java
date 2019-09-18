package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Rectangle r = new Rectangle(5, 7);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.pr());

    Square s = new Square(10);
    System.out.println("Площадь квадрата со стороной " + s.x + " = " + s.kv());

    Point p1 = new Point(5,10);
    Point p2 = new Point(2,2);

      System.out.println("Расстояние между точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") равно " + p1.distance(p1, p2));
    }

  }



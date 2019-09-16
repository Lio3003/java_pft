package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
hello();
    int a = 5;
    int b = 7;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + vov(a, b));
  }
public static String a = "world!";

  public static void hello() {
    System.out.println("Hello " + a);
  }

  public static int vov(int a, int b){
    return a * b;
  }
  }

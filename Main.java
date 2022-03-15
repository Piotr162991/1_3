import java.lang.Math;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     System.out.println("Podaj liczbę a:");
    int a = scan.nextInt();
     System.out.println("Podaj liczbę b:");
    int b = scan.nextInt();
    
    System.out.println(Math.sqrt(a) + Math.sqrt(b) );
  }
}
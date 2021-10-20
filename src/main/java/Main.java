import java.awt.*;
import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

class Main {

  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    Calculator calculator = new Calculator();
    System.out.println("Enter a command!\n");

    String command = myObj.next();
    if (command.equals("add")) {
      String arg1 = myObj.next();
      String arg2 = myObj.next();
      System.out.println(calculator.add(Integer.parseInt(arg1), Integer.parseInt(arg2)));
    }
    else if (command.equals("subtract")) {
      String arg1 = myObj.next();
      String arg2 = myObj.next();
      System.out.println(calculator.add(Integer.parseInt(arg1), Integer.parseInt(arg2)));
    }
    else if (command.equals("multiply")) {
      String arg1 = myObj.next();
      String arg2 = myObj.next();
      System.out.println(calculator.multiply(Integer.parseInt(arg1), Integer.parseInt(arg2)));
    }
    else if (command.equals("divide")) {
      String arg1 = myObj.next();
      String arg2 = myObj.next();
      System.out.println(calculator.divide(Integer.parseInt(arg1), Integer.parseInt(arg2)));
    }
    else if (command.equals("binary")) {
      String arg1 = myObj.next();
      System.out.println(calculator.intToBinaryNumber(Integer.parseInt(arg1)));
    }
    else if (command.equals("fibonacci")) {
      String arg1 = myObj.next();
      System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(arg1)));
    }
    else {
      System.out.println("Sorry, I don't recognize that command.\n");
    }
  }
}

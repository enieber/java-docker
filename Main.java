
public class Main {
 
  public static void main(String args[]){
    printFizzBuzz();
  }

  public static void printFizzBuzz() {
    
    for (int i=1; i<=100; i++) {
      System.out.println(multipleFiveThree(i));
      
    }
  }

  public static String multipleFiveThree(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    } 
    
    if (number % 3 == 0 && number % 5 != 0) {
      return "Fizz";
    } 
    
    if (number % 3 != 0 && number % 5 == 0) {
      return "Buzz";
    }

    return String.valueOf(number);
  }
 
}

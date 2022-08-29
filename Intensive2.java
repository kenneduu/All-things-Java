public class Intensive2 {
  public static void main(String[]args) {
    // type casing time bros (assign value of prim data type to another)
 
    // widening casting - automatically, small to large

    int number = 17;
    double number2 = number;

    System.out.println(number);
    System.out.println(number2);

    //narrowing casting - manual, large to small

    double number3 = 17.68d;
    int number4 = (int) number3; 

    System.out.println(number3);
    System.out.println(number4);

    //operators: standard apply, also ++ and -- which in/decrement

    int x = 7;
    ++x; 
    System.out.println(x);

    int y = 8;
    --y;
    System.out.println(y);

    // String time wooooo!
    // length() returns length :D

    String word = "KENNEDYISTHEBESTPROGRAMMEREVER";
    System.out.println("Following string length: " + word.length());

    // toUpperCase() and toLowerCase()

    System.out.println(word.toLowerCase());

    // finding char in a string, indexOf() returns index of occurrence

    String message = "Ken is a computer godess";
    System.out.println(message.indexOf("godess"));

    // good ol' concatenation 

    String firstN = "Ken ";
    String lastN = "Programmer";
    System.out.println(firstN + " " + lastN);

    //OR use concat() but remember the space

    System.out.println(firstN.concat(lastN));

    // Special replacement characters
    // \' for single qoute, \" for double quote, \\ for backslash

    String special = "Kennedu is a \'programmer\'.";
    System.out.println(special);




  }  
}

public class Intensive4 {
    public static void main(String[]args){

    // Boolean expressions now >>>>>>

    int x = 10;
    int y = 11;
    System.out.println(x > 10);
    System.out.println(x > y);
    System.out.println(x == 45);

    // IF STATEMENTS WOOOOOO


    int cars = 10;
    if (cars < 5) {
        System.out.println("GO DO SOME PUSHUPS!");
    } else if (cars > 10) {
        System.out.println("SIGMA");
    } else {
        System.out.println("beta");
    
    }

    // ternary operator a.k.a cheating if...else :lmao:
    // format is as follows...
    //... variable = (condition) ? expressionTrue : expressionFalse;

    String result = (cars > 5) ? "Sigma" : "Beta";
    System.out.println(result);

    // switch statements...
    //... selects certain blocks of code to be executed 

    int day = 3;
    switch (day) {
        case 1:
        System.out.println("wakey school time");
        break;
        case 2:
        System.out.println("wakey school time");
        break;
        case 3:
        System.out.println("wakey school time");
        break;
        case 4:
        System.out.println("wakey school time");
        break;
        case 5:
        System.out.println("wakey school time");
        break;
        case 6:
        System.out.println("weekend is here bozo");
        break;
        default:
        System.out.println("beta");
    }
    


  }
}
    



public class Intensive1 {
    public static void main(String[]args) {
        System.out.println("Sup Universe - I refuse to put hello world!!!");

        // type *variableName* = value;

        String name = "Kennedu";
        System.out.println(name);

        int number = 17;
        System.out.println(number);

        //or 

        int number1;
        number1 = 17;
        System.out.println(number1);

        // overwriting previous value as new value assigned after

        int number2 = 17;
        number2 = 18;
        System.out.println(number2);

        //read only variable uses final

        final int number3 = 17;
        // number3 = 18; generates error
        System.out.println(number3);

        //other variables: float '', char, boolean

        //combine text and variables

        String me = "Kennedu";
        System.out.println("Hello " + me);

        // combining variables

        String firstName = "Kennedu ";
        String lastName = "Programmer Boss";
        String fullName = firstName + lastName;
        System.out.println("Hello " + fullName);

        // ok we pull up but make it numericals !

        int y = 5;
        int x = 10;
        System.out.println(x * y);

        // declare multiple variables in a comma list
        
        int a = 3, b = 4, c = 5;
        System.out.println(a+b+c);

        // assign same value to multiple variables

        int d, e, f;
        d = e = f = 17;
        System.out.println(d + e + f);

        // unfamiliar data types?!?!!

        byte number4 = 100;
        System.out.println(number4); 

        // byte saves memory, between -128 and 127

        short number6 = 5000;
        System.out.println(number6);

        // short, between -32768 to 32767

        long number7 = 1500000000L;
        System.out.println(number7);

        // long, huge numbers, must end with L (something i never take :cool:)

        float number8 = 1.11f;
        System.out.println(number8);

        // float, must end with f 

        double number9 = 10.99d;
        System.out.println(number9);

        //double, more precision han float - probs uses more memory though
        // double and float can also be with e for x^10 


    }
}



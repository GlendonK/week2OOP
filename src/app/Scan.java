package app;
import java.util.Scanner;


public class Scan {

   public Scan() {
       return;
    
    }

    public void getFloat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter float: ");
        float floatValue = input.nextFloat();
        System.out.println("The float is: " + floatValue);
        //input.close();

    }

    public void getInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int: ");
        int intValue = input.nextInt();
        System.out.println("The int is: " + intValue);
        //input.close();

    }

    public void getLong(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter long: ");
        long longValue = input.nextLong();
        System.out.println("The long is: " + longValue);
        //input.close();

    }

    public void getDouble(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter double: ");
        double doubleValue = input.nextDouble();
        System.out.println("The double is: " + doubleValue);
        //input.close();

    }

    public void getByte(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter byte: ");
        byte byteValue = input.nextByte();
        System.out.println("The byte is: " + byteValue);
        //input.close();

    }

    public void getShort(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter short: ");
        short shortValue = input.nextShort();
        System.out.println("The short is: " + shortValue);
        //input.close();

    
    }

    

}

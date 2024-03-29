import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Sup, this is simple calculator \nPlease, enter fisrt number");
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        System.out.println("Please, enter the action type using +, -, * or /");
        String action = scanner.next();
        

        
        while(!action.equals("+") && !action.equals("-") && !action.equals("*") && !action.equals("/")) {
            System.out.println("Please enter an action from the list above");
            action = scanner.next();
        }

        System.out.println("Please, enter second number");
        float num2 = scanner.nextFloat();
        Calculator calculator = new Calculator(num1, num2, action);
        Float result = calculator.getResult();
        System.out.println("Result is " + result);

       
        File file = new File("Logs.txt");
        FileWriter fw = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(num1 + " " + action + " " + num2 +  " = " + result +"\n-------------------------------");
        
        scanner.close();
        pw.close();
    }
}

public class Calculator implements Addition, Subtraction, Multiplication, Division{
    float num1;
    float num2;
    String action;

    public Calculator(float num1, float num2, String action){
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
    }

    public Float getResult(){
        float result = 0;
        
        switch (action) {
            case ("+"):
            result = Addition.addition(num1, num2);
            break;
            case ("-"):
            result = Subtraction.subtraction(num1, num2);
            break;
            case ("*"):
            result = Multiplication.multiplication(num1, num2);
            break;
            case ("/"):
            result = Division.division(num1, num2);
            break;
            
        }
        return result;
    }
}

public class OperatorPrecedence {
    public static void main(String[] args){

        int result = 10+5*2;
        System.out.println("Result of 10 + 5 * 2: " + result); // Output: 20
        
        // Multiplication has higher precedence than addition
        // So, 5 * 2 is evaluated first, then 10 + 10
        int result2 = (10+5)*2;
        System.out.println("Result of (10 + 5) * 2: " + result2); // Output: 30
        
        // Parentheses have the highest precedence
        // So, 10 + 5 is evaluated first, then multiplied by 2
        int result3 = 10 + (5 * 2);
        System.out.println("Result of 10 + (5 * 2): " + result3); // Output: 20

        // Parentheses have the highest precedence  
        // So, 5 * 2 is evaluated first, then added to 10
        int result4 = 10 + 5 * 2 - 3;
        System.out.println("Result of 10 + 5 * 2 - 3: " + result4); // Output: 17
        // explain the order of operations with multiple operators
        // Multiplication has higher precedence than addition and subtraction
        // So, 5 * 2 is evaluated first, then added to 10, and finally 3 is subtracted from the result

    }
}

public class TypeCasting {
    public static void main(String[] args){
        // implicit type casting (widening)
        int a = 10;
        double b = a; // int to double  
        System.out.println("Implicit type casting (widening): " + b);

        // explicit type casting (narrowing)
        double c = 20.5;
        int d = (int) c; // double to int
        System.out.println("Explicit type casting (narrowing): " + d);  

        // char to int
        char e = 'A';
        int f = e; // char to int (ASCII value)
        System.out.println("Char to int (ASCII value): " + f);  

        // int to char
        int g = 66;
        char h = (char) g; // int to char
        System.out.println("Int to char: " + h);

        // float to int
        float i = 10.5f;
        int j = (int) i; // float to int
        System.out.println("Float to int: " + j);

        
    }
}

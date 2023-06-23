package JavaCWH;

/*  Exercise 6: You have to create a custom calculator with following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division
    which throws the following exceptions:
    1. Invalid input Exception ex: 8 & 9
    2. Cannot divide by 0 Exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000 
*/

class InvalidInput extends Exception{
    @Override
    public String toString(){
        return "Can't add 8 and 9.";
    }
}

class CannotDivide extends Exception{
    @Override
    public String toString(){
        return "Can't divide by 0.";
    }
}

class MaxInput extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 100000.";
    }
}

class MaxMultiplier extends Exception{
    @Override
    public String toString(){
        return "Input can't be greater than 7000 while multiplying.";
    }
}

class CustomCalculator{
    int addition(int a, int b) throws InvalidInput, MaxInput{
        if(a>100000 || b>100000){
            throw new MaxInput();
        }
        if(a==8 || b==9 || a==9 || b==8){
            throw new InvalidInput();
        }
        return a+b;
    }

    int subtraction(int a, int b) throws InvalidInput, MaxInput{
        if(a>100000 || b>100000){
            throw new MaxInput();
        }
        if(a==8 || b==9 || a==9 || b==8){
            throw new InvalidInput();
        }
        return a-b;
    }

    double multiply(int a, int b) throws MaxMultiplier{
        if(a>7000 || b>7000){
            throw new MaxMultiplier();
        }
        return a*b;
    }

    float divide(double d, double e) throws MaxInput, CannotDivide{
        if(d>100000 || e>100000){
            throw new MaxInput();
        }
        if(e==0){
            throw new CannotDivide();
        }
        return (float) (d/e);
    }

}

public class Lec87_Exercise6_CustomCalculator {
    public static void main(String[] args) throws MaxMultiplier, MaxInput, CannotDivide, InvalidInput {
        CustomCalculator c = new CustomCalculator();
        System.out.println(c.addition(5, 10));
        System.out.println(c.subtraction(50, 60));
        System.out.println(c.multiply(88, 15));
        System.out.println(c.divide(50.5, 20.5));
        // c.addition(8, 10);
        // c.subtraction(100001, 5121);
        // c.multiply(8000, 564);
        // c.divide(5000, 0);

    }
}

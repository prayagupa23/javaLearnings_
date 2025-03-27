import java.lang.Exception;
class InvalidAgeException extends Exception{
     InvalidAgeException(String s){
         super(s);
     }
}
class user_exception{
    public static void main(String args[]){
        int age=17;
        try{
            if(age<18){
                throw new InvalidAgeException("Invalid age less than 18! Cannot vote.");
            }
            else{
                System.out.println("You are eligible to vote!");
            }
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program executed successfully!");
        }
    }
}
import java.util.Scanner;
class stringOp{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a string to be operated on: ");
        
        String str1= s.next();
        String upper,lower;
        
        upper= str1.toUpperCase(); // toUpperCase()   
        lower= str1.toLowerCase(); // toLowerCase()
        
        System.out.println("\nString methods in java: ");
        System.out.println("1. Uppercase : "+upper);
        System.out.println("2. Lowercase : "+lower);
        
        //System.out.println("\n");
        
        String replaceStr= str1.replace('g','j'); //replace()
        System.out.println("3. Replace: "+replaceStr);
        
        int len= str1.length(); //length()
        System.out.println("4. Length: "+len);
        
        String stripSpace= "Hello ";
        System.out.println("5. Trim: "+ stripSpace.trim()); //trim()

        String concatStr1= stripSpace.concat(str1); //concat()
        System.out.println("6. Concat: "+concatStr1);

        char character= str1.charAt(2); //charAt()
        System.out.println("7. charAt: "+character);        
        
        String str2= "Hello";
        System.out.println("8. substring: "+str2.substring(0,4));

        String equalStr1, equalStr2;
        equalStr1="PraYag";
        equalStr2= "Prayag";
        System.out.println("9. equals: "+equalStr1.equals(equalStr2)); //equals()
        System.out.println("10. equalsIgnoreCase: "+equalStr1.equalsIgnoreCase(equalStr2)); //equalsIgnoreCase()

        String compStr1, compStr2;
        compStr1= "abc";
        compStr2= "abd";
        System.out.println("11. compareTo: "+compStr1.compareTo(compStr2));

        Integer num= 10;
        String intToStr= num.toString(); // toString()
        System.out.println("12. toString() : "+intToStr);       
    }
}
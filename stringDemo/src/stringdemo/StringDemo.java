package stringdemo;

public class StringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "The weather is very nice today."; //String is a char[] array. 
        System.out.println(message);
        
//        System.out.println("The number of char: " + message.length());
//        //charAt(): Returns the character at the specified index (position) in string, return type: char
//        System.out.println("6th element is : " + message.charAt(5));
//        //concat() method: to concatenate two strings
//        System.out.println(message.concat("Yay!"));
//        // startsWith: contol the string start with, control end of the string  endWith , return type:boolean; true,false
//        System.out.println(message.startsWith("The"));
//        System.out.println(message.endsWith("!"));
//        //getChars(sourceindex,sourceendindex,name of char array, destination beginindex):It allows us to get a certain range of characters in a char array. 
//        char[] chars = new char[7];
//        message.getChars(0, 7, chars, 0);
//        System.out.println(chars);
//
//        //indexOf("string"/'char') and lastindexOf() : return the index of specified char or string in String 
//        System.out.println(message.indexOf("is"));

          System.out.println(message.replace(" ","-"));// old char is space, and new replace char is -
          System.out.println(message.toLowerCase());

        

                
    }
    
}

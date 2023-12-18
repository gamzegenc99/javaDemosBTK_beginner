package methods;

public class Methods {

    public static void main(String[] args) {
       findingNumber();
    }
    public static void findingNumber(){ //creating method to finding number , function naming: camelCase
        int [] numbers = new int[]{1,2,5,7,9,0}; //array
        int number = 6;
        boolean found = false;
        for(int i=0; i<numbers.length; i ++){
            if(numbers[i]==number){
                found=true;
                break;
            }
        }
        if(found){
            message(number);
        }
        else{
            System.out.println("number not found:" + number);

            
        }
    }
    
    public static void message(int number){ // method with parameter, why we use this parameter?
        //Bc the number variable is not defined in message method so not able to access another methods.When using parameter information can be passed to methods as parameter. Parameters act as variables inside the method. 
        System.out.println("number found:" + number);
        
        
    }
}

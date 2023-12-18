package miniprojectfindingnumber;

public class MiniProjectFindingNumber {

    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,5,7,9,0}; //array
        int number = 5;
        boolean found = false;
        for(int i=0; i<numbers.length; i ++){
            if(numbers[i]==number){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("number found");
        }
        else{
            System.out.println("number not found");

            
        }
        
    }
    
}

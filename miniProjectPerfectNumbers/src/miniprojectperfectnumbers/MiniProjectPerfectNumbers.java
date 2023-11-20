package miniprojectperfectnumbers;

public class MiniProjectPerfectNumbers {

    public static void main(String[] args) {
        // 6 --> is a perfect number --> 1,2,3: multipliers 6 = 1+2+3 
        // 28 --> is a perfect number --> 1,2,4,7,14:multipliers 28 = 1+2+4+7+14, 

        int number = 5; //instance
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // check multipliers
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Number is a perfect number");
        } else {
            System.out.println("Number is not a perfect number");
        }

    }

}

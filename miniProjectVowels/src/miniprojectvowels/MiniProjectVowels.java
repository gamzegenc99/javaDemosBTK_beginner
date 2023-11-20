package miniprojectvowels;

public class MiniProjectVowels {
    
    public static void main(String[] args) {
       //low vowels: a, ı, o, u,
       //thin vowels:e, i, ö, ü
       char vowel = 'E';
       switch(vowel){
           case 'A':
           case 'I':
           case 'O':
           case 'U':
                System.out.println("low wovels");
                break;
           default: // does not fit any case
                System.out.println("thin vowels");
                                           
                   
       }
    }
    
}

package JavaExample;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
//
//       char ch ='i';
//        if(ch=='a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u')
//        {
//            System.out.println("is vowel: "+ch);
//
//        }
//        else
//        {
//            System.out.println("is consonant: "+ch);
//        }

        char ch ='b';
         switch (ch)
         {
             case  'a':
             case 'e':
             case 'i':
             case 'o':
             case 'u':
                 System.out.println("is vowel: "+ch);
                 break;
             default:
                 System.out.println("is consonant: "+ch);

         }
    }
}

import java.io.*;
import java.util.Scanner;
class ROT13
{
    public static void main()
    {
        String str,str1= ""; // words store        
        char ch,ch1; // character variables
        int i,c; // 'i' for loop , 'c' to convert letter into integer
        Scanner in= new Scanner(System.in);
        int choice;
        System.out.println("ENTER CHOICE(ROT13)\n 1=ENCODE \n 2=DECODE");
        choice= in.nextInt();
        in.nextLine(); // This line you have to add (It consumes the \n character)
        System.out.println("Enter Message:" );
        str= in.nextLine(); // storing original word
        if(choice == 1){

        for(i=0;i<str.length();i++)
        {
            ch= str.charAt(i); // extracting character of the string
            if(ch>='A'&&ch<='M'||ch>='a'&&ch<='m')//checking, also could be done in ASCII
            {
                c=(int)ch+13;//adding 13 to change ascii value by 13 places
                ch=(char)c;//coversting that changed ASCII value to letter
                str1=str1+ch;
            }
            else if(ch>='N'&&ch<='Z'||ch>='n'&&ch<='z')
            {
                c=(int)ch-13;
                ch=(char)c;
                str1=str1+ch;

            }
        }
        System.out.println("YOUR UNENCRYPTED MESSAGE ==> : " +str); // Printing Original Message
        System.out.println("ROT13 Encrypted Message : " +str1); // Printing Encrypted Message}
                        }
    else if(choice == 2){
        for(i=0;i<str.length();i++)
        {
            ch= str.charAt(i); // extracting character of the string
            if(ch>='A'&&ch<='M'||ch>='a'&&ch<='m')//checking, also could be done in ASCII
            {
                c=(int)ch+13;//adding 13 to change ascii value by 13 places
                ch=(char)c;//coverting that changed ASCII value to letter
                str1=str1+ch;
            }
            else if(ch>='N'&&ch<='Z'||ch>='n'&&ch<='z')
            {
                c=(int)ch-13;//decreasing ascii val by 13
                ch=(char)c;//converting value of c to character
                str1=str1+ch;
            }
        }
        System.out.println("YOUR ENCRYPTED MESSAGE ==> : " +str); // Printing Original Message
        System.out.println("ROT13 Unencrypted Message : " +str1); // Printing Encrypted Message}
    
    
    }
    } // End of Main
} // End of Class

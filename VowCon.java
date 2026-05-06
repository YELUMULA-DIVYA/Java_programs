import java.util.Scanner;
public class VowCon
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch (ch)
        {
            case 'a':
                case 'e':
                    case 'i':
                        case 'o':
                            case 'u':
                                System.out.println("Vowel");
                                break;
                                default:
                                    if (Character.isLetter(ch))
                                        System.out.println("Consonant");
                                    else
                                       System.out.println("Not an alphabet"); 
        }
    }
}
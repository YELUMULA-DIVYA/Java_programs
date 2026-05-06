import java.util.Scanner;
public class Tables
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (1-10) of table:");
        int table = sc.nextInt();
        switch(table)
        {
            case 1:
                case 2:
                    case 3:
                        case 4:
                            case 5:
                                case 6:
                                    case 7:
                                        case 8:
                                            case 9:
                                                case 10:
                                                    for (int i=1; i<=10; i++)
                                                    {
                                                        System.out.println(table + "x" + i + "=" + (table * i));
                                                    }
                                                    break;
                                                    default:
                                                        System.out.println("Please enter between 1 to 10:");                                  
        }
    }
}

import java.util.Scanner;

class Switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        switch (a) {
            case 1:
            System.out.println("it is apple");
                
                break;
                case 2:
                System.out.println("it is banana");
                break;
                case 3:
                System.out.println("it is pineapple");
                
                break;
                case 4:
                System.out.println("it is guava");
                
                break;
        
            default:
            System.out.println("the item is not a fruit, try again");
                break;
        }
    }
}
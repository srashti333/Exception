import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        Except o =new Menu();
        System.out.println("1: IOException");
        System.out.println("2: ClassNotFoundException");
        System.out.println("3: IntrruptedException");
        System.out.println("4: ");
        System.out.println("5: ");
        System.out.println("6: InputMismatchException");
        System.out.println("7:ArrayIndexOutOfBound");
        System.out.println("8: NumberFormatException");
        System.out.println("9:NullPointerException");
        System.out.println("10:ArithmeticException");
        System.out.println("Enter no. b/w 1 to 10");
        int a;
        a=s.nextInt();
        Switch(10){
            case 6 :
                try{
                    int e[]}
                catch(ArithmeticException e){
                    e.getMessage();
                }
            case 7 :
                try{
                int e[]={1,2,3};
                System.out.println(e[4]);}
                catch(ArithmeticException e){
                    e.getMessage();
                }
            case 8 :
                try{
                int d=0123;}
                catch(NumberFormatException e){
                    e.getMessage();
                }
            case 9 :
                try{
                String c=null}
                catch(NullPointerException e){
                    e.getMessage();
                }
            case 10 :
                try{
                int b=5/0;}
                catch(ArithmeticException e){
                    e.getMessage();
                }
        }
    }
}




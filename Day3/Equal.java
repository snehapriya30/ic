import java.util.Scanner;
public class Equal{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st String:");
        String str1=sc.nextLine();
        System.out.println("enter 2nd String:");
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Strings both are equal");
        }else{
            System.out.println(" Strings not equal");

        }
    }
}
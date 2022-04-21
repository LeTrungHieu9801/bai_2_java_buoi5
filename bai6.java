import java.util.Scanner;

public class bai6
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap chuoi ky tu: ");
        String str = sc.next();


            if(str.length()<3)
            {
                System.out.println(str);
            }
            else if(str.charAt(str.length()-1)!='g' && str.charAt(str.length()-2)!='n'&& str.charAt(str.length()-3)!='i')
            {
                System.out.println(str + "ing");
            }
            else
                System.out.println(str + "ly");

    }
}

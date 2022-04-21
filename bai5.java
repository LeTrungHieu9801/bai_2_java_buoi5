import java.util.Scanner;

public class bai5
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap chuoi ky tu 1: ");
        String str1 = sc.next();
        System.out.println(" nhap chuoi ky tu 2: ");
        String str2 = sc.next();
        System.out.println(str1.substring(0,2)+str2.substring(2) + " "+ str2.substring(0,2)+str1.substring(2));
    }
}


import java.util.Scanner;

public class bai8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ky tu 1: ");
        String str = sc.next();
        System.out.println("Nhap chuoi ky tu 2: ");
        String str1 = sc.next();
        if(str.length()<str1.length())
        {
            int dem =0;
            System.out.print("Ky tu dai nhat la: ");
            for (int i = 0; i < str1.length(); i++) {

                System.out.print(str1.charAt(i));
                dem++;
            }
            System.out.println("\n"+"Tong so ky tu cua chuoi la: "+dem);

        }
        else
        {
            int dem =0;
            System.out.print("Ky tu dai nhat la: ");
            for (int i = 0; i < str.length(); i++) {

                System.out.print(str.charAt(i));
                dem++;
            }
            System.out.println("\n"+"Tong so ky tu cua chuoi la: "+dem);

        }


    }
}

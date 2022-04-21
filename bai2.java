import java.util.Scanner;

public class bai2
{
    // cach 1
    static void DemKyTu(String str)
    {
//       int[] dem = new int[256];
//        for (int i = 0; i < str.length(); i++)
//        {
//         dem[str.charAt(i)]++;
//        }
//
//        for (int i = 0; i < dem.length ; i++) {
//            if(dem[i] != 0)
//            {
//                System.out.println("Ky tu " + (char)i + " xuat hien " + dem[i] + " lan ");
//            }
//
//        }

        // cach 2
        boolean dadem;
        int dem1;
        for (int i = 0; i < str.length(); i++)     // i =0 g i=1 o
        {
          dadem=false;
          dem1=0;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    dadem = true;
                    break;
                }
            }
            System.out.println();

                if(dadem)
                {
                    continue;
                }
                else
                {
                    for (int j = i; j <str.length() ; j++)  // i=0  , j++ // i=1
                    {
                     if(str.charAt(j)==str.charAt(i))
                     {
                         dem1++;
                     }
                    }
                }
                System.out.println("Ky tu " +str.charAt(i) + " xuat hien " + dem1 + " lan");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.next();
        System.out.println("Chuoi la: "+ str);
        DemKyTu(str);
    }
}

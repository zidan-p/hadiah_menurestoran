
package tugasguru;

import java.util.Scanner;
public class menurestoran {


    public static void main(String[] args) {
        String[] makanan = {"lele bakar", "ayam goreng", "cumi asam manis", "ikan bakar", "bebek bakar"};
        String[] harga = {"12.000", "14.000", "20.000", "35.000", "13.000"};
        int i = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Menu Makanan =====");
        System.out.println("pilihlah makan di bawah ini");
        
        do {
            daftar_makanan();
            if (i == 0){
                System.out.println("silahkan memilih makanan lagi");
            }
            else if (i != 0) {
                System.out.println("masukan nomor makanan yang anda pilih");
            }
            
            int pilih = input.nextInt();
            if (pilih > 0 && pilih < 6){
                System.out.println("apakah anda yakin akan membeli "+makanan[pilih-1]+"seharga "+harga[pilih-1]+"\n1. iya\n0. tidak");
            i = input.nextInt();
            }
            else{
                System.out.println("maaf nomor yang anda masukan tidak valid");
            }
            
            
        }while(i == 0);
        
    }
    public static void daftar_makanan(){
        String[] makanan = {"lele bakar", "ayam goreng", "cumi asam manis", "ikan bakar", "bebek bakar"};
        String[] harga = {"12.000", "14.000", "20.000", "35.000", "13.000"};
        for (int i = 0 ; i < makanan.length; i ++ ){
            System.out.print(i+1+". "+makanan[i]);
            for (int j = 0; j < harga.length; j++){
                if (i == j){
                    System.out.print(" = "+harga[j]);
                }
            }
            System.out.print("\n");
        }
        
    }

}

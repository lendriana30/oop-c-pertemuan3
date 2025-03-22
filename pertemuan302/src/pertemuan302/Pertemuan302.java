package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Lendriana
 * TGL 22 Maret 2025
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Nilai dinyatakan lulus apabila 75 ke atas
      int nilai = 0;
      String nama, nim;
      String ket="";
      
      Scanner dtIN = new Scanner(System.in);
      
      System.out.print("Input Nama Mahasiswa: ");
      nama = dtIN.nextLine();
      
      System.out.print("Input Nim: ");
      nim = dtIN.nextLine();
      
      System.out.print("Input Nilai: ");
      nilai = Integer.parseInt( dtIN.nextLine() );
      
      if(nilai>=75){
          ket ="Lulus";
      }else{
          ket="Tidak Lulus";
      }
      System.out.printf("Mahasiswa dengan nama %s (%s) adalah %d, dinyatakan %s", nama,nim,nilai,ket);
          }
    
}

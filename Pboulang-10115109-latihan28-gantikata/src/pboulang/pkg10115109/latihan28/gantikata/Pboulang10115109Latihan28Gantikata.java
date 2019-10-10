/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author nama : indri
 *          nim : 10116109
 *          kls : pbo ulang
 *          tugas : mengganti kata pert 2
 */
public class Pboulang10115109Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        String text,cari,ganti;
        
        
        System.out.println("====== PROGRAM MENGGANTI KATA=========");
        System.out.print("masukan Kalimat:");
        text = in.nextLine();
        
        System.out.println("Ganti Kata : ");
        cari = in.nextLine();
        
        System.out.println("Menjadi Kata:");
        ganti =  in.nextLine();
        
        System.out.println("\n hasil setelah diganti :" +text.replace(cari, ganti));
        
        
        System.out.println("");
        System.out.println("  develop BY: indri yuliyanti  ");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;
/**
 *
 * @author hudax
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jml, hrg,ttl,diskon;
      Scanner scan = new Scanner(System.in);
      System.out.println("Masukan Jumlah : ");
      jml = scan.nextInt();
      System.out.println("Masukan Harga : ");
      hrg = scan.nextInt();           
      ttl = jml*hrg;
    
      if (ttl >= 200000) {
            diskon = ttl * 15 / 100;
            ttl = ttl - diskon;         
            System.out.println("Diskon = 15%");
      }else if
            (ttl >= 100000) {
            diskon = ttl * 10 / 100;
            ttl = ttl - diskon;
            System.out.println("Diskon = 10%");
      }else if
            (ttl >= 50000) {
            diskon = ttl * 5 / 100;
            ttl = ttl - diskon;
            System.out.println("Diskon = 5%");
      }   
      if (jml >= 50){
          diskon = ttl - ((ttl*5)/100);
          System.out.println("Tambah Diskon 5%\nTotal Bayar = "+diskon);
      }
      else{
          System.out.println("Total Bayar = Rp."+ttl);
      }
    }
    
}

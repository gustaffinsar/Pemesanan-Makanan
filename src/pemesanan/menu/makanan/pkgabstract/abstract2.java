/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanan.menu.makanan.pkgabstract;

/**
 *
 * @author asus
 */
public class abstract2 extends abstract1{
     @Override
      void Bakso() {
        int harga = 8000;
        int uang = 0;
        int kembalian;
        
        System.out.println("Anda memilih menu Bakso dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda" + uang);
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
     }
     
     @Override
      void Soto() {
        int harga = 12000;
        int uang;
        int kembalian;
        
        System.out.println("Anda memilih menu Rawon dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda");
        uang = input.nextInt();

        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
      }
      
     @Override
      void Rawon() {
        int harga = 12000;
        int uang;
        int kembalian;
        
        System.out.println("Anda memilih menu Rawon dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda");
        uang = input.nextInt();

        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }
     @Override
      void seblak() {
        int harga = 12000;
        int uang;
        int kembalian;
        
        System.out.println("Anda memilih menu Rawon dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda");
        uang = input.nextInt();

        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }
}

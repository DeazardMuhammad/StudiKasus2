/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author MOKLET-2
 */
public class Static {
    static String nama;
    static int tahun_sekarang = 2021, tahun_lahir = 2005, umur;
    
    public static void main(String[] args){
        nama = "Deazard Muhammad";
        System.out.println("Namaku: "+nama);
        System.out.println("Umurku: "+Umur()+" Tahun");
    }
    
    static int Umur(){
        umur = tahun_sekarang - tahun_lahir;
        return umur;
    }
    
    }


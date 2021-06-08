/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapanmethod;

/**
 *
 * @author MOKLET-2
 */
public class PenerapanMethod {
String nama, makanan;
    public static void main(String[] args) {
 PenerapanMethod Hewan = new PenerapanMethod();
        System.out.println("====== KUCING =======");
        Hewan.Kucing();
        System.out.println("====== KAMBING ======");
        Hewan.Kambing();       
    }
 void Kucing(){
        nama = "Dika";
        makanan = "Ikan";
        System.out.println("Nama Kucing Saya "+nama);
        System.out.println("Kucing Saya Suka "+makanan);
    }
    
    void Kambing(){
        nama = "Andi";
        makanan = "Rumput";
        System.out.println("Nama Kambing Saya "+nama);
        System.out.println("Kambing Saya Suka "+makanan);
    }
}
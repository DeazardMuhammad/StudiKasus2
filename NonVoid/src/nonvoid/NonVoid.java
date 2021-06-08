/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonvoid;

/**
 *
 * @author MOKLET-2
 */
public class NonVoid {
String hewan = "Kerbau";
int Sawah1 = 10, Sawah2 = 40, hasil;

public static void main(String[] args){
    NonVoid Banyak = new NonVoid();
    System.out.println("Nama Hewan: "+Banyak.Nama());
    System.out.println("Jumlahnya: "+Banyak.Jumlah()+ " Ekor");
}

String Nama(){
    return hewan;
}

int Jumlah(){
    hasil = Sawah1 + Sawah2;
    return hasil;
}
}

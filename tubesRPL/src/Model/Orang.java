/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author dhivazhr
 */
public abstract class Orang {
    private String nama;
    private String nip;

    public Orang(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getNip() {
        return nip;
    }
    public abstract String display();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Iwan Ma'ruf
 */
public class dekan {
    private String namaDekan;
    private String nip;
    private String password;

    public dekan(String namaDekan, String nip, String password) {
        this.namaDekan = namaDekan;
        this.password = password;
    }

    public String getNamaDekan() {
        return namaDekan;
    }

    public void setNamaDekan(String namaDekan) {
        this.namaDekan = namaDekan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

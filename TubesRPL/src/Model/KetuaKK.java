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
public class KetuaKK {
    private String nama;
    private String nip;
    private String usernameKetuaKK;
    private String passKetuaKK;

    public KetuaKK(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getUsernameKetuaKK() {
        return usernameKetuaKK;
    }

    public void setUsernameKetuaKK(String usernameKetuaKK) {
        this.usernameKetuaKK = usernameKetuaKK;
    }

    public String getPassKetuaKK() {
        return passKetuaKK;
    }

    public void setPassKetuaKK(String passKetuaKK) {
        this.passKetuaKK = passKetuaKK;
    }
    
    
}

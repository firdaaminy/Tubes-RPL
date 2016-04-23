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
public class Dekan extends Orang{
    private String usernameDekan;
    private String passDekan;

    public Dekan(String nama, String nip) {
        super(nama,nip);
    }

    public String getPassDekan() {
        return passDekan;
    }

    public void setPassDekan(String passDekan) {
        this.passDekan = passDekan;
    }

    @Override
    public String display() {
        return("Nama: "+getNama()+"\n"+"NIP: "+getNip());
    }
}

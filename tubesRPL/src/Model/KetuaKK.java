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
public class KetuaKK extends Orang{
    private String usernameKetuaKK;
    private String passKetuaKK;

    public KetuaKK(String nama, String nip) {
        super(nama,nip);
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

    @Override
    public String display() {
        return("Nama: "+getNama()+"\n"+"NIP: "+getNip());
    }
    
    
}

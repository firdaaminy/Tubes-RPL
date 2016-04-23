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
public class Admin extends Orang{
    private String usernameAdmin;
    private String passAdmin;
    
    public Admin(String nama, String nip) {
        super(nama,nip);
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }

    @Override
    public String display() {
       return("Nama: "+getNama()+"\n"+"NIP: "+getNip());
    }
    
}

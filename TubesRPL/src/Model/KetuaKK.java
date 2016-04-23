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

    public KetuaKK(String nama, String nip, String username, String password) {
        super(nama, nip, username, password);
    }

   @Override
    public String getJabatan() {
        return "KetuaKK";
    }
}

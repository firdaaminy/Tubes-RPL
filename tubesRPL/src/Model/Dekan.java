/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Dekan extends Orang implements Serializable{

    public Dekan(String nama, String nip, String username, String password) {
        super(nama, nip, username, password);
    }

    @Override
    public String getJabatan() {
        return "Dekan";
    }
    
}

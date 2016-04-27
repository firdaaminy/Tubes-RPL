/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dhivazhr
 */
public class KetuaKK extends Orang implements Serializable{
        
    private ArrayList<Proposal> listProposal = new ArrayList();
    
    public KetuaKK(String nama, String nip, String username, String password) {
        super(nama, nip, username, password);
    }
    
    public void createProposal(int noProposal, long anggaran, String jenis, String keterangan, boolean verifikasi, Date date){
       // listProposal.add(new Proposal(int noProposal, long anggaran, String jenis, String keterangan, boolean verifikasi, Date date));
    }
    
   @Override
    public String getJabatan() {
        return "KetuaKK";
    }
}

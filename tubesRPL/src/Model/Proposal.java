/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author User
 */
public class Proposal {
    private int noProposal;
    private long anggaran;
    private String jenis;
    private String keterangan;
    private boolean verifikasi;
    private Date date;

    public Proposal(int noProposal, long anggaran, String jenis, String keterangan, boolean verifikasi, Date date) {
        this.noProposal = noProposal;
        this.anggaran = anggaran;
        this.jenis = jenis;
        this.keterangan = keterangan;
        this.verifikasi = verifikasi;
        this.date = date;
    }

    public int getNoProposal() {
        return noProposal;
    }

    public void setNoProposal(int noProposal) {
        this.noProposal = noProposal;
    }

    public long getAnggaran() {
        return anggaran;
    }

    public void setAnggaran(long anggaran) {
        this.anggaran = anggaran;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public boolean isVerifikasi() {
        return verifikasi;
    }

    public void setVerifikasi(boolean verifikasi) {
        this.verifikasi = verifikasi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}

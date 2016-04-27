/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.FileIO;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Aplikasi {

    ArrayList<KetuaKK> listKetuaKK = new ArrayList();
    ArrayList<Admin> listAdmin = new ArrayList();
    ArrayList<Dekan> listDekan = new ArrayList();
    FileIO save;

    public Aplikasi() {
        save = new FileIO();
    }

    public void loadKetuaKK() throws IOException {
        try {
            listKetuaKK = (ArrayList<KetuaKK>) save.getObject("DataKetuaKK.txt");
        } catch (FileNotFoundException e) {
            File f = new File("DataKetuaKK.txt");
            f.createNewFile();
        } catch (EOFException ex) {
            listKetuaKK = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void loadAdmin() throws IOException {
        try {
            listAdmin = (ArrayList<Admin>) save.getObject("DataAdmin.txt");
        } catch (FileNotFoundException e) {
            File f = new File("DataAdmin.txt");
            f.createNewFile();
        } catch (EOFException e) {
            listAdmin = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void loadDekan() throws IOException {
        try {
            listDekan = (ArrayList<Dekan>) save.getObject("DataDekan.txt");
        } catch (FileNotFoundException ex) {
            File f = new File("DataDekan.txt");
            f.createNewFile();
        } catch (EOFException ex) {
            listAdmin = new ArrayList<>();
        } catch (ClassNotFoundException | IOException ex) {

            throw new IOException("error " + ex.getMessage());
        }

    }

    public void saveKetuaKK() throws FileNotFoundException, IOException {
        try {
            save.saveObject(listKetuaKK, "DataKetuaKK.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveAdmin() throws FileNotFoundException, IOException {
        try {
            save.saveObject(listAdmin, "DataAdmin.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("file not found");
        } catch (IOException e) {
            throw new IOException("error " + e.getMessage());
        }
    }

    public void saveDekan() throws IOException{
        try {
            save.saveObject(listDekan, "DataDekan.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("file not found");
        }catch(IOException e){
            throw new IOException("error " + e.getMessage());
        }
        
    }
    
    public ArrayList<KetuaKK> getListKetuaKK() {
        return listKetuaKK;
    }

    public ArrayList<Admin> getListAdmin() {
        return listAdmin;
    }

    public ArrayList<Dekan> getListDekan() {
        return listDekan;
    }

    
    public Object login(String username, String password) throws IOException {
        loadAdmin();
        loadKetuaKK();

        for (KetuaKK ketuaKK : listKetuaKK) {
            if (ketuaKK.getUsername().equals(username) && ketuaKK.getPassword().equals(password)) {
                return ketuaKK;
            }
        }
        for (Admin admin : listAdmin) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        for (Dekan dekan : listDekan) {
            if (dekan.getUsername().equals(username) && dekan.getPassword().equals(password)) {
                return dekan;
            }
        }
        return null;
    }
}

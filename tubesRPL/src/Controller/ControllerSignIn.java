/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.Aplikasi;
import Model.Dekan;
import Model.KetuaKK;
import Model.NewJFrame;
import Model.Orang;
import View.HomeSignIn;
import View.SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.View;

/**
 *
 * @author dhivazhr
 */
public class ControllerSignIn implements ActionListener {

    private HomeSignIn view;
    private Aplikasi app;

    public ControllerSignIn() throws IOException {
        app = new Aplikasi();
        view = new HomeSignIn();
        view.setVisible(true);
        view.addListener(this);
        app.loadAdmin();
        app.loadData();
        app.loadKetuaKK();
    }

//    private NewJFrame view;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnSignIn())) {
            if (view.getUsernameAdmin() != null && view.getPassword() != null) {
                try {
                    //blm
                    Orang org = (Orang) app.login(view.getUsernameAdmin(), view.getPassword());

                    if (org != null) {
                        if (org.getJabatan().equals("KeuanganFakultas")) {
                            Admin a = (Admin) org;
                            ControllerHomeAdmin homeadmin = new ControllerHomeAdmin();
                            view.setVisible(false);
                        } else if (org.getJabatan().equals("KetuaKK")) {
                            KetuaKK kk = (KetuaKK) org;

                            ControllerHomeKK homekk = new ControllerHomeKK();
                            view.setVisible(false);

                        } else if (org.getJabatan().equals("Dekan")) {
                            Dekan dekan = (Dekan) org;
                            ControllerHomeDekan homedekan = new ControllerHomeDekan();
                            view.setVisible(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Not Registered");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ControllerSignIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Form kosong");
            }
        }
    }

}

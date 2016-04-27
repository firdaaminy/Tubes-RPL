/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Admin;
import Model.Aplikasi;
import Model.KetuaKK;
import Model.Orang;
import View.SignIn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhivazhr
 */
public class ControllerSignIn implements ActionListener {

    private SignIn view;
    private Aplikasi app;

    public ControllerSignIn() {
        view = new SignIn();
        app = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
    }

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
                        }else if (org.getJabatan().equals("KetuaKK")){
                            KetuaKK kk = (KetuaKK) org;
                            ControllerHomeKK homekk = new ControllerHomeKK();
                            view.setVisible(false);
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ControllerSignIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}

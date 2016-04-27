/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Aplikasi;
import View.DekanHome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dhivazhr
 */
public class ControllerHomeDekan implements ActionListener{
    private DekanHome view;
    private Aplikasi app;

    public ControllerHomeDekan() {
        view = new DekanHome();
        app = new Aplikasi();
        view.setVisible(true);
        view.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

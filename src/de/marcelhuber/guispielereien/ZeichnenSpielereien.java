/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.marcelhuber.guispielereien;

import java.awt.*;
import java.lang.*;
import javax.swing.*;

/**
 *
 * @author viona25
 */
public class ZeichnenSpielereien extends JFrame {

    public static void main(String[] args) {
        ZeichnenSpielereien frame = new ZeichnenSpielereien();
        frame.setVisible(true);
    }

    // Konstruktor für Frame als Grundlage für's Zeichnen
    public ZeichnenSpielereien() {
        super("Hier wollen wir was zeichnen!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 350);
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics zeichner) {
        zeichner.drawLine(0, 0, 300, 300);
    }

}

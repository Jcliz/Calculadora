package com.github.jcliz.calc.visao;

import javax.swing.JFrame;

public class Calculadora extends JFrame {
    public Calculadora() {

        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}

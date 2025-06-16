package View;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TelaBase {
    public static void padronizarJanela(JFrame frame) {
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null); // Centraliza
        frame.setResizable(false);
        frame.setTitle("Sistema de Cursos");
    }
    public static void padronizarTextAreas(Container container) {
        for (Component comp : container.getComponents()) {
            if (comp instanceof JTextArea) {
                JTextArea area = (JTextArea) comp;
                area.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                area.setLineWrap(true);
                area.setWrapStyleWord(true);
            } else if (comp instanceof Container) {
                padronizarTextAreas((Container) comp); // recursivo
            }
        }
    }
}

import Controller.CursoController;
import View.*;

public class Main {
    public static void main(String args[]) {
        CursoController cursoController = new CursoController();
        javax.swing.SwingUtilities.invokeLater(() -> {
            new TelaLogin(cursoController).setVisible(true);
        });
    }

}

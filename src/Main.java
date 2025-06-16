import Controller.*;
import View.*;
import Util.*;

public class Main {
    public static void main(String args[]) {
       CursoController cursoController = new CursoController();
        cursoController.setCursos(PersistenciaJson.carregarCursos("cursos.json"));

        UsuarioController usuarioController = new UsuarioController();
        usuarioController.setUsuarios(PersistenciaJson.carregarUsuarios("usuarios.json"));

        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin(cursoController, usuarioController).setVisible(true);
        });
    }

}

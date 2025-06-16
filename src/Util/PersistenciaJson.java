package Util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import Model.Curso;
import Model.Usuario;

public class PersistenciaJson {
    private static final Gson gson = new Gson();

    public static void salvarCursos(List<Curso> cursos, String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            gson.toJson(cursos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Curso> carregarCursos(String caminho) {
        try (Reader reader = new FileReader(caminho)) {
            Type tipoLista = new TypeToken<List<Curso>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            return new java.util.ArrayList<>();
        }
    }

    public static void salvarUsuarios(List<Usuario> usuarios, String caminho) {
        try (Writer writer = new FileWriter(caminho)) {
            gson.toJson(usuarios, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> carregarUsuarios(String caminho) {
        try (Reader reader = new FileReader(caminho)) {
            Type tipoLista = new TypeToken<List<Usuario>>() {}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            return new java.util.ArrayList<>();
        }
    }
}

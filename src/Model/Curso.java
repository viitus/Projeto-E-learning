package Model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String descricao;
    private List<Aula> aulas;
    
    public Curso(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.aulas = new ArrayList<>();
    }
    
    public void adicionarAula(Aula aula){
        this.aulas.add(aula);
    }
    
    //getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public List<Aula> getAulas(){
        return aulas;
    }

    @Override
    public String toString() {
        return nome;
    }
}

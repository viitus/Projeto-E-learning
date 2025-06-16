package Model;

public class Aula {
    private String titulo;
    private String conteudo;

    public Aula(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }
}

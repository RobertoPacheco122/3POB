package entities;

public class Selecao {
    private String nome;
    private String nomeTecnico;
    private String grupo;
    
    public Selecao(String nome, String nomeTecnico, String grupo) {
        this.nome = nome;
        this.nomeTecnico = nomeTecnico;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
}

package entities;

public class Confronto {
    private String data;
    private String hora;
    private String local;
    private Selecao selecaoA;
    private Selecao selecaoB;
    private String placar;
    
    public Confronto(String data, String hora, String local, Selecao selecaoA, Selecao selecaoB, String placar){
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.placar = placar;
        this.selecaoA = selecaoA;
        this.selecaoB = selecaoB;
        this.placar = placar;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Selecao getSelecaoA() {
        return selecaoA;
    }

    public void setSelecaoA(Selecao selecaoA) {
        this.selecaoA = selecaoA;
    }

    public Selecao getSelecaoB() {
        return selecaoB;
    }

    public void setSelecaoB(Selecao selecaoB) {
        this.selecaoB = selecaoB;
    }

    public String getPlacar() {
        return placar;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }
    
}

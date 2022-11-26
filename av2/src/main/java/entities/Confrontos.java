package entities;

import java.util.ArrayList;
import java.util.List;

public class Confrontos {
    private List<Confronto> listaConfrontos = new ArrayList<>();
    
    public void addConfronto(Confronto confronto){
        listaConfrontos.add(confronto);
    }
    
    public void printConfronto(int posicao){
        System.out.printf("Data: %s\n", listaConfrontos.get(posicao).getData());
        System.out.printf("Horário: %s\n", listaConfrontos.get(posicao).getHora());
        System.out.printf("Local: %s\n", listaConfrontos.get(posicao).getLocal());
        System.out.printf("Seleções: %s X %s\n", listaConfrontos.get(posicao).getSelecaoA().getNome(), listaConfrontos.get(posicao).getSelecaoB().getNome());
        System.out.printf("Placar: %s\n\n", listaConfrontos.get(posicao).getPlacar());
    }
    
    public void printAllConfrontosFromSelecao(String nomeSelecao){
        for(int i = 0; i < listaConfrontos.size(); i++){
            if((listaConfrontos.get(i).getSelecaoA().getNome().equals(nomeSelecao)) || (listaConfrontos.get(i).getSelecaoB().getNome().equals(nomeSelecao))){
                printConfronto(i);
            }
        }
    }
    
    public int printAllConfrontosFromGroup(String nomeGrupo){
        int encontrou = 0;
        for(int i = 0; i < listaConfrontos.size(); i++){
            if((listaConfrontos.get(i).getSelecaoA().getGrupo().equals(nomeGrupo))){
                printConfronto(i);
                encontrou++;
            }
        }
        
        return encontrou;
    }
    
    public void printAllConfrontos(){
        for(int i = 0; i < listaConfrontos.size(); i++){
            printConfronto(i);
        }
    }
}
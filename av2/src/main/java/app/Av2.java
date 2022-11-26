package app;

import java.util.Scanner;
import entities.*;

public class Av2 {
    public static void exibirOpcoes(){
        System.out.println("1 = Mostrar o calendário completo de jogos");
        System.out.println("2 = Mostrar o calendário de jogos de uma seleção");
        System.out.println("3 = Mostrar o calendário completo de jogos de um grupo");
        System.out.println("4 = Encerrar programa");
    }
    
    
    public static void menu(Confrontos confrontos){
        System.out.printf("\n\nDigite uma opção:\n\n");
        exibirOpcoes();
        int opcao;
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();
            
        while (opcao != 6){
            switch(opcao){
                case 1:
                    confrontos.printAllConfrontos();
                    break;
                case 2:
                    System.out.println("Digite o nome da seleção.");
                    String nomeSelecao = sc.next();           
                    confrontos.printAllConfrontosFromSelecao(nomeSelecao);
                    break;
                case 3:
                    System.out.println("Digite o nome do grupo");
                    String nomeGrupo = sc.next();                    
                    confrontos.printAllConfrontosFromGroup(nomeGrupo);
                    break;
                case 4:
                    break;
                default:
                System.out.println("Opção inválida");
            }
            System.out.printf("\n\nDigite uma opção:\n\n");
            exibirOpcoes();
            opcao = sc.nextInt();
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        /* SELEÇÕES */
        Selecao catar = new Selecao("Catar", "Félix Sánchez Bas", "A");
        Selecao equador = new Selecao("Equador", "Gustavo Julio Alfaro", "A");
        Selecao senegal = new Selecao("Senegal", "Aliou Cissé", "A");
        Selecao holanda = new Selecao("Holanda", "Louis van Gaal", "A");       
        Selecao inglaterra = new Selecao("Inglaterra", "Gareth Southgate", "B");
        Selecao ira = new Selecao("Irâ", "Carlos Queiroz", "B");
        Selecao estadosUnidos = new Selecao("Estados Unidos", "Gregg Berhalter", "B");
        Selecao paisDeGales = new Selecao("País de Gales", "Rob Page", "B");        
        Selecao argentina = new Selecao("Argentina", "Lionel Scaloni", "C");
        Selecao arabiaSaudita = new Selecao("Arábia Saudita", "Hervé Renard", "C");
        Selecao mexico = new Selecao("México", "Gerardo Martino", "C");
        Selecao polonia = new Selecao("Polônia", "Czeslaw Michniewicz", "C");       
        Selecao franca = new Selecao("França", "Didier Deschamps", "D");
        Selecao australia = new Selecao("Austrália", "Graham Arnold", "D");
        Selecao dinamarca = new Selecao("Dinamarca", "Kasper Hjulmand", "D");
        Selecao tunisia = new Selecao("Tunísia", "Jalel Kadri", "D");       
        Selecao espanha = new Selecao("Espanha", "Luis Enrique", "E");
        Selecao costaRica = new Selecao("Costa Rica", "Luis Fernando Suárez", "E");
        Selecao alemanha = new Selecao("Alemanha", "Hans-Dieter Flick", "E");
        Selecao japao = new Selecao("Japão", "Hajime Moriyasu", "E");       
        Selecao belgica = new Selecao("Bélgica", "Roberto Martínez", "F");
        Selecao canada = new Selecao("Canadá", "John Herdman", "F");
        Selecao marrocos = new Selecao("Marrocos", "Walid Regragui", "F");
        Selecao croacia = new Selecao("Croácia", "Zlatko Dalić", "F");        
        Selecao brasil = new Selecao("Brasil", "Tite", "G");
        Selecao servia = new Selecao("Sérvia", "Dragan Stojković", "G");
        Selecao suica = new Selecao("Suíça", "Murat Yakın", "G");
        Selecao camaroes = new Selecao("Camarões", "Rigobert Song", "G");
        Selecao portugal = new Selecao("Portugal", "Fernando Santos", "H");
        Selecao gana = new Selecao("Gana", "Otto Addo", "H");
        Selecao uruguai = new Selecao("Uruguai", "Diego Alonso", "H");
        Selecao coreiaDoSul = new Selecao("Coréia do Sul", "Diego Alonso", "H");
        
        /* GRUPO A */
        Confronto confrontoA1 = new Confronto("20/11", "13h00", "Estádio Al Bayt", catar, equador, "0 X 2");
        Confronto confrontoA2 = new Confronto("21/11", "13h00", "Estádio Al Thumama", senegal, holanda, "0 X 2");
        Confronto confrontoA3 = new Confronto("25/11", "10h00", "Estádio Al Thumama", catar, senegal, "1 X 3");
        Confronto confrontoA4 = new Confronto("25/11", "13h00", "Estádio Internacional Khalifa", holanda, equador, "1 X 1");
        Confronto confrontoA5 = new Confronto("29/11", "12h00", "Estádio Al Bayt", holanda, catar, "Indisponível");
        Confronto confrontoA6 = new Confronto("29/11", "12h00", "Estádio Internacional Khalifa", equador, senegal, "Indisponível");        
        /* GRUPO B */
        Confronto confrontoB1 = new Confronto("21/11", "10h00", "Estádio Internacional Khalifa", inglaterra, ira, "6 X 2");
        Confronto confrontoB2 = new Confronto("21/11", "16h00", "Estádio Ahmed bin Ali", estadosUnidos, paisDeGales, "1 X 1");
        Confronto confrontoB3 = new Confronto("25/11", "07h00", "Estádio Ahmed bin Ali", paisDeGales, ira, "0 X 3");
        Confronto confrontoB4 = new Confronto("25/11", "16h00", "Estádio Al Bayt", inglaterra, estadosUnidos, "0 X 0");
        Confronto confrontoB5 = new Confronto("29/11", "16h00", "Estádio Ahmed bin Ali", paisDeGales, inglaterra, "Indisponível");
        Confronto confrontoB6 = new Confronto("29/11", "16h00", "Estádio Al Thumama", ira, estadosUnidos, "Indisponível");        
        /* GRUPO C */
        Confronto confrontoC1 = new Confronto("22/11", "07h00", "Estádio Nacional de Lusail", argentina, arabiaSaudita, "1 X 2");
        Confronto confrontoC2 = new Confronto("22/11", "13h00", "Estádio 974", mexico, polonia, "0 X 0");
        Confronto confrontoC3 = new Confronto("26/11", "10h00", "Estádio Cidade da Educação", polonia, arabiaSaudita, "2 X 0");
        Confronto confrontoC4 = new Confronto("26/11", "16h00", "Estádio Nacional de Lusail", argentina, mexico, "Indisponível");
        Confronto confrontoC5 = new Confronto("30/11", "16h00", "Estádio Nacional de Lusail", arabiaSaudita, mexico, "Indisponível");
        Confronto confrontoC6 = new Confronto("30/11", "16h00", "Estádio 947", polonia, argentina, "Indisponível");        
        /* GRUPO D  */
        Confronto confrontoD1 = new Confronto("22/11", "10h00", "Estádio Cidade da Educação", dinamarca, tunisia, "0 X 0");
        Confronto confrontoD2 = new Confronto("22/11", "16h00", "Estádio Al Janoub", franca, australia, "4 X 1");
        Confronto confrontoD3 = new Confronto("26/11", "07h00", "Estádio Al Janoub", tunisia, australia, "Indisponível");
        Confronto confrontoD4 = new Confronto("26/11", "13h00", "Estádio 974", franca, dinamarca, "Indisponível");
        Confronto confrontoD5 = new Confronto("30/11", "12h00", "Estádio Cidade da Educação", tunisia, franca, "Indisponível");
        Confronto confrontoD6 = new Confronto("30/11", "12h00", "Estádio Al Janoub", australia, dinamarca, "Indisponível");        
        /* GRUPO E  */
        Confronto confrontoE1 = new Confronto("23/11", "10h00", "Estádio Internacional Khalifa", alemanha, japao, "1 X 2");
        Confronto confrontoE2 = new Confronto("23/11", "13h00", "Estádio Al Thumama", espanha, costaRica, "7 X 0");
        Confronto confrontoE3 = new Confronto("27/11", "07h00", "Estádio Ahmad bin Ali", japao, costaRica, "Indisponível");
        Confronto confrontoE4 = new Confronto("27/11", "16h00", "Estádio Al Bayt", espanha, alemanha, "Indisponível");
        Confronto confrontoE5 = new Confronto("01/12", "16h00", "Estádio Internacional Khalifa", japao, espanha, "Indisponível");
        Confronto confrontoE6 = new Confronto("01/12", "16h00", "Estádio Al Bayt", costaRica, alemanha, "Indisponível");        
        /* GRUPO F  */
        Confronto confrontoF1 = new Confronto("23/11", "07h00", "Estádio Al Bayt", marrocos, croacia, "0 X 0");
        Confronto confrontoF2 = new Confronto("23/11", "16h00", "Estádio Ahmad bin Ali", belgica, canada, "1 X 0");
        Confronto confrontoF3 = new Confronto("27/11", "10h00", "Estádio Al Thumama", belgica, marrocos, "Indisponível");
        Confronto confrontoF4 = new Confronto("27/11", "13h00", "Estádio Internacional Khalifa", croacia, canada, "Indisponível");
        Confronto confrontoF5 = new Confronto("01/12", "12h00", "Estádio Ahmad bin Ali", croacia, belgica, "Indisponível");
        Confronto confrontoF6 = new Confronto("01/12", "12h00", "Estádio Al Thumama", canada, marrocos, "Indisponível");        
        /* GRUPO G  */
        Confronto confrontoG1 = new Confronto("24/11", "07h00", "Estádio Al Janoub", suica, camaroes, "1 X 0");
        Confronto confrontoG2 = new Confronto("24/11", "16h00", "Estádio Nacional de Lusail", brasil, servia, "2 X 0");
        Confronto confrontoG3 = new Confronto("28/11", "07h00", "Estádio Al Janoub", camaroes, servia, "Indisponível");
        Confronto confrontoG4 = new Confronto("28/11", "13h00", "Estádio 974", brasil, suica, "Indisponível");
        Confronto confrontoG5 = new Confronto("02/12", "16h00", "Estádio Nacional de Lusail", camaroes, brasil, "Indisponível");
        Confronto confrontoG6 = new Confronto("02/12", "16h00", "Estádio 974", servia, suica, "Indisponível");        
        /* GRUPO H  */
        Confronto confrontoH1 = new Confronto("24/11", "10h00", "Estádio Cidade da Educação", uruguai, coreiaDoSul, "0 X 0");
        Confronto confrontoH2 = new Confronto("24/11", "13h00", "Estádio 974", portugal, gana, "3 X 2");
        Confronto confrontoH3 = new Confronto("28/11", "10h00", "Estádio Cidade da Educação", coreiaDoSul, gana, "Indisponível");
        Confronto confrontoH4 = new Confronto("28/11", "16h00", "Estádio Nacional de Lusail", portugal, uruguai, "Indisponível");
        Confronto confrontoH5 = new Confronto("02/12", "12h00", "Estádio Cidade da Educação", coreiaDoSul, portugal, "Indisponível");
        Confronto confrontoH6 = new Confronto("02/12", "12h00", "Estádio Al Janoub", gana, uruguai, "Indisponível");
        
        Confrontos confrontos = new Confrontos();
        
        confrontos.addConfronto(confrontoA1);
        confrontos.addConfronto(confrontoA2);
        confrontos.addConfronto(confrontoA3);
        confrontos.addConfronto(confrontoA4);
        confrontos.addConfronto(confrontoA5);
        confrontos.addConfronto(confrontoA6);        
        confrontos.addConfronto(confrontoB1);
        confrontos.addConfronto(confrontoB2);
        confrontos.addConfronto(confrontoB3);
        confrontos.addConfronto(confrontoB4);
        confrontos.addConfronto(confrontoB5);
        confrontos.addConfronto(confrontoB6);        
        confrontos.addConfronto(confrontoC1);
        confrontos.addConfronto(confrontoC2);
        confrontos.addConfronto(confrontoC3);
        confrontos.addConfronto(confrontoC4);
        confrontos.addConfronto(confrontoC5);
        confrontos.addConfronto(confrontoC6);       
        confrontos.addConfronto(confrontoD1);
        confrontos.addConfronto(confrontoD2);
        confrontos.addConfronto(confrontoD3);
        confrontos.addConfronto(confrontoD4);
        confrontos.addConfronto(confrontoD5);
        confrontos.addConfronto(confrontoD6);        
        confrontos.addConfronto(confrontoE1);
        confrontos.addConfronto(confrontoE2);
        confrontos.addConfronto(confrontoE3);
        confrontos.addConfronto(confrontoE4);
        confrontos.addConfronto(confrontoE5);
        confrontos.addConfronto(confrontoE6);        
        confrontos.addConfronto(confrontoF1);
        confrontos.addConfronto(confrontoF2);
        confrontos.addConfronto(confrontoF3);
        confrontos.addConfronto(confrontoF4);
        confrontos.addConfronto(confrontoF5);
        confrontos.addConfronto(confrontoF6);        
        confrontos.addConfronto(confrontoG1);
        confrontos.addConfronto(confrontoG2);
        confrontos.addConfronto(confrontoG3);
        confrontos.addConfronto(confrontoG4);
        confrontos.addConfronto(confrontoG5);
        confrontos.addConfronto(confrontoG6);
        confrontos.addConfronto(confrontoH1);
        confrontos.addConfronto(confrontoH2);
        confrontos.addConfronto(confrontoH3);
        confrontos.addConfronto(confrontoH4);
        confrontos.addConfronto(confrontoH5);
        confrontos.addConfronto(confrontoH6);
        
        menu(confrontos);
    }
}
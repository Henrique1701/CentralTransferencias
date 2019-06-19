package programa;

import treinador.*;
import jogador.*;
import time.*;
import habilidade.*;
import fachada.*;

public class Programa {
    public static void main(String[] args) {
        //RepositorioTimes repositorioTimes = new RepositorioTimesLista();
        RepositorioTimes repositorioTimes = new RepositorioTimesArray(100);
        //RepositorioJogadores repositorioJogadores = new RepositorioJogadoresLista();
        RepositorioJogadores repositorioJogadores = new RepositorioJogadoresArray();
        RepositorioTreinadores repositorioTreinadores = new RepositorioTreinadoresArray(10);
        //RepositorioTreinadores repositorioTreinadores = new RepositorioTreinadoresLista();
        RepositorioHabilidades repositorioHabilidades = new RepositorioHabilidadesLista();

        CentralTransferencias fachada = new CentralTransferencias(repositorioTimes, repositorioTreinadores, repositorioJogadores);


        //Cadastra treinadores:
        try { //Treinador do Real Madrid
            Treinador zidane = new Treinador("Zidane", 46, 10000, "01-Z", 50);
            fachada.cadastrarTreinador(zidane);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do Barcelona
            Treinador ernesto = new Treinador("Ernesto", 55, 9000, "02-E", 40);
            fachada.cadastrarTreinador(ernesto);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do Bayern
            Treinador niko = new Treinador("Niko", 47, 8000, "03-N", 30);
            fachada.cadastrarTreinador(niko);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Treinador do City
            Treinador guardiola = new Treinador("Guardiola", 48, 8000, "04-G", 50);
            fachada.cadastrarTreinador(guardiola);
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Treinador do PSG
            fachada.cadastrarTreinador(new Treinador("Thomas", 45, 7000, "05-T", 30));
        } catch (TreinadorJaCadastradoException e) {
            System.out.println(e.getMessage());
        }

        //Procurar Treinadores:
        try { //Zidane:
            Treinador treinadorAux = fachada.procurarTreinador("01-Z");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getSalario());
            System.out.println(treinadorAux.getExperiencia());
            System.out.println();
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Ernesto:
            Treinador treinadorAux = fachada.procurarTreinador("02-E");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getSalario());
            System.out.println(treinadorAux.getExperiencia());
            System.out.println();
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Niko:
            Treinador treinadorAux = fachada.procurarTreinador("03-N");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getSalario());
            System.out.println(treinadorAux.getExperiencia());
            System.out.println();
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Guardiola:
            Treinador treinadorAux = fachada.procurarTreinador("04-G");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getSalario());
            System.out.println(treinadorAux.getExperiencia());
            System.out.println();
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try { //Thomas:
            Treinador treinadorAux = fachada.procurarTreinador("05-T");
            System.out.println(treinadorAux.getNome());
            System.out.println(treinadorAux.getSalario());
            System.out.println(treinadorAux.getExperiencia());
            System.out.println();
        } catch (TreinadorNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        //Atualizar Treinadores:
        System.out.println("Atualiza treinadores");
        System.out.println();
        try { //Zidane:
            Treinador treinadorAux = fachada.procurarTreinador("01-Z");
            treinadorAux.setSalario(5000);
            treinadorAux.setExperiencia(30);
            fachada.atualizarTreinador(treinadorAux);

            Treinador zidaneAux = repositorioTreinadores.procurar("01-Z");
            System.out.println(zidaneAux.getNome());
            System.out.println(zidaneAux.getSalario());
            System.out.println(zidaneAux.getExperiencia());
            System.out.println();

            treinadorAux = fachada.procurarTreinador("02-E");
            treinadorAux.setSalario(12000);
            treinadorAux.setExperiencia(60);
            fachada.atualizarTreinador(treinadorAux);

            Treinador ernestoAux = repositorioTreinadores.procurar("02-E");
            System.out.println(ernestoAux.getNome());
            System.out.println(ernestoAux.getSalario());
            System.out.println(ernestoAux.getExperiencia());
            System.out.println();

        } catch (TreinadorNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

        //Remover Treinador:
        //System.out.println("Vou remover o jogador Zidane (01-Z)");
        //System.out.println("Depois vou tentar procurar por ele na lista");
        System.out.println("Como o jogador não ira mais existir vai mandar uma exceção:");
        System.out.println();
        try {
            fachada.removerTreinador("01-Z");
            Treinador treinadorAux = fachada.procurarTreinador("01-Z");
        } catch (TreinadorNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

        //Cadastra Times:
        // Real Madrid
        Treinador zidane = new Treinador("Zidane", 46, 10000, "01-Z", 50);
        Jogador Messi = new Jogador("Messi", 31, 100000, 3, 1500000, 90);
        Time realMadrid = new Time("Real Madrid", 398743, zidane);
        try {
            fachada.cadastrarJogador(Messi);
            fachada.cadastrarTime(realMadrid);
        }catch (TimeJaCadastradoException e){
            System.out.println(e.getMessage());
        }

        Treinador ernesto = new Treinador("Ernesto", 55, 9000, "02-E", 40);
        Time barcelona = new Time("barcelona", 412412, ernesto);
        try {
            fachada.cadastrarTime(barcelona);
        }catch (TimeJaCadastradoException e){
            System.out.println(e.getMessage());
        }
    }
}

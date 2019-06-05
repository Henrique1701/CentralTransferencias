package treinador;

public class CadastroTreinadores {
    private RepositorioTreinadores repositorioTreinadores;

    public CadastroTreinadores(RepositorioTreinadores repositorio){
        this.repositorioTreinadores = repositorio;
    }

    public void cadastrar (Treinador treinador) throws TreinadorJaCadastradoException{
        if(this.repositorioTreinadores.existe(treinador.getRegistroFifa()) == false){
            this.repositorioTreinadores.inserir(treinador);
        } else {
            throw new TreinadorJaCadastradoException();
        }
    }

    public void atualizaExperiencia(String registroFifa, int anoTemporada, int quantidaContratos){
        //Desenvolver alguma formula para alterar a experiencia dos treinadores
        //Em relação ao ano/temporada atual.
        Treinador treinadorAux = repositorioTreinadores.procurar(registroFifa);
        double experienciaAux = treinadorAux.getExperiencia() + (quantidaContratos / 5 * anoTemporada);
        treinadorAux.setExperiencia(experienciaAux);
        repositorioTreinadores.atualizar(treinadorAux);
    }
}

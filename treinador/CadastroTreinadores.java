package treinador;

public class CadastroTreinadores {
    private RepositorioTreinadores repositorioTreinadores;

    public CadastroTreinadores(RepositorioTreinadores repositorio){
        repositorioTreinadores = repositorio;
    }

    public void cadastrar (Treinador treinador) throws TreinadorJaCadastradoException{
        if(this.repositorioTreinadores.existe(treinador.getRegistroFifa()) == false){
            this.repositorioTreinadores.inserir(treinador);
        } else {
            throw new TreinadorJaCadastradoException();
        }
    }

    public void atualizar (Treinador treinador) throws TreinadorNaoEncontradoException {
        if(this.repositorioTreinadores.existe(treinador.getRegistroFifa()) == true){
            this.repositorioTreinadores.atualizar(treinador);
        } else {
            throw new TreinadorNaoEncontradoException();
        }
    }

    public void remover (String registroFifa) throws TreinadorNaoEncontradoException {
        if(this.repositorioTreinadores.existe(registroFifa) == true){
            this.repositorioTreinadores.remover(registroFifa);
        } else {
            throw new TreinadorNaoEncontradoException();
        }
    }

    public Treinador procurar (String registroFifa) throws TreinadorNaoEncontradoException {
        if(this.repositorioTreinadores.existe(registroFifa) == true){
            return this.repositorioTreinadores.procurar(registroFifa);
        } else {
            throw new TreinadorNaoEncontradoException();
        }
    }

    /*
    public void atualizaExperiencia(String registroFifa, int anoTemporada, int quantidaContratos){
        //Desenvolver alguma formula para alterar a experiencia dos treinadores
        //Em relação ao ano/temporada atual.
        Treinador treinadorAux = repositorioTreinadores.procurar(registroFifa);
        double experienciaAux = treinadorAux.getExperiencia() + (quantidaContratos / 5 * anoTemporada);
        treinadorAux.setExperiencia(experienciaAux);
        repositorioTreinadores.atualizar(treinadorAux);
    }
    */
}

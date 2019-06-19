package treinador;

public class RepositorioTreinadoresLista implements RepositorioTreinadores{
    private Treinador treinador;
    private RepositorioTreinadoresLista proximo;

    public RepositorioTreinadoresLista(){
        this.treinador = null;
        this.proximo = null;
    }

    @Override
    public void inserir(Treinador treinador) {
        if(this.proximo == null){
            this.treinador = treinador;
            /*
            this.treinador.setNome(treinador.getNome());
            this.treinador.setIdade(treinador.getIdade());
            this.treinador.setSalario(treinador.getSalario());
            this.treinador.setRegistroFifa(treinador.getRegistroFifa());
            this.treinador.setExperiencia(treinador.getExperiencia());
            */
            this.proximo = new RepositorioTreinadoresLista();
        } else {
            this.proximo.inserir(treinador);
        }
    }

    @Override
    public void atualizar(Treinador treinador){
        if(this.treinador.getRegistroFifa().equals(treinador.getRegistroFifa())){
            this.treinador.setExperiencia(treinador.getExperiencia());
            this.treinador.setIdade(treinador.getIdade());
            this.treinador.setSalario(treinador.getSalario());
        } else {
            this.proximo.atualizar(treinador);
        }
    }

    @Override
    public void remover(String registroFifa){
        if(this.treinador.getRegistroFifa().equals(registroFifa)){
            this.treinador = this.proximo.treinador;
            this.proximo = this.proximo.proximo;
        } else {
            this.proximo.remover(registroFifa);
        }
    }

    @Override
    public Treinador procurar(String registroFifa){
        if(this.treinador.getRegistroFifa().equals(registroFifa)){
            return this.treinador;
        } else {
            this.proximo.procurar(registroFifa);
        }
        return null;
    }

    @Override
    public boolean existe(String registroFifa) {
        if(this.treinador != null){
            if(this.treinador.getRegistroFifa().equals(registroFifa)){
                return true;
            } else {
                this.proximo.existe(registroFifa);
            }
        }
        return false;
    }
}

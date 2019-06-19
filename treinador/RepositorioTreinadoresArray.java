package treinador;

public class RepositorioTreinadoresArray implements RepositorioTreinadores{
    private Treinador[] treinador;
    private int indice;

    public RepositorioTreinadoresArray(int tamanho){
        this.treinador = new Treinador[tamanho];
        indice = 0;
    }

    @Override
    public void inserir(Treinador treinador) {
        if(indice < this.treinador.length) {
            this.treinador[this.indice] = treinador;
            indice++;
        } else {
            Treinador[] aux = new Treinador[(this.treinador.length+1)*2];
            for (int i = 0; i < this.treinador.length; i++){
                aux[i] = this.treinador[i];
            }
            this.treinador = aux;
            this.treinador[this.indice] = treinador;
            indice++;
        }
    }

    @Override
    public void atualizar(Treinador treinador) {
        for(int i = 0; i < this.treinador.length; i++){
            if(this.treinador[i].getRegistroFifa().equals(treinador.getRegistroFifa())){
                this.treinador[this.indice] = treinador;
                i = this.treinador.length;
            }
        }
    }

    @Override
    public void remover(String registroFifa) {
        for(int i = 0; i < treinador.length; i++){
            if (treinador[i].getRegistroFifa().equals(registroFifa)) {
                this.indice--;
                treinador[i] = treinador[this.indice];
                i = treinador.length;
            }
        }
    }

    @Override
    public Treinador procurar(String registroFifa) {
        for(int i = 0; i < getIndice(); i++){
            if(this.treinador[i].getRegistroFifa().equals(registroFifa)){
                return treinador[i];
            }
        }
        return null;
    }

    @Override
    public boolean existe(String registroFifa) {
        int auxIndice = getIndice();
        if(auxIndice != 0){
            for(int i = 0; i < auxIndice; i++){
                if(treinador[i].getRegistroFifa().equals(registroFifa)){
                    return true;
                }
            }
        }
        return false;
    }

    public int getIndice() {
        return indice;
    }
}

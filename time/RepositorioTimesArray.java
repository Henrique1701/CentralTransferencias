package time;

public class RepositorioTimesArray implements RepositorioTimes {
    private Time[] times;
    private int indice;

    public RepositorioTimesArray(int tam) {
        this.times = new Time[tam];
        this.indice = 0;
    }

    public void inserir(Time time) {
        if (times[indice] == null) {
            times[indice] = time;
            indice = indice + 1;
        } else {
            Time[] newTimes = new Time[times.length * 2];
            for (int i = 0; i < times.length; i++) {
                newTimes[i] = times[i];
            }
            times = newTimes;
            times[indice] = time;
            indice = indice + 1;
        }
    }

    @Override
    public void atualizar(Time time) {
        for (int i = 0; i < times.length; i++) {
            if (times[i].getNome().equals(time.getNome())) {
                times[i] = time;
            }
        }
    }

    public void remover(String nome) {
        boolean remover = false;
        for (int i = 0; i < times.length && !remover; i++) {
            if (nome.equals(times[i].getNome())) {
                remover = true;
                // subscrevendo a informa��o do proximo para remover o atual
                for (int j = i; i < times.length; j++) {
                    times[j] = times[j + 1];
                }
                indice = indice - 1;
            }
        }
    }

    @Override
    public Time procurar(String nome) {
        boolean achou = false;
        Time returning = null;
        for (int i = 0; i < times.length && achou; i++) {
            if (nome.equals(times[i].getNome())) {
                achou = true;
                returning = times[i];
            }
        }
        if (achou == false) {

        }
        return returning;
    }

    @Override
    public boolean existe(String nome) {
        int auxIndice = getIndice();
        if(auxIndice != 0){
            for(int i = 0; i < auxIndice; i++){
                return true;
            }
        }
        return false;
    }

    public int getIndice() {
        return indice;
    }
}

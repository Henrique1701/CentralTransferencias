package time;

public class CadastroTimes {
	private RepositorioTimes times;
	
	public CadastroTimes (RepositorioTimes rep) {
		times = rep;
	}

	public void cadastrar (Time time) throws TimeJaCadastradoException {
		if (!times.existe(time.getNome())) {
		times.inserir(time);
		} else {
			throw new TimeJaCadastradoException();
		}
	}

	public void atualizar (Time time) throws TimeNaoEncontradoException {
		if (times.existe(time.getNome())) {
			times.atualizar(time);
		} else {
			throw new TimeNaoEncontradoException();
		}
	}

	public void remover (String nome) throws TimeNaoEncontradoException {
		if (times.existe(nome)) {
			times.remover(nome);
		} else {
			throw new TimeNaoEncontradoException();
		}
	}

	public Time procurar (String nome) throws TimeNaoEncontradoException {
		if (times.existe(nome)) {
			return times.procurar(nome);
		} else {
			throw new TimeNaoEncontradoException();
		}
	}
	
}




public class NoDuplo {
    Object valor;
    NoDuplo prox;
	NoDuplo ant;

    NoDuplo(Object valor) {
        this.valor = valor;
        prox = ant = null;
    }
    
    public NoDuplo getProx() {
		return prox;
	}

	public void setProx(NoDuplo prox) {
		this.prox = prox;
	}

}

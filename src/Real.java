class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Real: " + valor;
    }

    @Override
    public double converter() {
        return valor; // Real já está na moeda alvo
    }
}


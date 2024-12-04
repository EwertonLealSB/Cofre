class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Euro: " + valor;
    }

    @Override
    public double converter() {
        return valor * 6.0; // Supondo taxa de 1 Euro = 6 Reais
    }
}


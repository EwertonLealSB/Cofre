class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Dólar: " + valor;
    }

    @Override
    public double converter() {
        return valor * 5.0; // Supondo taxa de 1 Dólar = 5 Reais
    }
}

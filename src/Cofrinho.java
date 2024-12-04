import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public Moeda remover(int indice) {
        return listaMoedas.remove(indice); // Remover e retornar a moeda removida
    }

    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas; // Permitir acesso à lista para indexação
    }

    public void listagemMoedas() {
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.println(i + " - " + listaMoedas.get(i).info());
        }
    }

    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}

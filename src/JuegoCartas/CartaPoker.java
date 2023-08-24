package JuegoCartas;

public class CartaPoker implements Carta {
    private Palo palo;
    private Valor valor;

    public CartaPoker(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public Palo getPalo() {
        return palo;
    }

    @Override
    public Valor getValor() {
        return valor;
    }
}

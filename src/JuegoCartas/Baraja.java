package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new CartaPoker(palo, valor));
            }
        }
        Collections.shuffle(cartas);
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}

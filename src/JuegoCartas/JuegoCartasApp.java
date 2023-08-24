package JuegoCartas;

import java.util.List;

public class JuegoCartasApp {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        List<Carta> cartas = baraja.getCartas();

        System.out.println("Cartas en la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta.getPalo() + " - " + carta.getValor());
        }
    }    
}

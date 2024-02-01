import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Card {
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

        for (String palo : palos) {
            for (String color : colores) {
                for (String valor : valores) {
                    cards.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en el deck.");
            return;
        }

        Card card = cards.remove(0);
        System.out.printf("%s,%s,%s\nQuedan %d cartas en deck\n", card.getPalo(), card.getColor(), card.getValor(), cards.size());
    }

    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en el deck.");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(cards.size());
        Card card = cards.remove(index);
        System.out.printf("%s,%s,%s\nQuedan %d cartas en deck\n", card.getPalo(), card.getColor(), card.getValor(), cards.size());
    }

    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
            return;
        }

        System.out.println("Mano:");

        for (int i = 0; i < 5; i++) {
            Card card = cards.remove(0);
            System.out.printf("%s,%s,%s\n", card.getPalo(), card.getColor(), card.getValor());
        }

        System.out.printf("Quedan %d cartas en deck\n", cards.size());
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}

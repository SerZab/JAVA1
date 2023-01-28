package Lessons.Lesson19.pocker;

public class Cards {
    Card[] deck = new Card[52];
    Card[] deckShuffle = new Card[52];
    void createDeck(){
        String[] cardValue = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuit = {"♠️","♣️","♥️","♦️"};

        for (int i = 0; i < cardSuit.length; i++) {
            for (int j = 0; j < cardValue.length; j++) {
                deck[i* cardValue.length+j] = new Card(cardValue[j],cardSuit[i]);
                // индекс вычисляется по формуле i(счетчик по масти карты) + j (счетчик по номиналу карты)
                // индекс массива = i* cardValue.length+j = i * 4 + j
                // чтобы индекс массива изменялся с 0 до 51
                //i = 0 -> j (0;12) -> индекс массива -> от 0 до 12
                //i = 1 -> j (0;12) -> индекс массива -> от 13 до 25 -> i*13 + j
                //i = 2 -> j (0;12) -> индекс массива -> от 26 до 38 -> i*13 + j
                //i = 3 -> j (0;12) -> индекс массива -> от 39 до 51 -> i*13 + j
            }
        }

    }
    void deckShuffle(Card[] deck) {
        deckShuffle = deck.clone();

        for (int i = deckShuffle.length-1; i > 1; i--) {

            int j = (int) (Math.random()*i);

            //System.out.println(i+" "  +j);
            Card tempPlace = deckShuffle[i];
            deckShuffle[i] = deckShuffle[j];
            deckShuffle[j] = tempPlace;
        }
    }
    void printDeck(Card[] deck, String message){
        System.out.println(message);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(deck[i*13+j].value+deck[i*13+j].suit +", ");
            }
            System.out.println();
        }
    }
}
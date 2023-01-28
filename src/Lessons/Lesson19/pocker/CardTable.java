package Lessons.Lesson19.pocker;

public class CardTable {
    Cards cards = new Cards();

    void game(){

        cards.createDeck();

        cards.printDeck(cards.deck,"------------  Create New Deck ---------------");

        cards.deckShuffle(cards.deck);
        cards.deckShuffle(cards.deckShuffle);
        cards.deckShuffle(cards.deckShuffle);
        cards.deckShuffle(cards.deckShuffle);

        cards.printDeck(cards.deckShuffle,"------------  Deck after shuffle ---------------");
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Game implements IGame{
    private Iterator<ICard> cardIterator;
    private ICard currentCard;

    static private final String[] cName = new String[15];
    static {
        Game.cName[0] = "c0";
        Game.cName[1] = "c1";
    }

    static private final String[] cCap = new String[15];
    static {
        Game.cCap[0] = "c0";
        Game.cCap[1] = "c1";
    }

    private void setup(int count){
        ArrayList<ICard> cardsArray = new ArrayList<>();

        for ( int i = 0; i < count; i += 1) {
            cardsArray.add(new Card(Game.cName[i], Game.cCap[i]));
        }
        Collections.shuffle(cardsArray);

        this.cardIterator = cardsArray.iterator();
    }

    public Game(){
        this.setup(15);
    }

    public Game(int count) {

        if (count > 15){
            System.out.println("max 15");
            this.setup(15);
        }else {
            this.setup(count);
        }
    }

    public String getCurrentCardCountryName(){
        return this.currentCard.getCountry();
    }


    public Boolean checkGuess(String guess){
        this.currentCard.setUsed(true);
        return this.currentCard.getCapital().equalsIgnoreCase(guess);
    }

    public void next(){
        this.currentCard = this.cardIterator.next();
    }

    public Boolean hasMoreCard(){
        return this.cardIterator.hasNext();
    }


}

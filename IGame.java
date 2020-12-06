public interface IGame {

    String getCurrentCardCountryName();


    Boolean checkGuess(String guess);

    void next();

    Boolean hasMoreCard();


}

public interface ICard {



    static int getCount(){
        return 0;
    }

    String getCountry();

    void setCountry(String newV);

    String getCapital();

    void setCapital(String newV);

    Boolean hasUsed();

    void setUsed(Boolean newV);


}

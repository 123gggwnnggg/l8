public class Card implements ICard{

    private static int count = 0;
    private String country;
    private String capital;
    private Boolean used;

    public static int getCount(){
        return Card.count;
    }

    private void setup(){
        this.country = "";
        this.capital = "";
        this.used = false;
        Card.count += 1;
    }

    public Card(){
        this.setup();
    }

    public Card(String country, String capital){

        this.setup();

        this.capital = capital;
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String newV){
        this.country = newV;
    }

    public String getCapital(){
        return this.capital;
    }

    public void setCapital(String newV){
        this.capital = newV;
    }

    public Boolean hasUsed(){
        return this.used;
    }

    public void setUsed(Boolean newV){
        this.used = newV;
    }

}

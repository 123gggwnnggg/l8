import java.util.Scanner;

public class main {
    public static void main(String[] args){
        IGame g = new Game();
        Scanner sc = new Scanner(System.in);

        while (g.hasMoreCard()){

            System.out.println("want play : (y/n)");
            if (sc.nextLine().equalsIgnoreCase("n")){ return; }

            g.next();

            System.out.println(g.getCurrentCardCountryName());
            String guess = sc.nextLine();

            if (g.checkGuess(guess)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }
    }
}

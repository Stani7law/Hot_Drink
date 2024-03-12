import Domain.Napitki;
import Servis.CoinDispenser;
import Servis.Display;
import Servis.Holder;
import Servis.HotDrink;

import java.util.ArrayList;
import java.util.List;
public class App {
    
    public static void main(String[] args) throws Exception {
       
        Napitki napitok_1 = new Napitki(80.25, 1, "Coffi", 100);
        Napitki napitok_2 = new Napitki(85.50, 2, "Latte", 90);
        Napitki napitok_3 = new Napitki(10.0, 3, "Vater", 25);
        
        List<Napitki> napitki = new ArrayList<>();
        napitki.add(napitok_1);
        napitki.add(napitok_2);
        napitki.add(napitok_3);

        Holder hold = new Holder();
        CoinDispenser coinDispenser = new CoinDispenser();
        Display display = new Display();
        HotDrink hotDrink = new HotDrink(coinDispenser, display, hold, null, napitki);

        for (Napitki napitok : hotDrink.getlNapitki()){
                System.out.println(napitok);
        }
    }
}

package Servis;

import java.util.List;

import Domain.Napitki;

public class HotDrink {

    private CoinDispenser cDispenser;
    private Display display;
    private Holder holder;
    private Temperatura temperatura;
    private List<Napitki> lNapitki;


    public HotDrink(CoinDispenser cDispenser, Display display, Holder holder, Temperatura temperatura,
            List<Napitki> lNapitki) {
        this.cDispenser = cDispenser;
        this.display = display;
        this.holder = holder;
        this.temperatura = temperatura;
        this.lNapitki = lNapitki;
    }


    public CoinDispenser getcDispenser() {
        return cDispenser;
    }


    public Display getDisplay() {
        return display;
    }


    public Holder getHolder() {
        return holder;
    }


    public Temperatura getTemperatura() {
        return temperatura;
    }


    public List<Napitki> getlNapitki() {
        return lNapitki;
    }

    
    
}

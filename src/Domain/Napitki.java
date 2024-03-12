package Domain;

public class Napitki {
    private double price;

    private int plais;

    private String name;

    private int gradus;

    public Napitki(double price, int plais, String name, int gradus) {
        if (price < 0) {
            this.price = 100;
        }else{
            this.price = price;
        }
        this.price = price;
        this.plais = plais;
        this.name = name;
        this.gradus = gradus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 100;
        }else{
            this.price = price;
        }
        this.price = price;
    }

    public int getPlais() {
        return plais;
    }

    public void setPlais(int plais) {
        this.plais = plais;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradus() {
        return gradus;
    }

    public void setGradus(int gradus) {
        this.gradus = gradus;
    }

    @Override
    public String toString() {
        return "Napitki [price=" + price + ", plais=" + plais + ", name=" + name + ", gradus=" + gradus + "]";
    }

    

    
}

package co.unicauca.facade.domain;

/**
 * 
 * @author Luis Arango, Javier Steven Duran
 */
public class Item {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Plato del item
     */
    private Dish dish;
    /**
     * Valor del item
     */
    private int amount;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getAmount() {
        return amount;
    }
    public Dish getDish() {
        return dish;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setDish(Dish dish) {
        this.dish = dish;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }
//</editor-fold>
}

package co.unicauca.facade.domain;

/**
 * Clase del plato
 * @author Luis Manuel Arango, Javier Steven Duran
 */
public class Dish {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Identificador primario del plato 
     */
    private int id;
    /**
     * Nombre del plato
     */
    private String name;
    /**
     * Precio del plato
     */
    private int price;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Dish(int id, String name, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
        
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
//</editor-fold>   
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }    
    public void setPrice(int price) {
        this.price = price;
    }
//</editor-fold>
}

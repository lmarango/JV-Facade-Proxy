package co.unicauca.facade.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis Arango, Javier Steven Duran
 */
public class Order {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    public int despatch;
    private Customer customer;
    private Date date;
    private State state;
    private ArrayList<Item> details;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Order(Customer customer) {
        this.details = new ArrayList<>();
        this.customer = customer;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters&Setters">
    public int getDespatch() {
        return despatch;
    }
    
    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public State getState() {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public List<Item> getDetails() {
        return details;
    }
    
    public void setDetails(ArrayList<Item> details) {
        this.details = details;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Métodos">
    public void addDish(Dish dish, int amount){
        Item item = new Item(dish, amount);
        this.details.add(item);
        
    }
    public int calculateTotal(){
        int total=0;
        for (int i=0;i<this.details.size();i++) {
            total=total+(this.details.get(i).getAmount()*this.details.get(i).getDish().getPrice());
        }
        
        return total;
//</editor-fold>
    }
}

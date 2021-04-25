package co.unicauca.facade.domain.service;

import co.unicauca.facade.domain.Order;
import co.unicauca.facade.domain.Customer;
import co.unicauca.facade.domain.Dish;
import co.unicauca.facade.domain.State;

/**
 *
 * @author Luis Arango, Javier Steven Duran
 */
public class OrderFacade implements IOrderService{
    private Order order;

    public void createOrder(Customer customer) {
        order = new Order(customer);
        order.setState(State.NEW);
    }
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }

    public void changeState(State state){
        order.setState(state);
    }
    public void cancelOrder(){
        order.setState(State.CANCELLED);
    }
    public int calculateTotal(){
        
        return order.calculateTotal();
    }
    public Order getOrder() {
        return order;
    }
    public int totalDishes(){
        
        return order.getDetails().size();
    }

    @Override
    public void save(IOrderRepository repo) {
        
    }
}

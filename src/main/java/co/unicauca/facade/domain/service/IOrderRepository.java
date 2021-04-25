package co.unicauca.facade.domain.service;

import co.unicauca.facade.domain.Order;

/**
 * Interfaz de orden del repositorio 
 * @author Luis Arango, Javier Steven Duran
 */
public interface IOrderRepository {
    /**
     * crea una nueva orden
     * @param order orden a crear
     */
    public void createOrder(Order order);
}

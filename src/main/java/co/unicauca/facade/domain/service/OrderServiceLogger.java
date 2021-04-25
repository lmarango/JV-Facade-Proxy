package co.unicauca.facade.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Luis Arango, Javier Steven Duran
 */
public class OrderServiceLogger implements IOrderService {
    private final OrderFacade orderFacade;  

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }

    @Override
    public void save(IOrderRepository repo) {
       Logger logger= LoggerFactory.getLogger(OrderServiceLogger.class); 
       repo.createOrder(orderFacade.getOrder());
       String message = "Pedido guardado en la base de datos";
       logger.info(message);
        
    }
}

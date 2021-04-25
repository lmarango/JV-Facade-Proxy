package co.unicauca.facade.domain.service;

import co.unicauca.facade.domain.Factory;

/**
 *
 * @author Luis Arango, Javier Steven Duran
 */
public class ProxyClient {
    private final IOrderService iOrderService;

    public ProxyClient(IOrderService iOrderService) {
        this.iOrderService = iOrderService;
    }

    public IOrderService getiOrderService() {
        return iOrderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        iOrderService.save(repo);
    }
}

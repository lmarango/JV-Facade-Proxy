package co.unicauca.facade.domain;

import co.unicauca.facade.domain.service.IOrderRepository;
import co.unicauca.facade.domain.service.OrderRepository;
import co.unicauca.facade.infra.Utilities;

/**
 * 
 * @author Luis Manuel Arango, Javier Steven Duran
 */
public class Factory {
    /**
     * Instancia de la clase Factory
     */
    private static Factory instance;
    /**
     * Constructor por defecto no parametrizado de la clase Factory
     */
    private Factory(){}
    /**
     * Clase singleton
     * @return Instancia de la clase factory
     */
    public static Factory getInstance(){
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository.
     *
     * @return una clase hija de la abstracción IOrderRepository.
     */
    public IOrderRepository getRepository(String prmType){
        IOrderRepository result = null;
        switch (prmType){
            case "default":
                result = new OrderRepository(); 
                break;
        }
        return result;
    }
}

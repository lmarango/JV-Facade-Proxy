package co.unicauca.facade.domain;

/**
 * Clase del cliente
 * @author Luis Manuel Arango, Javier Steven Duran
 */
public class Customer {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Describe el dentificadoe del cliente
     */
    private int id;
    /**
     * Nombre del cliente
     */
    private String name;
    /**
     * Dirección de residencia del cliente
     */
    private String address;   
    /**
     * Numero telefonico 
     */
    private String mobile;
    /**
     * Ciudad de residencia
     */
    private String city;
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Constructor parametrizado de la clase Customer
     * @param id identicacion
     * @param name Nombre
     * @param address dirección 
     * @param mobile teléfono
     * @param city ciudad
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCity() {
        return city;
    }
    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setCity(String city) {
        this.city = city;
    }
//</editor-fold>

}

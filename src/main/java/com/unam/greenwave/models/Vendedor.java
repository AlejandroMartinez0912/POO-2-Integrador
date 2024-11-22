package com.unam.greenwave.models;
/**
 * Clase que representa a un vendedor.
 */
public class Vendedor extends Usuario{

    //Atributos
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String province;
    private String city;
    private String postalCode;
    private String address;
    private String numberPhone;

   /**
     * Constructor para inicializar los atributos del vendedor.
     * 
     * @param id         Identificador único del vendedor.
     * @param name       Nombre del vendedor.
     * @param lastname   Apellido del vendedor.
     * @param email      Correo electrónico del vendedor.
     * @param province   Provincia del vendedor.
     * @param city       Ciudad del vendedor.
     * @param postalCode Código postal del vendedor.
     * @param address    Dirección del vendedor.
     * @param numberPhone Número de teléfono del vendedor.
     */

     public Vendedor(int id, String name, String lastname, String email, String province, String city, String postalCode, String address, String numberPhone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.province = province;
        this.city = city;
        this.postalCode = postalCode;
        this.address = address;
        this.numberPhone = numberPhone;
    }   

    //Metodos Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }   

    public String getAddress() {
        return address;
    }           

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }   

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
     // Métodos adicionales

    /**
     * Registra una nueva venta realizada por el vendedor.
     * 
     * @param venta Objeto de tipo Venta.
     */

     ///
     /// 
     /// 
     /// 
    
    /**
     * Representación en cadena del objeto Vendedor.
     * 
     * @return String con los datos del vendedor.
     */
    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", address='" + address + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
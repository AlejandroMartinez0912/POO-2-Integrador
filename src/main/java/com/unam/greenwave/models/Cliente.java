package com.unam.greenwave.models;

public class Cliente {
    private long id;
    private String name;
    private String lastname;
    private String email;
    private String province;
    private String city;
    private String postalCode;
    private String address;
    private String numberPhone;
    
    public Cliente() {
    }

    public Cliente(long id, String name, String lastname, String email, String province, String city, String postalCode,
            String address, String numberPhone) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public void setLastname(String lastname) {
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

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", province="
                + province + ", city=" + city + ", postalCode=" + postalCode + ", address=" + address + ", numberPhone="
                + numberPhone + "]";
    }

    
}

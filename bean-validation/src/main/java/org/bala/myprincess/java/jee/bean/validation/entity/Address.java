/**
 * 
 */
package org.bala.myprincess.java.jee.bean.validation.entity;

import java.io.Serializable;

/**
 * @author BalaajiChander
 *
 */
public class Address implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -4363136098471334031L;
    
    public Address() {
        // TODO Auto-generated constructor stub
    }
    
    private String doorNo;
    
    private String streetName;
    
    private String addressLine1;
    
    private String addressLine2;
    
    private String city;
    
    private String state;
    
    private String Nationality;
    
    private String zipCode;
    
    /**
     * @return the doorNo
     */
    public String getDoorNo() {
        return doorNo;
    }
    
    /**
     * @param doorNo
     *            the doorNo to set
     */
    public void setDoorNo( String doorNo ) {
        this.doorNo = doorNo;
    }
    
    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }
    
    /**
     * @param streetName
     *            the streetName to set
     */
    public void setStreetName( String streetName ) {
        this.streetName = streetName;
    }
    
    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }
    
    /**
     * @param addressLine1
     *            the addressLine1 to set
     */
    public void setAddressLine1( String addressLine1 ) {
        this.addressLine1 = addressLine1;
    }
    
    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }
    
    /**
     * @param addressLine2
     *            the addressLine2 to set
     */
    public void setAddressLine2( String addressLine2 ) {
        this.addressLine2 = addressLine2;
    }
    
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    
    /**
     * @param city
     *            the city to set
     */
    public void setCity( String city ) {
        this.city = city;
    }
    
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    
    /**
     * @param state
     *            the state to set
     */
    public void setState( String state ) {
        this.state = state;
    }
    
    /**
     * @return the nationality
     */
    public String getNationality() {
        return Nationality;
    }
    
    /**
     * @param nationality
     *            the nationality to set
     */
    public void setNationality( String nationality ) {
        Nationality = nationality;
    }
    
    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }
    
    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode( String zipCode ) {
        this.zipCode = zipCode;
    }
    
}

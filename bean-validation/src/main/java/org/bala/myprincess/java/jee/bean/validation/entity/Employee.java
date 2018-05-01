/**
 * 
 */
package org.bala.myprincess.java.jee.bean.validation.entity;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author BalaajiChander
 *
 */
public class Employee implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -6586067604369408060L;
    
    public Employee() {
        // TODO Auto-generated constructor stub
    }
    
    private Long id;
    
    @NotNull( message = "First Name cannot be null." )
    private String firstName;
    
    @NotNull( message = "Last name cannot be null." )
    @NotBlank
    private String lastName;
    @Min( value = 18, message = "Age should not be less than 18." )
    @Max( value = 150, message = "Age should not be greater than 150." )
    private String age;
    
    @Gender
    @Min( value = 4, message = "Gender should not be less than 4 := MALE." )
    @Max( value = 5, message = "Gender should not be greater than 6 := FEMALE." )
    @NotBlank
    private String gender;
    
    @ValidAddress
    @NotBlank
    private Address Address;
    
    @Email( message = "Not a valid email, exmaple aA1@aA.aA." )
    @NotBlank
    private String email;
    
    @Min( value = 10, message = "Not a valid Phone Number." )
    @Max( value = 12, message = "Not a valid Phone Number." )
    private int phoneNumber;
    
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    
    /**
     * @param id
     *            the id to set
     */
    public void setId( Long id ) {
        this.id = id;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    
    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }
    
    /**
     * @param age
     *            the age to set
     */
    public void setAge( String age ) {
        this.age = age;
    }
    
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * @param gender
     *            the gender to set
     */
    public void setGender( String gender ) {
        this.gender = gender;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * @param email
     *            the email to set
     */
    public void setEmail( String email ) {
        this.email = email;
    }
    
    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * @param phoneNumber
     *            the phoneNumber to set
     */
    public void setPhoneNumber( int phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }
    
}

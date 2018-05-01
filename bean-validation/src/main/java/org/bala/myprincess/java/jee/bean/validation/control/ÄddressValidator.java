/**
 * 
 */
package org.bala.myprincess.java.jee.bean.validation.control;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.bala.myprincess.java.jee.bean.validation.entity.Address;
import org.bala.myprincess.java.jee.bean.validation.entity.ValidAddress;

/**
 * @author BalaajiChander
 *
 */
public class ÄddressValidator implements ConstraintValidator< ValidAddress, Address > {
    
    @Override
    public boolean isValid( Address address, ConstraintValidatorContext arg1 ) {
        
        if ( address.getDoorNo().isEmpty() ) {
            return false;
        }
        return false;
    }
    
}

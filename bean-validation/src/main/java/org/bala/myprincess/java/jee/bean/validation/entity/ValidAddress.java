/**
 * 
 */
package org.bala.myprincess.java.jee.bean.validation.entity;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.bala.myprincess.java.jee.bean.validation.control.ÄddressValidator;

/**
 * @author BalaajiChander
 *
 */
@Constraint( validatedBy = ÄddressValidator.class )
@Documented
@Retention( RUNTIME )
@Target( { TYPE, FIELD, PARAMETER, LOCAL_VARIABLE, TYPE_PARAMETER } )

public @interface ValidAddress {
}

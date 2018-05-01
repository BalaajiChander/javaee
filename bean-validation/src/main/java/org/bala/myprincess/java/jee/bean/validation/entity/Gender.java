/**
 * 
 */
package org.bala.myprincess.java.jee.bean.validation.entity;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author BalaajiChander
 *
 */
@Documented
@Retention( RUNTIME )
@Target( { TYPE, FIELD, PARAMETER } )
public @interface Gender {
    
}

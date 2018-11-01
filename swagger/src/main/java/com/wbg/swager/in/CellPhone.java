package com.wbg.swager.in;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { IsCellPhone.class })
public @interface CellPhone {
    String regexp();

    javax.validation.constraints.Pattern.Flag[] flags() default { };

    String message() default "不是合法的手机编号，应该是11为";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
class IsCellPhone implements ConstraintValidator<CellPhone,String>{

    @Override
    public void initialize(CellPhone constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value!=null&& Pattern.matches("^[0-9]{11}",value);
    }
}

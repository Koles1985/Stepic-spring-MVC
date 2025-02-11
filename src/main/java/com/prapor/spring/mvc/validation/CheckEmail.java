package com.prapor.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidation.class)
public @interface CheckEmail {

    public String value() default "abc.ru";
    public String message() default "mast by ends with abc.ru";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}

package com.prapor.spring.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CheckEmailValidation implements ConstraintValidator<CheckEmail, String>{

    private String emailEndsOf;
    @Override
    public boolean isValid(String validEndEmail, ConstraintValidatorContext constraintValidatorContext) {
        return validEndEmail.endsWith(emailEndsOf);
    }

    @Override
    public void initialize(CheckEmail emailEndsOf) {
        this.emailEndsOf = emailEndsOf.value();
    }
}

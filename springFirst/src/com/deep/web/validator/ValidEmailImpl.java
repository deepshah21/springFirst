package com.deep.web.validator;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.EmailValidator;


//you have to pass two parameter in interface
public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {
	
	private int min;
	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		// TODO Auto-generated method stub
		min= constraintAnnotation.min();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(!(value.length()>=min)){
			return true;
		}
		if(org.apache.commons.validator.routines.EmailValidator.getInstance(false).isValid(value)){
			return true;
		}
		
		return false;
	}

}

package com.vinay.springmvcdemo.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValiidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

   public void initialize(CourseCode constraint) {
      coursePrefix = constraint.value();
   }

   public boolean isValid(String theCode, ConstraintValidatorContext context) {

      return theCode.startsWith(coursePrefix);
   }
}

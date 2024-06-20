package com.bookstore.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.lang.annotation.ElementType.*;
import java.lang.reflect.Type;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = validCategoryIdValidator.class)
public @interface ValidCategoryId {
    String message() default "Danh muc khong hop le";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

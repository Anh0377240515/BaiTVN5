package com.bookstore.validator;

import com.bookstore.controller.CategoryController;
import com.bookstore.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class validCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext constraintValidatorContext)
    {
        return category!=null&&category.getId()!=null;
    }
}

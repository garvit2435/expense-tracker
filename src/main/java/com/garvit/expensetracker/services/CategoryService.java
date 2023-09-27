package com.garvit.expensetracker.services;

import com.garvit.expensetracker.domain.Category;
import com.garvit.expensetracker.exceptions.EtBadRequestException;
import com.garvit.expensetracker.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransaction(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}

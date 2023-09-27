package com.garvit.expensetracker.domain;

public class Category {
    private final Integer categoryId;
    private final Integer userId;
    private final String title;
    private final String description;
    private final Double totalExpense;

    public Category(Integer categoryId, Integer userId, String title, String description, Double totalExpense) {
        this.categoryId = categoryId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.totalExpense = totalExpense;
    }
}

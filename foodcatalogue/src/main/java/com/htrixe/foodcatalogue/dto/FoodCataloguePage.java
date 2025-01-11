package com.htrixe.foodcatalogue.dto;

import com.htrixe.foodcatalogue.entity.FoodItem;


import java.util.List;

public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;

    public FoodCataloguePage() {
    }

    public FoodCataloguePage(List<FoodItem> foodItemsList, Restaurant restaurant) {
        this.foodItemsList = foodItemsList;
        this.restaurant = restaurant;
    }

    public List<FoodItem> getFoodItemsList() {
        return foodItemsList;
    }

    public void setFoodItemsList(List<FoodItem> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}

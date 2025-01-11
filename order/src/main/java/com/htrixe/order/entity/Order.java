package com.htrixe.order.entity;

import com.htrixe.order.dto.FoodItemsDTO;
import com.htrixe.order.dto.Restaurant;
import com.htrixe.order.dto.UserDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document("order")
public class Order {
    private Integer orderId;

    private String itemName;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

    public Order() {
    }

    public Order(Integer orderId, List<FoodItemsDTO> foodItemsList, Restaurant restaurant, UserDTO userDTO) {
        this.orderId = orderId;
        this.foodItemsList = foodItemsList;
        this.restaurant = restaurant;
        this.userDTO = userDTO;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<FoodItemsDTO> getFoodItemsList() {
        return foodItemsList;
    }

    public void setFoodItemsList(List<FoodItemsDTO> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }
}
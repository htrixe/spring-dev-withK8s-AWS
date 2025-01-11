package com.htrixe.order.dto;

import java.util.List;

public class OrderDTO {

    private Integer orderId;
    private String itemName;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

    public OrderDTO() {
    }

    public OrderDTO(Integer orderId, String itemName, List<FoodItemsDTO> foodItemsList, Restaurant restaurant, UserDTO userDTO) {
        this.orderId = orderId;
        this.itemName = itemName;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

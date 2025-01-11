package com.htrixe.foodcatalogue.mapper;
import com.htrixe.foodcatalogue.dto.FoodItemDTO;
import com.htrixe.foodcatalogue.entity.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FoodItemMapper {

    FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
    @Mapping(target = "itemName", source = "itemName")
    FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO);

    @Mapping(target = "itemName", source = "itemName")
    FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem);


}

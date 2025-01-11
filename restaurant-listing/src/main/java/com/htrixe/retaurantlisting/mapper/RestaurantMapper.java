package com.htrixe.retaurantlisting.mapper;


import com.htrixe.retaurantlisting.dto.RestaurantDTO;
import com.htrixe.retaurantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {

    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);


    @Mapping(target = "name", source = "name")
    @Mapping(target = "city", source = "city")
    Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);

    @Mapping(target = "name", source = "name")
    @Mapping(target = "city", source = "city")
    RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);

}
package com.htrixe.order.mapper;

import com.htrixe.order.dto.OrderDTO;
import com.htrixe.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(target = "userDTO", source = "userDTO")
    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    @Mapping(target = "userDTO", source = "userDTO")
    OrderDTO mapOrderToOrderDTO(Order order);

}
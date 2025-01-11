package com.htrixe.userinfo.mapper;

import com.htrixe.userinfo.dto.UserDTO;
import com.htrixe.userinfo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "userName", source = "userName")
    User mapUserDTOToUser(UserDTO userDTO);
    @Mapping(target = "userName", source = "userName")
    UserDTO mapUserToUserDTO(User user);

}
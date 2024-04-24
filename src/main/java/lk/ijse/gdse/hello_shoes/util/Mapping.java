package lk.ijse.gdse.hello_shoes.util;

import lk.ijse.gdse.hello_shoes.dto.UserDTO;
import lk.ijse.gdse.hello_shoes.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapping {
    private  final ModelMapper mapper;
    public Mapping(ModelMapper mapper){
        this.mapper = mapper;
    }


    // -----------  user mapping  -------------

    public UserDTO toUserDto(User user){
        return mapper.map(user,UserDTO.class);
    }

    public User toUserEntity(UserDTO userDTO){
        return mapper.map(userDTO, User.class);
    }
}

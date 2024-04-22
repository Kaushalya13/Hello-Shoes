package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    void saveUser(UserDTO user);
}

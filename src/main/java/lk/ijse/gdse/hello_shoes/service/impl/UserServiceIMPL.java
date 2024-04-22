package lk.ijse.gdse.hello_shoes.service.impl;

import lk.ijse.gdse.hello_shoes.dao.UserRepo;
import lk.ijse.gdse.hello_shoes.dto.UserDTO;
import lk.ijse.gdse.hello_shoes.service.UserService;
import lk.ijse.gdse.hello_shoes.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserRepo userRepo;
    private final Mapping map;

    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                userRepo.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }

    @Override
    public void saveUser(UserDTO user) {
        map.toUserDTO(userRepo.save(map.toUse(user)));
    }
}

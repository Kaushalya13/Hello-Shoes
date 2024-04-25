package lk.ijse.gdse.hello_shoes.service.impl;

import lk.ijse.gdse.hello_shoes.dao.UserRepo;
import lk.ijse.gdse.hello_shoes.dto.UserDTO;
import lk.ijse.gdse.hello_shoes.entity.Role;
import lk.ijse.gdse.hello_shoes.reqAndrsp.response.JWTAuthResponse;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignIn;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignUp;
import lk.ijse.gdse.hello_shoes.service.AuthenticationService;
import lk.ijse.gdse.hello_shoes.service.JWTService;
import lk.ijse.gdse.hello_shoes.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceIMPL implements AuthenticationService {
    private final UserRepo userRepo;
    private final JWTService jwtService;
    private final Mapping mapping;


    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;


    @Override
    public JWTAuthResponse signIn(SignIn signIn) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        signIn.getEmail(),
                        signIn.getPassword()));
        var userByEmail =userRepo.findByEmail(signIn.getEmail())
                .orElseThrow(() ->  new UsernameNotFoundException("User Not Found"));
        var generateToken = jwtService.generateToken(userByEmail);
        return JWTAuthResponse.builder().token(generateToken).build();
    }

    @Override
    public JWTAuthResponse signUp(SignUp signUp) {
        UserDTO buildUser = UserDTO.builder()
                .userId(UUID.randomUUID().toString())
                .email(signUp.getEmail())
                .password(passwordEncoder.encode(signUp.getPassword()))
                .role(Role.valueOf(signUp.getRole()))
                .build();
        var saveUser = userRepo.save(mapping.toUserEntity(buildUser));
        String generateToken = jwtService.generateToken(saveUser);
        return JWTAuthResponse.builder().token(generateToken).build();
    }
}

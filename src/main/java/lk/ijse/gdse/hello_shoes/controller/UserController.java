package lk.ijse.gdse.hello_shoes.controller;

import lk.ijse.gdse.hello_shoes.reqAndrsp.response.JWTAuthResponse;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignIn;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignUp;
import lk.ijse.gdse.hello_shoes.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final AuthenticationService authenticationService;
    @GetMapping("/health")
    public String healthCheck(){
        System.out.println("User Health Test");
        return "User Health Test";
    }

    //signUp
    @PostMapping("signUp")
    public ResponseEntity<JWTAuthResponse> signUp(@RequestBody SignUp signUp){
        return ResponseEntity.ok(authenticationService.signUp(signUp));
    }

    //signIn
    public ResponseEntity<JWTAuthResponse> signIn(@RequestBody SignIn signIn){
        return ResponseEntity.ok(authenticationService.signIn(signIn));
    }
}

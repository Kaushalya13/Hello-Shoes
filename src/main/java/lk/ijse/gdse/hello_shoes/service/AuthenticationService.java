package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.reqAndrsp.response.JWTAuthResponse;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignIn;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignUp;

public interface AuthenticationService {
    JWTAuthResponse signIn (SignIn signIn);
    JWTAuthResponse signUp (SignUp signUp);
}

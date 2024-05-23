package lk.ijse.gdse.hello_shoes.service;

import lk.ijse.gdse.hello_shoes.dto.EmployeeDTO;
import lk.ijse.gdse.hello_shoes.reqAndrsp.response.JWTAuthResponse;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignIn;
import lk.ijse.gdse.hello_shoes.reqAndrsp.secure.SignUp;

public interface AuthenticationService {
    JWTAuthResponse signIn (SignIn signIn);
    JWTAuthResponse signUp ();
    JWTAuthResponse signUp(SignUp signUp, EmployeeDTO employeeDTO);
}

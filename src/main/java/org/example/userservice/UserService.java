package org.example.userservice;

import org.example.ui.model.request.UserDetailsRequestModel;
import org.example.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}

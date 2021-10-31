package com.saqif.todo.rest.api.services;

import com.saqif.todo.rest.api.domain.User;
import com.saqif.todo.rest.api.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String Password) throws EtAuthException;
}

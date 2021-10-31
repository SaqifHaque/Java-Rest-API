package com.saqif.todo.rest.api.services;

import com.saqif.todo.rest.api.domain.User;
import com.saqif.todo.rest.api.exceptions.EtAuthException;

public class UserServiceImpl implements UserService {


    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String Password) throws EtAuthException {
        return null;
    }
}

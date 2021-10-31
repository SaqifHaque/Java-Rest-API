package com.saqif.todo.rest.api.repositories;

import com.saqif.todo.rest.api.domain.User;
import com.saqif.todo.rest.api.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);



}

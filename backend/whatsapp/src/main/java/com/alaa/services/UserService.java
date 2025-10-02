package com.alaa.services;

import java.util.List;

import com.alaa.exceptions.UserException;
import com.alaa.models.User;
import com.alaa.requests.UpdateUserRequest;


public interface UserService {

  public User findUserById(Integer id);
  
  public User findUserProfile(String jwt);

  public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;

  public List<User> searchUser(String query);

}

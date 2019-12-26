package com.teyyub.service;

import com.teyyub.model.User;
import java.util.List;

/**
 *
 * @author teyyub , 3:41:15 PM
 */
public interface UserService {

    public List listAllUsers();

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public User findUserById(int id);
}

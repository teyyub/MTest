package com.teyyub.repository;

import com.teyyub.model.User;
import java.util.List;

/**
 *
 * @author teyyub , 3:36:29 PM
 */
public interface UserDao {

    public List listAllUsers();

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public User findUserById(int id);
}

package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);   //(String email, String name, String lastname, String mail);

    List<User> getAllUsers();

    User getUser(Long id);


}

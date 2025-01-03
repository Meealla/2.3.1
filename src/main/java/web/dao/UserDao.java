package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User showUser(Long id);
}

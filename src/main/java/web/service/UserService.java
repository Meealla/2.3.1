package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void createUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User showUser(Long id);
}

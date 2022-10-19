package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(long id);
    User delete(long id);
    void create(User user);
    void update(int id, User user);

}

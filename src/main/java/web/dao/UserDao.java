package web.dao;


import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void createUser(User user);

    void updateUser(User user);

    User getUserById(long id);

    User deleteUser(long id);
}

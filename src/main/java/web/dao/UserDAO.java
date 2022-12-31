package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    List<User> getAllUserList();

    void addUser(User user);

    User getUserById(int id);

    void update(int id, User user);

    void delete (int id);

//    User getUserByID(int id);
}
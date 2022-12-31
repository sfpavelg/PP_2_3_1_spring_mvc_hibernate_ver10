package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUserList() {
        return userDAO.getAllUserList();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public User getUserById(int id){
        return userDAO.getUserById(id);
    }

    @Override
    public void update(int id, User user){
        userDAO.update(id, user);
    }

    @Override
    public void delete(int id){
        userDAO.delete(id);
    }

}
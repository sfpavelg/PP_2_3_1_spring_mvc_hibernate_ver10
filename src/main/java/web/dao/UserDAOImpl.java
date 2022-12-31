package web.dao;

import org.springframework.stereotype.Repository;
import web.dao.UserDAO;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void addUser(User user) {

        entityManager.persist(user);
    }

    @Override
    public List<User> getAllUserList() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User getUserById(int id) {

        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {

        entityManager.merge(user);
    }

    @Override
    public void delete(int id) {

        entityManager.remove(entityManager.find(User.class, id));
    }
}

//
//package web.dao;
//
//import org.springframework.stereotype.Component;
//import web.model.User;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class UserDAOImpl implements UserDAO {
//    private static  int PEOPLE_COUNT;
//    private List<User> users;
//
//    {
//        users = new ArrayList<>();
//        users.add(new User(++PEOPLE_COUNT, "Ivan", "Petrov", "63"));
//        users.add(new User(++PEOPLE_COUNT, "Vladimir", "Evtushenko", "42"));
//    }
//
//
//    @Override
//    public List<User> getAllUserList() {
//        return users;
//    }
//
//    @Override
//    public void addUser (User user){
//        user.setId(++PEOPLE_COUNT);
//        users.add(user);
//
//    }
//    @Override
//    public User getUserById(int id){
//
//        return users.stream().filter(users -> users.getId() == id).findAny().orElse(null);
//
//    }
//
//    @Override
//    public void update(int id, User updUser) {
//        User userUpdate = getUserById(id);
//        userUpdate.setName(updUser.getName());
//        userUpdate.setSurname(updUser.getSurname());
//        userUpdate.setAge(updUser.getAge());
//
//    }
//
//    @Override
//    public void delete (int id){
//
//        users.removeIf(users -> users.getId() == id);
//    }
//
//}

package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void create(User user) {
        userDAO.save(user);
    }

    public User read(int id) {
        return userDAO.findById(id).orElse(null);
    }

    public List<User> readAll() {
        return (List<User>) userDAO.findAll();
    }

    public void update(User user, int id) {
        User user1 = userDAO.findById(id).orElse(null);
        assert user1 != null;
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
        user1.setAge(user.getAge());
        userDAO.save(user1);
    }

    public void delete(int id) {
        userDAO.deleteById(id);
    }
}

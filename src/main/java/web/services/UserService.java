package web.services;

import web.models.User;

import java.util.List;

public interface UserService {

    void create(User user);

    User read(int id);

    List<User> readAll();

    void update(User user, int id);

    void delete(int id);
}

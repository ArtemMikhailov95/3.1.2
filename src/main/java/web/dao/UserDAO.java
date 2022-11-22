package web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.models.User;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {
}

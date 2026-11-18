package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(Long id);
    void save(User user);
    void update(Long id, User updatedUser);
    void delete(Long id);
}
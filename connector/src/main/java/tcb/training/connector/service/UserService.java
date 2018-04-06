package tcb.training.connector.service;



import java.util.Collection;
import java.util.Optional;

import tcb.training.connector.model.User;
import tcb.training.connector.model.UserCreateForm;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}

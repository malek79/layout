package tcb.training.connector.service;

import tcb.training.connector.model.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}

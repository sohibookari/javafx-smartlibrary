package org.kiteki.smartlibrary.dao;

import org.kiteki.smartlibrary.domain.auth.Role;
import org.kiteki.smartlibrary.domain.auth.User;

public interface AuthDao {
    User selectUser(String id);
    Role selectRole(String id);
    User selectUserByUserNameAndPasswd(User userinfo);
    Role selectRoleByUser(User user);
}

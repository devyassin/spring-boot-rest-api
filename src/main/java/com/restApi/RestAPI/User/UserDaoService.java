package com.restApi.RestAPI.User;



import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static Integer userCount=0;

    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOneUser(int id) {

        return users.stream().filter(u->u.getId().equals(id)).findFirst().orElse(null);
    }

    public User addUser(User user) {
      user.setId(++userCount);
      users.add(user);
      return user;
    }

    public void deleteUser(int id) {
         users.removeIf(u->u.getId().equals(id));
    }
}

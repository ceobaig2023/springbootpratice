package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users=new ArrayList<>();


    public List<User> getAllUsers() {
        return users;
    }

    public User getUserbyID(Long id) {
        return users.stream().filter(user->user.getId().equals(id)).findFirst().orElse(null);
      //  return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User createNewUser(User user) {
        users.add(user);
                return user;
    }

    public void deleteUser(Long id){
        users.removeIf(user -> user.getId().equals(id));
    }

}

package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return this.apiService.getUsers();
    }

    public void generateRandomUser() {
        this.apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        this.apiService.deleteUser(user);
    }
}

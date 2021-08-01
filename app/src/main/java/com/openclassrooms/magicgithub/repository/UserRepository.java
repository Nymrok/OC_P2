package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;
// Class name = "apiService", type = "ApiService"
// private = restricted view inside "UserRepository" only
// private = no inheritance
// final = ApiService can't be modified

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

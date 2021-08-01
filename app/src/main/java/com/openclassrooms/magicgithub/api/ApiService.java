package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import androidx.annotation.Nullable;

public interface ApiService {
    List<User> getUsers();
    void generateRandomUser();
    void deleteUser(User username);
}

/*
    All objects that implements this interface
    Receive all methods and constants that are stated here
*/
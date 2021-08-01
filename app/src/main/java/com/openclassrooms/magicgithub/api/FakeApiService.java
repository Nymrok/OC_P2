package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();
    // Variable "users" type "List<User>"
    // View restricted inside "FakeApiService" only
    // List<User> = list that holds elements of "User" type
    // Variable "users" get "generateUsers()" content from "FakeApiServiceGenerator" class

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        return this.users; // Getter returns public elements that were private
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() { // no param ?? because random ?
        // users.add(); // action = "add", what : "user", to : "users"
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) { // element : name = "user", type = "User"
        users.remove(user); // action = "delete", what : "user", to : "users"
    }
}

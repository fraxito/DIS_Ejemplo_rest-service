package com.ufv.restservice.restservice;

import java.util.ArrayList;

public class DataHandling {
    User getUserInfo (String name){
        User foundUser = null;
        JsonReader reader = new JsonReader();

        ArrayList<User> usersList = reader.readJsonFile("./src/main/resources/users.json");
        for (User user : usersList){
            if (user.getName().equalsIgnoreCase(name)){
                foundUser = user;
            }
        }

        return foundUser;
    }

    ArrayList<User> addUser (User newUser){
        JsonReader reader = new JsonReader();
        ArrayList<User> userList = reader.readJsonFile("./src/main/resources/users.json");
        userList.add(newUser);
        reader.writeJsonFile("./src/main/resources/users.json", userList);
        return userList;
    }
}

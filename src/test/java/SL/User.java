package SL;

import Exceptions.InvalidEmailException;

public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new InvalidEmailException("Invalid email: " + email);
        }
    }

    public User(String name, String email) {
        this.name = name;
        //this.email = email;

        setEmail(email);
    }

    @Override
    public String toString() {
        return "User {name = '" + name + "', email = '" + email + "'}";
    }
}



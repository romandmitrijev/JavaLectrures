package com.advancedFeatures.one;

public class User {
    private String email;

    public void setEmail(String email) {
        if (email.contains("@"))
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

class Test1 {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getEmail());
        user.setEmail("qwe");
        System.out.println(user.getEmail());
        user.setEmail("qwe@qwe");
        System.out.println(user.getEmail());
    }
}
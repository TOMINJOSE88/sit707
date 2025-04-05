package edu.deakin;

public class SimpleLoginForm {

    public String login(String username, String password) {
        if (username == null || username.isEmpty()) {
            return "Error: Enter username";
        }
        if (password == null || password.isEmpty()) {
            return "Error: Enter password";
        }
        if (username.equals("admin") && password.equals("password123")) {
            return "Success";
        }
        return "Error: Invalid credentials";
    }

    public static void main(String[] args) {
        SimpleLoginForm form = new SimpleLoginForm();
        System.out.println(form.login("admin", "password123")); // Success
        System.out.println(form.login("", "password123"));       // Error: Enter username
        System.out.println(form.login("admin", ""));             // Error: Enter password
        System.out.println(form.login("user", "pass"));          // Error: Invalid credentials
    }
}

package user;

import shared.Entity;

public class User extends Entity {
  private String username;
  private String email;
  private String password;

  public User(String username, String email, String password) {
      super(null);

      this.username = username;
      this.email = email;
      this.password = password;
  }

  // Getters
  public String getUsername() {
      return username;
  }

  public String getEmail() {
      return email;
  }

  public String getPassword() {
      return password;
  }

}
import user.User;

public class Main {
  public static void main(String[] args) {
    User user = new User("johndoe", "johndoe@gmail.com", "password123");

    System.out.println("User ID: " + user.getId());
    System.out.println("Username: " + user.getUsername());
    System.out.println("Email: " + user.getEmail());
    System.out.println("Password: " + user.getPassword());
  }
}

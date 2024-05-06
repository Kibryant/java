public class Main {
  public class User {
    private String name;
    private String email;
    private String password;
    private String role;
    private String status;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String dob;
    
    public User(String name, String email, String password, String role, String status, String phone, String address, String city, String state, String country, String zip, String dob) {
      this.name = name;
      this.email = email;
      this.password = password;
      this.role = role;
      this.status = status;
      this.phone = phone;
      this.address = address;
      this.city = city;
      this.state = state;
      this.country = country;
      this.zip = zip;
      this.dob = dob;
    }
    
  }
  public static void main(String[] args) {
    Main main = new Main();
    User user = main.new User("John Doe", "johndoe@gmail.com", "password", "user", "active", "1234567890", "123 Main St", "Anytown", "NY", "USA", "12345", "01/01/2000");

    System.out.println("Name: " + user.name);
    System.out.println("Email: " + user.email);
    System.out.println("Password: " + user.password);
    System.out.println("Role: " + user.role);
    System.out.println("Status: " + user.status);
    System.out.println("Phone: " + user.phone);
    System.out.println("Address: " + user.address);
    System.out.println("City: " + user.city);
    System.out.println("State: " + user.state);
    System.out.println("Country: " + user.country);
    System.out.println("Zip: " + user.zip);
    System.out.println("DOB: " + user.dob);

    System.out.println("Hello, World!");
  }
}

public class Authentication {
    private String validUsername = "admin";
    private String validPassword = "password";

    public void checkLogin(String username, String password) throws InvalidLoginException {
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidLoginException("Invalid username or password.");
        } else {
            System.out.println("Login successful!");
        }
    }
}

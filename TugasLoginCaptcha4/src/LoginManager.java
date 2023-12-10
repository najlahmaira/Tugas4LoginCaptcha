public class LoginManager {
    private static final String username = "admin";
    private static final String password = "password";

    public static boolean verifyLogin(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}

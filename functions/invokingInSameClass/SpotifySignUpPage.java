class SpotifySignUpPage {
    public static void main(String[] args) {
        signup("abc123@gmail.com", "dj", "dj777");
    }

    static void signup(String email, String username, String password) {
        System.out.println("Spotify Signup");
        System.out.println("The email address entered is " + email + ".");
        System.out.println("The username chosen by the user is " + username + ".");
        System.out.println("The password created for the account is " + password + ".");
    }
}
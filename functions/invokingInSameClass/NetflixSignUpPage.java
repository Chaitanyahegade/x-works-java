class NetflixSignUpPage {
    public static void main(String[] args) {
        signup("abc123@gmail.com", "dj777", "Premium");
    }

    static void signup(String email, String password, String plan) {
        System.out.println("Netflix Signup");
        System.out.println("The email address entered is " + email + ".");
        System.out.println("The password created for the account is " + password + ".");
        System.out.println("The selected subscription plan is " + plan + ".");
    }
}
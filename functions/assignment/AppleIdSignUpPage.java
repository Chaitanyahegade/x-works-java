class AppleIdSignUpPage {
    public static void main(String[] args) {
        signup("Roy", "dj", "abc123@gmail.com", "dj777");
    }

    static void signup(String firstName, String lastName, String email, String password) {
        System.out.println("Apple ID Signup");
        System.out.println("The user's first name is " + firstName + ".");
        System.out.println("The user's last name is " + lastName + ".");
        System.out.println("The registered email address is " + email + ".");
        System.out.println("The password entered by the user is " + password + ".");
    }
}
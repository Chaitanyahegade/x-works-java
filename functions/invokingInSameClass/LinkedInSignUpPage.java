class LinkedInSignUpPage {
    public static void main(String[] args) {
        signup("abc123@gmail.com", "dj777", "Roy", "dj");
    }

    static void signup(String email, String password, String firstName, String lastName) {
        System.out.println("LinkedIn Signup");
        System.out.println("The email address used for registration is " + email + ".");
        System.out.println("The password entered is " + password + ".");
        System.out.println("The user's first name is " + firstName + ".");
        System.out.println("The user's last name is " + lastName + ".");
    }
}
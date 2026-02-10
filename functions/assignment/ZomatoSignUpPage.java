class ZomatoSignUpPage {
    public static void main(String[] args) {
        signup("Roy", 9999695872L, "abc123@gmail.com");
    }

    static void signup(String name, long mobileNumber, String email) {
        System.out.println("Zomato Signup");
        System.out.println("The name entered by the user is " + name + ".");
        System.out.println("The mobile number provided is " + mobileNumber + ".");
        System.out.println("The email address entered is " + email + ".");
    }
}
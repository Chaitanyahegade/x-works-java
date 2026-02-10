class FlipkartSignUpPage {
    public static void main(String[] args) {
        signup(78996952342L, "abc123@gmail.com", 9447);
    }

    static void signup(long mobileNumber, String email, int otp) {

        System.out.println("Flipkart Signup");
        System.out.println("The mobile number entered for registration is " + mobileNumber + ".");
        System.out.println("The email address provided by the user is " + email + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
class InstagramSignUpPage {
    public static void main(String[] args) {
        signup("Roy", "dj", "dj777",
               "abc123@gmail.com", 999695872L, "1-05-2000", 9999);
    }

    static void signup(String fullName, String userName, String password,
                       String email, long mobileNumber, String dob, int otp) {

        System.out.println("Instagram Signup");
        System.out.println("The full name entered by the user is " + fullName + ".");
        System.out.println("The username chosen is " + userName + ".");
        System.out.println("The password created is " + password + ".");
        System.out.println("The email address provided is " + email + ".");
        System.out.println("The mobile number entered is " + mobileNumber + ".");
        System.out.println("The date of birth entered is " + dob + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
public class Gmail {
    static void signup(String firstName, String lastName, String userName,
                       String password, String confirmPassword,
                       long mobileNumber, String recoveryEmail,
                       String dob, String gender, int otp) {

        System.out.println("Gmail Signup");
        System.out.println("The user's first name is " + firstName + ".");
        System.out.println("The user's last name is " + lastName + ".");
        System.out.println("The chosen username is " + userName + ".");
        System.out.println("The password entered by the user is " + password + ".");
        System.out.println("The confirmed password is " + confirmPassword + ".");
        System.out.println("The mobile number provided is " + mobileNumber + ".");
        System.out.println("The recovery email address is " + recoveryEmail + ".");
        System.out.println("The date of birth entered is " + dob + ".");
        System.out.println("The gender selected by the user is " + gender + ".");
        System.out.println("The OTP sent for verification is " + otp + ".");
    }
}

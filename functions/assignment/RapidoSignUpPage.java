class RapidoSignUpPage {
    public static void main(String[] args) {
        signup("Roy", 8877695872L, 0000);
    }

    static void signup(String name, long mobileNumber, int otp) {
        System.out.println("Rapido Signup");
        System.out.println("The name entered by the user is " + name + ".");
        System.out.println("The mobile number used for registration is " + mobileNumber + ".");
        System.out.println("The OTP generated for verification is " + otp + ".");
    }
}
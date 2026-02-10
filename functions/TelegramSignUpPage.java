class TelegramSignUpPage {
    public static void main(String[] args) {
        signup("Roy", 4433695872L, 7777);
    }

    static void signup(String fullName, long mobile, int otp) {
        System.out.println("Telegram Signup");
        System.out.println("The full name entered is " + fullName + ".");
        System.out.println("The mobile number used for registration is " + mobile + ".");
        System.out.println("The OTP sent for verification is " + otp + ".");
    }
}
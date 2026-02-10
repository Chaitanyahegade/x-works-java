class SwiggySignUpPage {
    public static void main(String[] args) {
        signup("Roy", 6655695872L, "Dubai");
    }

    static void signup(String name, long mobileNumber, String location) {
        System.out.println("Swiggy Signup");
        System.out.println("The name entered by the user is " + name + ".");
        System.out.println("The mobile number provided is " + mobileNumber + ".");
        System.out.println("The delivery location selected is " + location + ".");
    }
}
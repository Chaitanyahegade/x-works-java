class MobileExecutor{
    public static void main(String[] args) {
        boolean statusOfMobile = Mobile.statusCheck();
        System.out.println(statusOfMobile);
        System.out.println("Current brightness: " + Mobile.increase_brightness());
    }
}
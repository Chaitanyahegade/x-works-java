class HairdryerExecutor{
    public static void main(String[] args) {
        boolean statusOfHairdryer = Hairdryer.statusCheck();
        System.out.println(statusOfHairdryer);
        System.out.println(Hairdryer.currentSpeed);
    }
}
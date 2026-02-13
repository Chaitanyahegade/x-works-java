class OvenExecutor{
    public static void main(String[] args) {
        boolean statusOfDoor = Oven.statusCheck();
        System.out.println(statusOfDoor);
        System.out.println("Current heat: " + Oven.increase_heat());
    }
}
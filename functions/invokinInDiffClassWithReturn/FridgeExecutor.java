class FridgeExecutor{
    public static void main(String[] args) {
        boolean statusOfDoor = Fridge.statusCheck();
        System.out.println(statusOfDoor);
        System.out.println(Fridge.increase_coolness());
    }
}
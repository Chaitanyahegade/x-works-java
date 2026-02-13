class HeadlightExecutor{
    public static void main(String[] args) {
        boolean statusOfHeadlight = Headlight.statusCheck();
        System.out.println(statusOfHeadlight);
        System.out.println(Headlight.increase_brightness());
    }
}
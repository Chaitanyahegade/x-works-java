class HeadphoneExecutor{
    public static void main(String[] args) {
        boolean statusOfHeadphone = Headphone.statusCheck();
        System.out.println(statusOfHeadphone);
        System.out.println(Headphone.increase_volume());
    }
}
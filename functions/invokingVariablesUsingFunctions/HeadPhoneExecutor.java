class HeadPhoneExecutor {

    public static void main(String[] args) {

        boolean on = HeadPhone.switchSound();
        System.out.println("The HeadPhone is currently turned On : " + on);

        HeadPhone.increaseVolume();
        HeadPhone.increaseVolume();
        HeadPhone.increaseVolume();
        HeadPhone.increaseVolume();
        HeadPhone.increaseVolume();

        HeadPhone.decreaseVolume();
        HeadPhone.decreaseVolume();
        HeadPhone.decreaseVolume();
        HeadPhone.decreaseVolume();
        HeadPhone.decreaseVolume();

        boolean off = HeadPhone.switchSound();
        System.out.println("The HeadPhone is currently turned On : " + off);
    }
}

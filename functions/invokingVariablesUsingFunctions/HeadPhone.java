class HeadPhone {

    static boolean soundEnabled;

    static int currentVolume;
    static int maxVolume = 10;
    static int minVolume = 0;

    static boolean switchSound() {

        if (soundEnabled == false) {
            soundEnabled = true;
            System.out.println("HeadPhone is turned ON...");
        } else {
            soundEnabled = false;
            System.out.println("HeadPhone is turned OFF...");
        }

        return soundEnabled;
    }

    static void increaseVolume() {
        System.out.println("increaseVolume is invoked...");
        System.out.println("number of args : " + 0);

        if (soundEnabled == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current volume is : " + currentVolume);
            } else {
                System.out.println("Maximum volume reached");
            }
        } else {
            System.out.println("First turn on the HeadPhone");
        }
    }

    static void decreaseVolume() {
        System.out.println("decreaseVolume is invoked...");
        System.out.println("number of args : " + 0);

        if (soundEnabled == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current volume is : " + currentVolume);
            } else {
                System.out.println("Minimum volume reached");
            }
        } else {
            System.out.println("First turn on the HeadPhone");
        }
    }
}

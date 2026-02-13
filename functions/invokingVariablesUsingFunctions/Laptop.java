class Laptop {

    static boolean deviceActive;

    static boolean controlDevice(){

        if (deviceActive == false) {
            deviceActive = true;
            System.out.println("Laptop is powered ON...");
        } else {
            deviceActive = false;
            System.out.println("Laptop is powered OFF...");
        }

        return deviceActive;
    }
}

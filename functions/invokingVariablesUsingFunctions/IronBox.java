class IronBox {

    static boolean heatingStatus;

    static int currentTemperature;
    static int maxTemperature = 100;
    static int minTemperature = 0;

    static boolean pressControl() {

        if (heatingStatus == false) {
            heatingStatus = true;
            System.out.println("Iron Box is heating...");
        } else {
            heatingStatus = false;
            System.out.println("Iron Box is cooling down...");
        }

        return heatingStatus;
    }

    static void increaseTemperature() {
        System.out.println("increaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (heatingStatus == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 10;
                System.out.println("Current temperature is : " + currentTemperature);
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("First turn on the IronBox");
        }
    }

    static void decreaseTemperature() {
        System.out.println("decreaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (heatingStatus == true) {
            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 10;
                System.out.println("Current temperature is : " + currentTemperature);
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("First turn on the IronBox");
        }
    }
}

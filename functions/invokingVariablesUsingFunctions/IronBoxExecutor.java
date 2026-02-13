class IronBoxExecutor {

    public static void main(String[] args) {

        boolean on = IronBox.pressControl();
        System.out.println("The IronBox is currently turned On : " + on);

        IronBox.increaseTemperature();
        IronBox.increaseTemperature();
        IronBox.increaseTemperature();
        IronBox.increaseTemperature();
        IronBox.increaseTemperature();

        IronBox.decreaseTemperature();
        IronBox.decreaseTemperature();
        IronBox.decreaseTemperature();
        IronBox.decreaseTemperature();
        IronBox.decreaseTemperature();

        boolean off = IronBox.pressControl();
        System.out.println("The IronBox is currently turned On : " + off);
    }
}

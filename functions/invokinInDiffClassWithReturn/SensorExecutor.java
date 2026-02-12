class SensorExecutor{
    public static void main(String[] args) {
        boolean statusOfSensor = Sensor.statusCheck();
        System.out.println(statusOfSensor);
    }
}
class Heater{
	
	static boolean heatedMode ;
    static int currentTemperature;
    static int maxTemperature=10;
    static int minTemperature=0;	
	
	static boolean controlHeat(){
		
		if(heatedMode == false){
			heatedMode = true;
			System.out.println("The Heater is turned on ..");
		}else{
			heatedMode = false;
			System.out.println("The Heater is turned off ..");
		}
		
		return heatedMode;
	}
	
	
	static void increaseTemperature() {
        System.out.println("increaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (heatedMode == true) {
            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 1;
                System.out.println("The current temperature is : " + currentTemperature + "°C");
            } else {
                System.out.println("Maximum temperature reached");
            }
        } else {
            System.out.println("First turn on the Heater");
        }
    }

    static void decreaseTemperature() {
        System.out.println("decreaseTemperature is invoked...");
        System.out.println("number of args : " + 0);

        if (heatedMode == true) {
            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 1;
                System.out.println("The current temperature is : " + currentTemperature + "°C");
            } else {
                System.out.println("Minimum temperature reached");
            }
        } else {
            System.out.println("First turn on the Heater");
        }
    }
	
}
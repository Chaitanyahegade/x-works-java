class HeaterExecutor{


	public static void main (String[] heaterstatus){
		
		boolean on = Heater.controlHeat();
		
		System.out.println("The Heater is currently turned On : "+on);
		
		Heater.increaseTemperature();
		Heater.increaseTemperature();
		Heater.increaseTemperature();
		Heater.increaseTemperature();
		Heater.increaseTemperature();
		Heater.decreaseTemperature();
		Heater.decreaseTemperature();
		Heater.decreaseTemperature();
	    boolean off = Heater.controlHeat();
		
		System.out.println("The Heater is currently turned On : "+off);
		Heater.decreaseTemperature();
		Heater.decreaseTemperature();
	}
	
}
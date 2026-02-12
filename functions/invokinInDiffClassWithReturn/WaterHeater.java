class WaterHeater{

    static boolean isOn;

    static boolean statusCheck(){
        if(isOn==false){
            System.out.println("The water heater is Off");
            isOn = true;
        }
        else{
            System.out.println("The water heater is On");
            isOn = false;
        }
            
        return isOn;
    }
}
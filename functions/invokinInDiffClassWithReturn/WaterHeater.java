class WaterHeater{

    static boolean isOn;
    static int currentHeat = 30;
    static int maxHeat = 100;

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

    static int increase_heat(){
        if(!statusCheck()){
            System.out.println("Turn on the water heater please");
        }

        if(currentHeat < maxHeat){
            currentHeat += 10;
        }
        else{
            System.out.println("This is the max heat for the water heater buddy");
        }

        return currentHeat;
    }
}
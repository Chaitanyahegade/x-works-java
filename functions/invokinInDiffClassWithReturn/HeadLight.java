class Headlight{

    static boolean isOn;
    static int currentBrightness = 1;
    static int maxBrightness = 10;
    static boolean statusCheck(){
        if(isOn==false){
            System.out.println("The headlight is Off");
            isOn = true;
        }
        else{
            System.out.println("The headlight is On");
            isOn = false;
        }
            
        return isOn;
    }

    static int increase_brightness(){
        if(!statusCheck()){
            System.out.println("Unlock the Head light please");
        }

        if(currentBrightness < maxBrightness){
            currentBrightness += 1;
        }
        else{
            System.out.println("This is the max brightness for the Head light buddy");
        }

        return currentBrightness;
    }
}
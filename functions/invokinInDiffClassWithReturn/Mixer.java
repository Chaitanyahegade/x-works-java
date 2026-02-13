class Mixer{

    static boolean isOn;

    static boolean statusCheck(){
        if(isOn==false){
            System.out.println("The mixer is Off");
            isOn = true;
        }
        else{
            System.out.println("The mixer is On");
            isOn = false;
        }
            
        return isOn;
    }

    static int currentSpeed=1;
    static int maxSpeed = 6;
    static int increase_speed(){
        if(!statusCheck()){
            System.out.println("Turn on the mixer please");
        }
        if(currentSpeed<maxSpeed){
            currentSpeed+=1;
        }
        else{
            System.out.println("This is the max speed for the mixer buddy");
        }
        return currentSpeed;
    }
}
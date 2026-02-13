class Hairdryer{

    static boolean isOn;
    static int currentSpeed=1;
    static int maxSpeed = 10;
    static boolean statusCheck(){
        if(isOn==false){
            System.out.println("The hairdryer is Off");
            isOn = true;
        }
        else{
            System.out.println("The hairdryer is On");
            isOn = false;
        }
            
        return isOn;
    }

    static int increase_speed(){
        if(!statusCheck()){
            System.out.println("Turn on the Dryer please");
        }
        if(currentSpeed<maxSpeed){
            currentSpeed+=1;
        }
        else{
            System.out.println("This is the max speed for the Dryer buddy");
        }
        return currentSpeed;
    }
}
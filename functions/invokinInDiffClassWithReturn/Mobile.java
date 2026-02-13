class Mobile{

    static boolean isLocked;

    static boolean statusCheck(){
        if(isLocked==false){
            System.out.println("The mobile is Unlocked");
            isLocked = true;
        }
        else{
            System.out.println("The mobile is Locked");
            isLocked = false;
        }
            
        return isLocked;
    }

    static int currentBrightness = 1;
    static int maxBrightness = 10;
    static int increase_brightness(){
        if(!statusCheck()){
            System.out.println("Unlock the mobile please");
        }

        if(currentBrightness < maxBrightness){
            currentBrightness += 1;
        }
        else{
            System.out.println("This is the max brightness for the mobile buddy");
        }

        return currentBrightness;
    }
}
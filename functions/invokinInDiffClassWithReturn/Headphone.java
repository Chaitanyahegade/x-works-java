class Headphone{

    static boolean isConnected;
    
    static int currentVolume = 10;
    static int maxVolume = 100;

    static boolean statusCheck(){
        if(isConnected==false){
            System.out.println("The headphone is disconnected");
            isConnected = true;
        }
        else{
            System.out.println("The headphone is connected");
            isConnected = false;
        }
            
        return isConnected;
    }

    static int increase_volume(){
        if(!statusCheck()){
            System.out.println("Connect the headphone please");
        }

        if(currentVolume < maxVolume){
            currentVolume += 5;
        }
        else{
            System.out.println("This is the max volume for the headphone buddy");
        }

        return currentVolume;
    }
}
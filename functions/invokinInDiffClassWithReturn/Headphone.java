class Headphone{

    static boolean isConnected;

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
}
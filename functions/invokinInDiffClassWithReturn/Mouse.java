class Mouse{

    static boolean isConnected;

    static boolean statusCheck(){
        if(isConnected==false){
            System.out.println("The mouse is disconnected");
            isConnected = true;
        }
        else{
            System.out.println("The mouse is connected");
            isConnected = false;
        }
            
        return isConnected;
    }
}
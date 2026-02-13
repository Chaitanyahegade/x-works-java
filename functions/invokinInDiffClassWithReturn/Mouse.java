class Mouse{

    static boolean isConnected;
    static int currentDPI = 400;
    static int maxDPI = 3200;

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

    static int increase_dpi(){
        if(!statusCheck()){
            System.out.println("Connect the mouse please");
        }

        if(currentDPI < maxDPI){
            currentDPI += 400;
        }
        else{
            System.out.println("This is the max DPI for the mouse buddy");
        }

        return currentDPI;
    }
}
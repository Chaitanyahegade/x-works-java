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
}
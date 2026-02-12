class Headlight{

    static boolean isOn;

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
}
class Hairdryer{

    static boolean isOn;

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
}
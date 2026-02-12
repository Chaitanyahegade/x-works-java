class Sensor{

    static boolean isActive;

    static boolean statusCheck(){
        if(isActive==false){
            System.out.println("The sensor is Inactive");
            isActive = true;
        }
        else{
            System.out.println("The sensor is Active");
            isActive = false;
        }
            
        return isActive;
    }
}
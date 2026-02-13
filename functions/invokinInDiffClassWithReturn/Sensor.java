class Sensor{

    static boolean isActive;
    
    static int dataValue = 0;
    static int maxDataLimit = 100;

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

    static int getTheData(){
        if(!statusCheck()){
            System.out.println("Activate the sensor please");
        }

        if(dataValue < maxDataLimit){
            dataValue += 10;
        }
        else{
            System.out.println("Maximum data limit reached buddy");
        }

        return dataValue;
    }
}
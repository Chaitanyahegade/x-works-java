class Oven{

    static boolean isDoorOpen;
    static int currentHeat = 100;
    static int maxHeat = 500;

    static boolean statusCheck(){
        if(isDoorOpen==false){
            System.out.println("The oven door is closed");
            isDoorOpen = true;
        }
        else{
            System.out.println("The oven door is Open");
            isDoorOpen = false;
        }
            
        return isDoorOpen;
    }

    static int increase_heat(){
        if(!statusCheck()){
            System.out.println("Turn on the oven please");
        }

        if(currentHeat < maxHeat){
            currentHeat += 50;
        }
        else{
            System.out.println("This is the max heat for the oven buddy");
        }

        return currentHeat;
    }
}
class Fridge{

    static boolean isDoorOpen;
    static int currentCoolness = 2;
    static int maxCoolness = 10;

    static boolean statusCheck(){
        if(isDoorOpen==false){
            System.out.println("The fridge door is closed");
            isDoorOpen = true;
        }
        else{
            System.out.println("The fridge door is Open");
            isDoorOpen = false;
        }
            
        return isDoorOpen;
    }

    static int increase_coolness(){
        if(!statusCheck()){
            System.out.println("Turn on the fridge please");
        }

        if(currentCoolness < maxCoolness){
            currentCoolness += 1;
        }
        else{
            System.out.println("This is the max coolness for the fridge buddy");
        }

        return currentCoolness;
    }
}
class Fridge{

    static boolean isDoorOpen;

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
}
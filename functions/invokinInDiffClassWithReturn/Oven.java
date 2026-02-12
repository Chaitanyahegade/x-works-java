class Oven{

    static boolean isDoorOpen;

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
}
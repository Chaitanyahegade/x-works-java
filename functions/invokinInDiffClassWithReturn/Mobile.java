class Mobile{

    static boolean isLocked;

    static boolean statusCheck(){
        if(isLocked==false){
            System.out.println("The mobile is Unlocked");
            isLocked = true;
        }
        else{
            System.out.println("The mobile is Locked");
            isLocked = false;
        }
            
        return isLocked;
    }
}
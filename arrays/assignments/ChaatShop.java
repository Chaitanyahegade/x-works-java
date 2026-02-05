class ChaatShop{
    public static void main(String[] args){

        String availableChaat[]= {"Pani puri","Sev puri"};

        String paniPuri = availableChaat[0];
        String sevPuri = availableChaat[1];

        System.out.println(paniPuri+ " " + sevPuri);
        System.out.println("The number of chats available are: "+ availableChaat.length);
        System.out.println("the list of chats available are: ");
        System.out.println(paniPuri + " " + sevPuri);


        System.out.println("------------------------------");

        for(String val:availableChaat){
            System.out.println(val);
        }
    }
}
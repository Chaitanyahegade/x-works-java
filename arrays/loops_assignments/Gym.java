public class Gym {
    public static void main(String[] args) {

        String name = "GG Gym";
        String owner = "Novis";
        String address = "BTM";

        String branches[] = {"BTM","HSR","Jayanagar","Whitefield","Indiranagar","Rajajinagar","Hebbal","Yelahanka","KR Puram","Electronic City"};
        String trainers[] = {"Vijay","Sanjay","Deepak","Arun","Manoj","Naveen"};

        System.out.println("Gym Details :");
        System.out.println("Name :" + name);
        System.out.println("Owner :" + owner);
        System.out.println("Address :" + address);

        for(String BranchNames : branches){
            System.out.println(BranchNames);
            System.out.println("Trainers Names :");

            for(String TrainerNames : trainers){
                System.out.println(TrainerNames);
            }
        }
    }
}

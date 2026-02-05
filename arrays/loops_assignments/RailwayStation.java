public class RailwayStation {
    public static void main(String[] args) {

        String name = "Majestic Station";
        String owner = "Indian Railways";
        String address = "Bangalore";

        String platforms[] = {"P1","P2","P3","P4","P5","P6","P7","P8"};
        String staff[] = {"Mahesh","Anil","Vikas","Prakash","Arjun","Nitin","Rohit"};

        System.out.println("Railway Station Details :");
        System.out.println("Name :" + name);
        System.out.println("Owner :" + owner);
        System.out.println("Address :" + address);

        for(String PlatformNames : platforms){
            System.out.println(PlatformNames);
            System.out.println("Staff Names :");

            for(String StaffNames : staff){
                System.out.println(StaffNames);
            }
        }
    }
}

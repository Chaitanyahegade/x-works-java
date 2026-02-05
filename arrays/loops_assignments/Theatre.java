public class Theatre {
    public static void main(String[] args) {

        String name = "Cinipolis";
        String owner = "Cini Group";
        String address = "Orion Mall";

        String screens[] = {"Screen1","Screen2","Screen3","Screen4","Screen5","Screen6","Screen7"};
        String staff[] = {"Suresh","Rohit","Vikas","Mahesh","Arjun","Nitin","Prakash"};

        System.out.println("Theatre Details :");
        System.out.println("Name :" + name);
        System.out.println("Owner :" + owner);
        System.out.println("Address :" + address);

        for(String ScreenNames : screens){
            System.out.println(ScreenNames);
            System.out.println("Staff Names :");

            for(String StaffNames : staff){
                System.out.println(StaffNames);
            }
        }
    }
} 

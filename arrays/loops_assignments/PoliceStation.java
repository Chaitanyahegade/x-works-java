class PoliceStation {
    public static void main(String[] args) {

        String name = "Cubbon Park";
        String owner = "Karnataka Police";
        String address = "Bangalore";

        String divisions[] = {"Women Cell","Crime","Admin","Patrol","Intelligence","Control Room","Special Task"};
        String officers[] = {"Constable Ramesh","Constable Suresh","SI Anil","ASI Kiran","Inspector Mehta","SI Arjun","Constable Vikas"};

        System.out.println("Police Station Details :");
        System.out.println("Name :" + name);
        System.out.println("Owner :" + owner);
        System.out.println("Address :" + address);

        for(String DivisionNames : divisions)
            System.out.println(DivisionNames);
            System.out.println("Officer Names :");

        for(String OfficerNames : officers){
            System.out.println(OfficerNames);
        }
    }
}
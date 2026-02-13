class Insta360Executor {

    public static void main(String[] args) {

        double price = Insta360.getPrice();
        System.out.println("The price of Insta360 is :Rs " + price);
		
		
	     String Manufacturer = Insta360.getManufacturer();
        System.out.println("The Manufacturer of Insta360 is:" + Manufacturer);
		
		
		String countryOfOrigin = Insta360.getCountryOfOrigin();
        System.out.println("The Country of Origin of Insta360 is:" + countryOfOrigin);
		
		
		
		String itemModelNumber = Insta360.getItemModelNumber();
        System.out.println("The Item Model Number of Insta360 is:" + itemModelNumber);

		String aSIN = Insta360.getASIN();
        System.out.println("The ASIN of Insta360 is:" + aSIN);


    }
}
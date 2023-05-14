class RiverTester{
	
	public static void main(String[]flow){
		System.out.println("main method started");
		River water=new River("Ganga",2525," Uttar Pradesh",52);
		System.out.println(water.riverName+" "+water.length+" "+water.state+" "+water.depth);
		
		River water1=new River("Godhaveri",1465,"maharastra",40);
		System.out.println(water1.riverName+" "+water1.length+" "+water1.state+" "+water1.depth);
		
		River water2=new River("Krishna",1400,"Maharastra",75);
		System.out.println(water2.riverName+" "+water2.length+" "+water2.state+" "+water2.depth);
		
		River water3=new River("Kaveri",800,"Karnataka",89);
		System.out.println(water3.riverName+" "+water3.length+" "+water3.state+" "+water3.depth);
		
		River water4=new River("Tunga",200,"Karnataka",30);
		System.out.println(water4.riverName+" "+water4.length+" "+water4.state+""+water4.depth);
		
		River water5=new River("Badhara",200,"Badhara",30);
		System.out.println(water5.riverName+" "+water5.length+" "+water5.state+" "+water5.depth);
		
		River water6=new River("Yamun",1400,"UtharKand",70);
		System.out.println(water6.riverName+" "+water6.length+" "+water6.state+" "+water6.depth);
		
		River water7=new River("Narmadha",900,"Madya Pradesh",60);
		System.out.println(water7.riverName+" "+water7.length+" "+water7.state+" "+water7.depth);
		
		River water8=new River("Sabarmathi",371,"Rajasthan",50);
		System.out.println(water8.riverName+" "+water8.length+" "+water8.state+" "+water8.depth);
		
		River water9=new River("Narmadha",1312,"Madya Pradesh,",86);
		System.out.println(water9.riverName+" "+water9.length+" "+water9.state+" "+water9.depth);
		
		River water10=new River("Besa",1200,"Himachal Pradesh",49);
		System.out.println(water10.riverName+" "+water10.length+" "+water10.state+" "+water10.depth);
		
		River water11=new River("Ravi",690,"Himachal Pradesh",45);
		System.out.println(water11.riverName+" "+water11.length+" "+water11.state+" "+water11.depth);
		
		River water12=new River("Chenab",969,"Jammu Kashmir",85);
		System.out.println(water12.riverName+" "+water12.length+" "+water12.state+" "+water12.depth);
		
		River water13=new River("Teesta",414,"Sikim",41);
		System.out.println(water13.riverName+" "+water13.length+" "+water13.state+" "+water13.depth);
		
		River water14=new River("Tapti",724,"Madya Pradesh",58);
		System.out.println(water14.riverName+" "+water14.length+" "+water14.state+" "+water14.depth);
		
		River water15=new River("Pennar",597,"Karnataka",76);
		System.out.println(water15.riverName+" "+water15.length+" "+water15.state+" "+water15.depth);
		
		River water16=new River("Rangeet",256,"sikkim",85);
		System.out.println(water16.riverName+" "+water16.length+" "+water16.state+" "+water16.depth);
		
		River water17=new River("Mahanadhi",900,"Odisha",96);
		System.out.println(water17.riverName+" "+water17.length+" "+water17.state+" "+water17.depth);
		
		River water18=new River("Hoogly",260,"West Bengal",65);
		System.out.println(water18.riverName+" "+water18.length+" "+water18.state+" "+water18.depth);
		
		River water19=new River("Musi",204,"Telangana",85);
		System.out.println(water19.riverName+" "+water19.length+" "+water19.state+" "+water19.depth);
		
		River water20=new River("Bansa",512,"Gujarath",65);
		System.out.println(water20.riverName+" "+water20.length+" "+water20.state+" "+water20.depth);
		System.out.println("main method ended");
	}
}
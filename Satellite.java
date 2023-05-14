class Satellite{
 int SatelliteId;
 String name;
 String dateOfLaunch;
 String application;
 String launchingPlace;
 
	public Satellite(int SatelliteId,String name,String dateOfLaunch,String application,
	String launchingPlace){
	System.out.println("Indian Satellite details");
	this.SatelliteId=SatelliteId;
	this.name=name;
	this.dateOfLaunch=dateOfLaunch;
	this.application=application;
	this.launchingPlace=launchingPlace;
}
}
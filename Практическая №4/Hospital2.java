package Hospital2;


public class Hospital2{
	private String HospitalName;
	private String Manager;
	private String City;
	private String Address;
	
	
    public Hospital2(String hospitalName, String manager,String city, String address){
    	this.HospitalName = hospitalName;
    	this.Manager = manager;
    	this.City = city;
        this.Address = address;
        
    }
   
    public String getHospitalName(){
        return HospitalName;
    }
 
    public void setHospitalName(String hospitalName){
        this.HospitalName = hospitalName;
    }
    public String getManager() {
    	return Manager;
    }
    public void setManager(String manager) {
    	this.Manager = manager;
    }
    public String getCity() {
    	return City;
    }
    public void setCity(String city) {
    	this.City = city;
    }
    public String getAddress() {
    	return Address;
    }
    public void setAddress(String address) {
    	this.Address = address;
    }
        
    public String toString(){
        return "Название больницы :" + HospitalName + "\n" + "Заведующий: " + Manager + "\n " +"Город: " + City + "\n " + "Адрес: " + Address;
    
    }
    public static void main(String[] args) {
        Hospital2 hospis = new Hospital2("Аркхам", "Куликов Алексей Владимирович","Воронеж", "Ул.Карла Маркса, 35");
        System.out.print(hospis); 
    }
}
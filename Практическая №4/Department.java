package Hospital2;
 
public class Department extends Hospital2 {
	private String NameofDepartment;
	private String Hull;
	private String Floor;
	private String NameofManager;
	
	
    public Department(String hospitalName, String manager,String city, String address,String NameofDepartment, String Hull,String Floor, String NameofManager){
    	super( hospitalName,  manager, city,  address);
    	this.NameofDepartment = NameofDepartment;
    	this.Hull = Hull;
    	this.Floor = Floor;
        this.NameofManager = NameofManager;
        
    }
   
    public String getNameofDepartment(){
        return NameofDepartment;
    }
 
    public void setNameofDepartment(String NameofDepartment){
        this.NameofDepartment = NameofDepartment;
    }
    public String getHull() {
    	return Hull;
    }
    public void setHull(String Hull) {
    	this.Hull = Hull;
    }
    public String getFloor() {
    	return Floor;
    }
    public void setFloor(String Floor) {
    	this.Floor = Floor;
    }
    public String getNameofManager() {
    	return NameofManager;
    }
    public void setNameofManager(String NameofManager) {
    	this.NameofManager = NameofManager;
    }
        
    public String toString(){
        return "\n " + super.toString() + "Название отделения :" + NameofDepartment + "\n" + "Корпус: " + Hull + "\n " +"Этаж: " + Floor + "\n " + "ФИО Заведующего: " + NameofManager;
    
    }
   
}
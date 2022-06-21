package Hospital2;
public class Doctors extends Hospital2 {
	private String NameofDepart;
	private String DoctorsName;
	private String Position;
	private String AcademicTitle;
	private String LengthofService;
	
	
    
public Doctors(String hospitalName, String manager,String city, String address,String NameofDepart, String DoctorsName,String AcademicTitle, String LengthofService,String Position){
    	super( hospitalName,  manager, city,  address);
	this.NameofDepart = NameofDepart;
    	this.DoctorsName = DoctorsName;
    	this.AcademicTitle = AcademicTitle;
        this.LengthofService = LengthofService;
        this.Position = Position; 
    }
   
    public String getNameofDepart(){
        return NameofDepart;
    }
 
    public void setNameofDepart(String NameofDepartment){
        this.NameofDepart = NameofDepartment;
    }
    public String getDoctorsName() {
    	return DoctorsName;
    }
    public void setDoctorsName(String DoctorsName) {
    	this.DoctorsName = DoctorsName;
    }
    public String getPosition() {
    	return Position;
    }
    public void setPosition(String Position) {
    	this.Position = Position;
    }
    public String getAcademicTitle() {
    	return AcademicTitle;
    }
    public void setAcademicTitle(String AcademicTitle) {
    	this.AcademicTitle = AcademicTitle;
    }
    public String getLengthofService() {
    	return LengthofService;
    }
    public void setLengthofService(String LengthofService) {
    	this.LengthofService = LengthofService;
    }
    
       
    public String toString(){
       return "\n " + super.toString() + "Название отделения: " + NameofDepart + "\n" + "ФИО врача: " + DoctorsName + "\n " + "Должность: " + Position + "\n " + "Научное звание: " + AcademicTitle + "\n" + "Стаж работы: " + LengthofService;
    
    }
   
}

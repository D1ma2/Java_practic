package Hospital2;

import java.util.ArrayList; 

public class test {
	private ArrayList<Hospital2> Prit;

	
	public test(ArrayList<Hospital2> Prit ) {
		this.Prit = Prit;
	}
	
	
	public void addPrit (Hospital2 Hospital2) {
		Prit.add(Hospital2);
	}
	
	
	public ArrayList<Hospital2> printPrit () {
		return Prit ;
	}
	
	public static void main(String[] args) {
		ArrayList<Hospital2> listOfPrit = new ArrayList<>();
		test Test = new test(listOfPrit);
		
		String HospitalName = "Аркхам"; 
		String Manager= "Куликов Алексей Владимирович"; 
	    String City = "Воронеж"; 
	    String Address = "Ул.Карла Маркса, 35"; 
	    
	    String NameofDepartment = "Психиатрическое"; 
		String Hull = "5"; 
		String Floor = "3";
		String NameofManager = "Ульянов Анатолий Васильевич";
		Department department  = new Department (  HospitalName, Manager, City,  Address, NameofDepartment,  Hull, Floor,  NameofManager);
		Test.addPrit(department);
		
		String NameDepartment = "Психиатрическое";
		 String FIOpatient = "Петров Иван николаевич";
		 String PolicyNumber =  "3214314312";
		 String ReceiptDate =  "19.06.2005";
		 String DischargeDate =  "6.08.2010";
		 String Diagnosis =  "Шизофрения";
		 String DateofOperation =  "10.12.2008";
		 String OperationName =  "Лоботомия";
		 String CostofTreatment = "150000";
		Patients patient  = new Patients (HospitalName, Manager,City,  Address, NameDepartment, FIOpatient,  PolicyNumber, ReceiptDate,  DischargeDate,  Diagnosis,  DateofOperation, OperationName, CostofTreatment);
		Test.addPrit (patient);
		
		 String NameofDepart = "Психиатрия";
		 String DoctorsName = "Притор Анатолий Степанович";
		 String Position = "Глав. Врач";
		 String AcademicTitle = "Доктор наук";
		 String LengthofService = "20 лет";
		Doctors doctors = new Doctors( HospitalName,  Manager, City,  Address,NameofDepart,  DoctorsName, AcademicTitle, LengthofService, Position);
		Test.addPrit (doctors);
		
		System.out.print(Test.printPrit());
	}
}
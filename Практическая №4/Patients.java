package Hospital2;

 public class Patients extends Hospital2 {
	private String NameDepartment;
	private String FIOpatient;
	private String PolicyNumber;
	private String ReceiptDate;
	private String DischargeDate;
	private String Diagnosis;
	private String DateofOperation;
	private String OperationName;
	private String CostofTreatment;
	
    public Patients(String hospitalName, String manager,String city, String address,String nameDepartment, String fiopatient, String policyNumber,String receiptDate, String dischargeDate, String diagnosis, String dateofOperation,String operationName,String costofTreatment){
    	super(hospitalName,  manager, city,  address);
    	this.NameDepartment = nameDepartment;
    	this.FIOpatient = fiopatient;
        this.PolicyNumber = policyNumber;
        this.ReceiptDate= receiptDate;
        this.DischargeDate = dischargeDate;
        this.Diagnosis = diagnosis;
        this.DateofOperation = dateofOperation; 
        this.OperationName = operationName;
        this.CostofTreatment = costofTreatment;
    }
   
    public String NameDepartment(){
        return NameDepartment;
    }
 
    public void setNameDepartment(String nameDepartment){
    	this.NameDepartment = nameDepartment;
    }
    
    public String getFIOpatient(){
        return FIOpatient;
    }
 
    public void setFIOpatient(String fiopatient){
        this.FIOpatient = fiopatient;
    }
    
    public String getPolicyNumber(){
        return PolicyNumber;
    }
 
    public void setPolicyNumber(String policyNumber){
        this.PolicyNumber = policyNumber;
    }
    
    public String getReceiptDate(){
        return ReceiptDate;
    }
 
    public void setReceiptDate(String receiptDate){
        this.ReceiptDate = receiptDate;
    }
    public String getDischargeDate() {
    	return DischargeDate;
    }
    public void setDischargeDate(String dischargeDate) {
         this.DischargeDate = dischargeDate;
    }
    public String getDiagnosis(){
        return Diagnosis;
    }
 
    public void setDiagnosis(String diagnosis){
        this.Diagnosis = diagnosis;
    }
    
    public String getDateofOperation() {
        return DateofOperation;
    }
 
    public void setDateofOperation(String dateofOperation){
        this.DateofOperation = dateofOperation;
    }
    public String getOperationNam() {
    	return OperationName;
    }
    public void setOperationName(String operationName) {
    	this.OperationName = operationName;
    }
    public String getCostofTreatment() {
    	return CostofTreatment;
    }
    public void setCostofTreatment(String costofTreatment) {
    this.CostofTreatment = costofTreatment;
    }
   
    public String toString(){
        return "\n " + super.toString() + "Название отдления: " + NameDepartment + "\n " + "ФИО пациента: " + FIOpatient + "\n " +"Номер полиса: " + PolicyNumber + "\n " + "Дата поступления: " + ReceiptDate + "\n "  + "Дата выписки: " + DischargeDate + "\n "  + "Диагноз: " + Diagnosis + "\n" + "Дата операции:" + DateofOperation + "\n" + "Название операции:" + OperationName + "\n" + "Стоимость операции:" + CostofTreatment;
    
    }
   
}
public class Hospital{
	private String HospitalName;
	private String NameDepartment;
	private String FIO;
	private int PolicyNumber;
	private String ReceiptDate;
	private String DischargeDate;
	private String Diagnosis;
	private String DateofOperation;
	private String OperationName;
	private int CostofTreatment;
	
    public Hospital(String hospitalName, String nameDepartment, String fio, int policyNumber,String receiptDate, String dischargeDate, String diagnosis, String dateofOperation,String operationName,int costofTreatment){
    	this.HospitalName = hospitalName;
    	this.NameDepartment = nameDepartment;
    	this.FIO = fio;
        this.PolicyNumber = policyNumber;
        this.ReceiptDate= receiptDate;
        this.DischargeDate = dischargeDate;
        this.Diagnosis = diagnosis;
        this.DateofOperation = dateofOperation; 
        this.OperationName = operationName;
        this.CostofTreatment = costofTreatment;
    }
   
    public String getHospitalName(){
        return HospitalName;
    }
 
    public void setHospitalName(String hospitalName){
        this.HospitalName = hospitalName;
    }
    
    public String NameDepartment(){
        return NameDepartment;
    }
 
    public void setNameDepartment(String nameDepartment){
    	this.NameDepartment = nameDepartment;
    }
    
    public String getFIO(){
        return FIO;
    }
 
    public void setFIO(String fio){
        this.FIO = fio;
    }
    
    public int getPolicyNumber(){
        return PolicyNumber;
    }
 
    public void setPolicyNumber(int policyNumber){
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
    public int getCostofTreatment() {
    	return CostofTreatment;
    }
    public void setCostofTreatment(int costofTreatment) {
    this.CostofTreatment = costofTreatment;
    }
    /* ???????????????????????????????? ?????????????????????? ?????????? ?????? ?????????????????????????? ?????????????? ?? ???????? ???????????? ?? ?????????? ?????????????????? ?????????????????????? */
    public String toString(){
        return "???????????????? ???????????????? :" + HospitalName + "\n " +"???????????????? ????????????????: " + NameDepartment + "\n " + "??????: " + FIO + "\n " +"?????????? ????????????: " + PolicyNumber + "\n " + "???????? ??????????????????????: " + ReceiptDate + "\n "  + "???????? ??????????????: " + DischargeDate + "\n "  + "??????????????: " + Diagnosis + "\n" + "???????? ????????????????:" + DateofOperation + "\n" + "???????????????? ????????????????:" + OperationName + "\n" + "?????????????????? ????????????????:" + CostofTreatment;
    
    }
    public static void main(String[] args) {
        Hospital hospis = new Hospital("????????????", "??????????????????????????????", "?????????????? ?????????????? ????????????????????????", 342423423, "13.05.2005" , "16.07.2009", "????????????????????","15.06.2007","???????????????? ?????????? ??????????",150000); /* ???????????? ???????????? */
        System.out.print(hospis); /* ?????????????????? ???????????????????????? */
    }
}
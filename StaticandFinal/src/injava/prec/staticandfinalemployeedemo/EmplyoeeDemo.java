package injava.prec.staticandfinalemployeedemo;

public class EmplyoeeDemo {
String employeeName;
float employeeSalary;
final int RETIRMENT_AGE;
static String  oraganizationName;
public EmplyoeeDemo(String employeeName, float employeeSalary, int rETIRMENT_AGE) {
	super();
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	RETIRMENT_AGE = rETIRMENT_AGE;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public float getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(float employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public static String getOraganizationName() {
	return oraganizationName;
}
public static void setOraganizationName(String oraganizationName) {
	EmplyoeeDemo.oraganizationName = oraganizationName;
}
public int getRETIRMENT_AGE() {
	return RETIRMENT_AGE;
}
@Override
public String toString() {
	return "EmplyoeeDemo [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", RETIRMENT_AGE="
			+ RETIRMENT_AGE + ",OraganizationName:"+ oraganizationName +" ]";
}




}
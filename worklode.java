package Workhrs;
class Employeepay{
	 void CalculatePay(String name,double salary) {
		 System.out.println(name+" "+salary);
		
	}
	 void CalculatePay(String name,double hourlyrate,double hoursworked) {
		 System.out.print(name+" "+hourlyrate*hoursworked);
	 }
	
}
public class worklode{
	public static void main(String []args) {
		Employeepay salary= new Employeepay();
		salary.CalculatePay("sadvik",9200.0);
		salary.CalculatePay("vishu",8700.0,10.0);

	}
}
package Z0_808;

public class Q9 {

}
//Question 9
//
//Given the following two classes:
//public class Customer {
//ElectricAccount acct = new ElectricAccount();
//public void useElectricity(double kWh) {
//acct.addKWh(kWh);
//}
//}
//public class ElectricAccount {
//private double kWh;
//private double rate = 0.07;
//private double bill;
//// line n1
//}
//How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is
//always equal to the value of the member variable kwh multiplied by the member variable
//rate?
//Any amount of electricity used by a customer (represented by an instance of the customer class) must
//contribute to the customer's bill (represented by the member variable bill) through the
//method use Electricity method.
//An instance of the customer class should never be able to tamper with or decrease the value of the
//member variable bill.
//
//Please select 1 option.
//
//public void addKWh(double kWh){
//this.kWh += kWh;
//this.bill = this.kWh * this.rate;
//}
//
//public void addKWh(double kWh){
//if(kWh > 0){
//this.kWh += kWh;
//this.bill = this.kWh * this.rate;
//}
//}
//
//private void addKWh(double kWh){
//if(kWh > 0){
//this.kWh += kWh;
//this.bill = this.kWh * this.rate;
//}
//}
//
//public void addKWh(double kWh){
//if(kWh > 0){
//this.kWh += kWh;
//setBill(this.kWh);
//}
//}
//public void setBill(double kWh){
//bill = kWh * rate;
//}
//Option A, there is no judgment as to whether the value of the incoming kWh parameter 
//is greater than 0,
//so there may be cases where a negative number is passed.
//Option B, the correct answer.
//Option C, using private modifier for the addKWh method, makes it inaccessible
//outside of ElectricAccount .
//Option D, setBill method should be changed to private to modify,
//to avoid the tampering of the bill.

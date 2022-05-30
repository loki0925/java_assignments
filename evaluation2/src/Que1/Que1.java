package Que1;

public class Que1 {
	//is-A relation is achieved through inheritance while Has-a is not achived through inheritance
	//bike has engine is a example of Has-a while spendor is a bike is a example of is-a 
	//
	class bike{
		String iambilke;
	}
	class spendor extends bike{
		String iam_child_of_bike;
		//here we can inherit the property of parent 
	}
	class engine{
		String i_am_part_of_spendor;
		//here we can create object of spendor and create a Has-a relation ship 
	}
	
	//2) accessmodifiers 
	
	//Public: we can access public modifires everywhere trouth quliafied name from any package
	//
	
	//default: in a perticuler package we can access default modifier 
	
   //protected : to access this kind of modifier inheritance is must and you can access only in a periculer package
	
	
	//private: in can be access only in perticuler class outside class you cant acess it
}

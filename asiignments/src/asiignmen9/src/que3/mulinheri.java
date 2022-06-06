package que3;

public class mulinheri {
	//The reason behind this is to prevent ambiguity.

		//First reason Consider a case where class B extends class A and Class C and both class A and C have the same method display().
		//Now java compiler cannot decide, which display method it should inherit. 

		//Second reason to me is that multiple inheritances does complicate the design and 
		//creates problem during casting, constructor chaining;
		
		
		//To prevent such situation, multiple inheritances is not allowed in java or not supported in Java at class level.

}

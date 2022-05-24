package asiignments3;

public class VowelsConsonant {
void checkChar(char character) {
		
		if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'||
			character=='A'||character=='E'||character=='I'||character=='O'||character=='U'){
			
			System.out.println(character + " is Vowel"); 
		}
		else if((character>='a'&&character<='z')||(character>='A'&&character<='Z')) {
			System.out.println(character + " is Consonant");
//			System.out.println(character>='a');
		}
		else{
			System.out.println(character + " is not an valid character to check Vowel or Consonant");
		}

	}
	
	public static void main(String[] args) {
		
		VowelsConsonant ch = new VowelsConsonant();
		
		char vowel = 'a';		
		ch.checkChar(vowel);
		
		char consonant = 'c';		
		ch.checkChar(consonant);
		
		char invalid = '#';		
		ch.checkChar(invalid);
		
	}

}

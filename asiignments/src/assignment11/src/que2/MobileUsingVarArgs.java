package que2;

public class MobileUsingVarArgs {

static String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public static void searchOutdatedModel(String name, String ...modelNo){
		
		if(modelNo!=null) {
			
			for (String  x: modelNo) {
				for(String outdatedModel: outdatedModels) {
					if(x.equalsIgnoreCase(outdatedModel)) {
						System.out.println("****************************");
						System.out.println(name + " " + x + "_OUTDATED");
						System.out.println("****************************\n");
						break;
					}else {
						System.out.println("****************************");
						System.out.println(name + " " + x + "_NOT_OUTDATED");
						System.out.println("****************************\n");
						break;
					}
				}
			}
		}
		else{
			System.out.println("Please Enter Valid Model Number");
		}
	}
	
	public static void main(String[] args) {
		
		searchOutdatedModel("Samsung", "Note4","Note6","Note11");
		
	}
}

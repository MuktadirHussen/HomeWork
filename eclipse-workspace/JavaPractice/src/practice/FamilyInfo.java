package practice;

public class FamilyInfo {

	public static void main(String[] args) {

		Family toddler = new Family();
		
		toddler.name = "Ahyan";
		toddler.age =4;
		toddler.height =3.123f;
		toddler.sex ='M';
		toddler.gender=true;
		toddler.family();
		
		System.out.println("\n*********************\n");
		
		Family toddler2 =new Family();
		
		toddler2.name = "Khadija";
		toddler2.age =5;
		toddler2.height =3.234f;
		toddler2.sex ='F';
		toddler2.gender=true;
		toddler2.family();
		
		
		System.out.println("\n***************\n");
		
		Family toddler3 =new Family();
		
		toddler3.name = "Nyla";
		toddler3.age =2;
		toddler3.height =2.234f;
		toddler3.sex ='M';
		toddler3.gender=false;
		toddler3.family();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

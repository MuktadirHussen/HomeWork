package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("*****Regular Class ColumbiaUniverity*****");
		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.biology();
		ColumbiaUniversity.columbiaUniversity();
		columbia.anatomyLab();
		columbia.hygiene();
		columbia.lawInfo();
		columbia.commonRoom();
		columbia.laboratory();
		columbia.languageClub();
		columbia.emergencyRoom();
		columbia.surgeryRoom();
		columbia.cafeteria();
		columbia.classSize();
		columbia.playGround();
		columbia.vocationalInfo();

		System.out.println("\n*****Interface Class University*****");
		University university = new ColumbiaUniversity();
		University.university();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();

		System.out.println("\n*****Abstract Class MediacalSchool*****");
		MedicalSchool medical = new ColumbiaUniversity();
		MedicalSchool.medicalSchool();
		medical.anatomyLab();
		medical.biochemistryLab();
	}
}
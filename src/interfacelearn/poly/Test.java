package interfacelearn.poly;

public class Test {
	public static void main(String[] args) {
		ProfileService profileService = new ProfileService();
		profileService.saveProfile(new ProfileMemoryRepository());
		// profileService.saveProfile(new ProfileDBRepository());
	}
}
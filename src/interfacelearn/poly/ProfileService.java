package interfacelearn.poly;

public class ProfileService {
	public void saveProfile(ProfileRepository profileRepository) {
		profileRepository.save();
	}
}
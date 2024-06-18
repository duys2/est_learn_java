package generic.inherit;

public class Main {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("Samsung");

		StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
		tvStorage.add(new Tv(), 0);
	}
}
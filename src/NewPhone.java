public abstract class NewPhone {
	private String owner;

	public NewPhone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰전원을 킵니다.");
	}

	public void turnOff() {
		System.out.println("폰전원을 끕니다.");
	}
}
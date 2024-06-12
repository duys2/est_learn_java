public class Visitor {
	int weight;
	int money;
	boolean fat;

	public Visitor(int weight, int money) {
		this.weight = weight;
		this.money = money;
	}

	public void buyFood(Food food) {
		this.money -= food.cost;
	}

	public void eatFood(Food food) {
		this.weight += food.weight;
		if (this.weight >= 150) {
			this.fat = true;
		}
	}

	public static void main(String[] args) {
		Visitor visitor = new Visitor(100, 5000);
		Food food = new Food(50, 30, "사탕");

		visitor.buyFood(food); // 4950

		System.out.println(visitor.money);
		visitor.eatFood(food); // 130
		visitor.eatFood(food); // 160
		System.out.println(visitor.weight); // 160
		System.out.println(visitor.fat); // true
	}
}
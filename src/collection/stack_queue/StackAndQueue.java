package collection.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
	public static void main(String[] args) {
		/* Stack: 후입 선출 (LIFO) */
		// 제네릭으로 Coin 타입만 들어올 수 있는 스택 정의
		Stack<Coin> coinStack = new Stack<>();

		coinStack.push(new Coin(5));
		coinStack.push(new Coin(100));
		coinStack.push(new Coin(25));
		coinStack.push(new Coin(250));

		// 스택이 비어있지 않는 동안 반복
		while (!coinStack.isEmpty()) {
			Coin coinPop = coinStack.pop();
			// 스택은 후입 선출 (LIFO)
			System.out.println(coinPop.getValue());
		}

		/* Queue: 선입 선출 (FIFO) */
		// 제네릭으로 Message 타입만 들어올 수 있는 (큐)LinkedList 정의
		Queue<Message> messageQueue = new LinkedList<>(); // LinkedList: Queue 인터페이스를 구현한 대표적인 클래스

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSms", "제니"));
		messageQueue.offer(new Message("sendKakaoTalk", "리사"));
		messageQueue.offer(new Message("sendDm", "전우치"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();

			switch (message.getCommand()) {
				case "sendMail":
					System.out.println(message.getTo() + "에게 메일을 보냅니다.");
					break;
				case "sendSms":
					System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
					break;
				case "sendKakaoTalk":
					System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
					break;
				default:
					System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
			}
		}
	}
}
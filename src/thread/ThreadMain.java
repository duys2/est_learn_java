package thread;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread("스레드1");
		MyThread myThread2 = new MyThread("스레드2");
		MyThread myThread3 = new MyThread("스레드3");
		MyThread myThread4 = new MyThread("스레드4");

		/* 스레드를 시작하는 메서드: start() */
		myThread.start(); // 순서를 보장하지 않는다.
		myThread2.start();
		myThread3.start();
		myThread4.start();

		Thread thread1 = new Thread(new MyRunnable(1));
		Thread thread2 = new Thread(new MyRunnable(2));
		Thread thread3 = new Thread(new MyRunnable(3));
		Thread thread4 = new Thread(new MyRunnable(4));
		Thread thread5 = new Thread(new MyRunnable(5));

		thread1.start();
		thread2.start();
		thread3.start();
		Thread.sleep(10000); // 10초 정지, 체크드 예외라서 throws InterruptedException 추가
		thread4.start();
		thread5.start();
	}
}
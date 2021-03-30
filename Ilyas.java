class threadKu implements Runnable{
	private int countDown = 5;
	private static int threadCount = 0;
	private int threadNumber = ++threadCount;

	public threadKu() {
		System.out.println("Pembuatan Thread ke " + threadNumber);
	}
	public void run() {
		while(true) {
			System.out.println("Thread ke " + threadNumber + "(" + countDown + ")");
			if (--countDown == 0) return;
		}
	}
}
public class thread01 {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			threadKu o = new threadKu();
			Thread oTh = new Thread(o);
			oTh.start();			
		}
		System.out.println("Semua Thread telah dibuat!");		
	}
}
package controller;

public class ShowThread extends Thread {
	
	private int nThread;
		
	public ShowThread(int nThread) {
		this.nThread = nThread;
	}
	
	@Override
	public void run() {
		System.out.println(nThread);		
	}
}

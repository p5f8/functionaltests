package br.com.functional.test.functionaltest;

public class StateTransformationInsteadOfStateMutation {
	
	// video: https://www.youtube.com/watch?v=15X0qFtBqiQ
	// parei 19:02 min
	
	// method is a function which belongs to a class or to an object
	
	// Function has 4 things:
	// 1. name
	// 2. return type
	// 3. parameter list
	// 4. body
	
	// lambda expressions
	// (parameter list) -> body
	
	public static void main(String[] args) {
		Thread  th = new Thread(new Runnable() {
			public void run() {
				System.out.println("In another thread");
			}
			
		});
		
		// lambda
		Thread th1 = new Thread(() -> System.out.println("In another thread"));
		
		th.start();
		System.out.println("In main");
	}
	
}

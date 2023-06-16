package Week4;

import java.util.Stack;

//import StackDemo.Car;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> myStack2=new Stack<>();//you can put anything in stack
		myStack2.push("Red");
		myStack2.push("Green");
		myStack2.push("Blue");
		System.out.println(myStack2.size());
		System.out.println(myStack2.search("Green"));
		System.out.println(myStack2.pop());  //en son koydugunu yani blue yu aliyor listten.
		System.out.println(myStack2.peek()); //sadece en son koydugunu gosteriyor
	
		/*
		 * Stack<Car> myStack3=new Stack<>(); //bunu car a getter setter constructor
		 * lari yapinca koyabilirsin myStack3.push(new Car()); myStack3.push(new
		 * Car("Ford",2000)); myStack3.push(new Car("Gm",1997));
		 * System.out.println(myStack3);
		 */
		Stack<Integer> myStack=new Stack<>();
		
		myStack.push(3);
		myStack.push(5);
		myStack.push(7);//top of stack
		myStack.push(9);
		myStack.push(7);//duplicate allowed
		System.out.println(myStack.size());//4
		System.out.println(myStack.search(5));//
		System.out.println(myStack.pop());//7 top geliyor
		System.out.println(myStack.search(5));
		System.out.println(myStack.pop());//5
		if(myStack.search(5)>=0)
		System.out.println(myStack.search(5));
		else
			System.out.println("5 does not exitst");
		System.out.println(myStack.peek());//3
		//bakiyor ama birsey degistirmiyor
	if(!myStack.empty())	//is not em[ty do this ]
		System.out.println(myStack.pop());//exception error
	
	//System.out.println(myStack.search(5));//position of 5
	//-1 mean do not in stack

	}

}

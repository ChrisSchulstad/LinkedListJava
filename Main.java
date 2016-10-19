// Christopher Schulstad
// Basic Java Review (LinkedList)
// Main.Java 10/19/2016
// LinkedList of Generic Data Type. Goal = Simplicity

public class Main{
	
	public static void main(String args[]){
		
		LinkedList myList = new LinkedList();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.remove(3);
		
		System.out.println(myList.contains(1));
		System.out.println(myList.contains(3));
		System.out.println(myList.contains(5));
		
		
		System.out.println(myList);
		
	}
	
}

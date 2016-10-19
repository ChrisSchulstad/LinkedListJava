// Christopher Schulstad
// Basic Java Review (LinkedList)
// LinkedList.Java 10/19/2016
// LinkedList of Generic Data Type. Goal = Simplicity

public class LinkedList<T> {
	
	private Link firstLink;
	private int size;
	
	public LinkedList(){
		firstLink = null;
		size = 0;
	}
	
	//
	// Returns true if the LinkedList is empty
	//
	public boolean isEmpty(){
		return size == 0;
	}
	
	//
	// Returns the size of the LinkedList
	//
	public int size(){
		return size;
	}
	
	//
	// Adds a new Link(data) to the LinkedList
	//
	public void add(T data){
		Link newLink = new Link(data);
		
		if (isEmpty()){
			firstLink = newLink;
		}
		else{
			Link tempLink = firstLink;
			while (tempLink.nextLink != null){
				tempLink = tempLink.nextLink;
			}
			tempLink.nextLink = newLink;
		}
		
		size++;
	}
	
	//
	// Returns true and removes Link(data) from the LinkedList if possible
	//
	public boolean remove(T data){
		if (isEmpty()) return false;
		
		if (firstLink.getData() == data){
			firstLink = firstLink.nextLink;
			return true;
		}
		
		Link tempLink = firstLink;
		Link previousLink = firstLink;
		
		while (tempLink.getData() != data){
			if (tempLink.nextLink == null) return false;
			previousLink = tempLink;
			tempLink = tempLink.nextLink;
		}
		
		previousLink.nextLink = tempLink.nextLink;
		size--;
		return true;
	}
	
	//
	// Returns true if Link(data) is found in the LinkedList
	//
	public boolean contains(T data){
		if (isEmpty()) return false;
		Link tempLink = firstLink;
		
		while (tempLink.getData() != data){
			if (tempLink.nextLink == null) return false;
			tempLink = tempLink.nextLink;
		}
		
		return true;
	}
	
	//
	// Returns the (String)data from each link recursively
	//
	public String toString(){
		return firstLink.toString();
	}
	
}

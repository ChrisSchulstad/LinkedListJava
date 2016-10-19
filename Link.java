// Christopher Schulstad
// Basic Java Review (LinkedList)
// Link.Java 10/19/2016
// LinkedList of Generic Data Type. Goal = Simplicity

public class Link<T> {
	
	private T data;
	public Link nextLink;
	
	public Link(){
		data = null;
		nextLink = null;
	}
	
	public Link(T data){
		this.data = data;
		nextLink = null;
	}
	
	public T getData(){
		return data;
	}
	
	//
	// Recursively returns the value of data in each link
	//
	public String toString(){
		while (nextLink != null){
			return data + nextLink.toString();
		}
		return "" + data;
	}
	
}

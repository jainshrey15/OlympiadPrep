
package application;

public class Item{
	
	//instance variable called itemName
	private String itemName;
	
	
	//getter for the itemName field
	public String getItemName() {
		return itemName;
	}

	//setter for the itemName field
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	//default constructor for the class
	public Item(){
		
	}
	
	
	//overloaded constructor for the class with the itemName parameter
	/*
	 @param
	 @exception
	 @return
	 */
	public Item(String itemName){
		this.itemName=itemName;
		
	}
	
	
}
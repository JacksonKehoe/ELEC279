// Jackson Kehoe 20105920
package assignment1;
public class Entity {
	private String name; 
	private Date born; 																	//instance variables

																						//initializing no argument constructor
	public Entity() {
		name = ""; 																		//name is empty so null
		born = new Date("February", 9, 2020); 											//storing a date to born
	}
																						//initializing constructors
	public Entity(String entityName, String strBorn) { 									//initialization of instance variables with inputs to constructor
		name = entityName;
		born = new Date(strBorn);
	}
	public Entity(String entityName, String month, int day, int year) { 				//initialization of instance variables with inputs to constructor
		name = entityName;
		born = new Date(month, day, year);
	}
	public Entity(String entityName, int year) { 										//initialization of instance variables with inputs to constructor
		name = entityName;
		born = new Date(year);
	}
	public Entity(String entityName, Date birthDate) { 									//initialization of instance variables with inputs to constructor
		name = entityName;
		born = new Date(birthDate);
	}
																						//initializing mutators
	public void setName(String entityName) {
		this.name = entityName; 														//change name of entity using input
	}
	public void setEntity(String entityName, int month, int day, int year) {
		this.name = entityName; 														//change name of entity using input
		this.born = new Date(month, day, year); 										//change birthDate using input
	}
	public void setEntity(String entityName, String month, int day, int year) { 		//same as last but month is string
		this.name = entityName; 
		this.born = new Date(month, day, year); 
	}
																						//initializing accessors
	public String getName() {
		return name; 																	//accesses name (private)
	}
	public Date getBorn() {
		return new Date(born);															//accesses born (private)
	}
																						//takes in entities and returns as string
	public String toString(String entityName, Date birthDate) {
		return (this.name + ", born on" + this.born); 									//returns name and birthDate as string
	}
	public Boolean nameEquals(Entity entity) {											//checks if entity name matches another entity
		String entityName = entity.getName();											//accesses name of specific entity
			if(entityName.equals(this.name)) {
				return true;															//true output
			}
			else {
				return false;															//false output
			}
	}
	public Boolean bornEquals(Entity entity) {											//checks if entity birthDate matches another entity
		Date birthDate = entity.born;													//accessor used to get entity birthDate
		int month = birthDate.getMonth();												//accessors used to get information from born
		int day = birthDate.getDay();
		int year = birthDate.getYear();
			if(month == this.born.getMonth() && day == this.born.getDay() && year == this.born.getYear()) { //if match return true
			return true;																	//true output
			}
			else {
			return false;																	//false output
			}
	}
	public Boolean equals(Entity entity) {												//checks if both birthDate and name match another entity
		Boolean nameBool = entity.nameEquals(this);										//stores output of NameEquals
		Boolean bornBool = entity.bornEquals(this);										//stores output of bornEquals
			if(nameBool && bornBool) {													//if both are true
				return true;															//true output
			}	
			else {
				return false;															//false output
			}
	}
}


// Inheritance
// 1.) when you use inheritance you can only extend 1 class
// 2.) reduction and refactoring(code cleanup) of source code



/*one-to-one relationship
 * Person.ID = User.ID
 * 
 * 
  Create Table Person (
  	 ID int PRIMARY KEY,
     FirstName VARCHAR(20),
     LastName VARCHAR(30),
    )
    
   Create Table User (
   	 ID int PRIMARY KEY,
   	 UserName VARCHAR(20),
   	 Password VARCHAR(16),
   	)
 */


public class User extends Person{

	private String username;
	public String getUserName() {return username;}
	public void setUserName(String u) {username = u;}
	
	private String password;
	public String getPassword() {return password;}
	public void setPassword(String p) {password = p;}
}

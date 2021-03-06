import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  User Class - Username, email, password, mobile number
public class User extends Person {
	
	// Classes usually have these 4 items
	// 1.) Properties / Fields -  Getters / Setters
	// 2.) Birth / Death -- Constructor - Deconstructor
	// 3.) Statistics - Information considered to be public gettable and class should be able to complete with all the information
	// 4.) Abilities - Has some sort of functionality and can do something -  functions usually void -- doesnt return anything
	
	private String username;
	public String getUserName() {return username;}
	public void setUserName(String un) {username = un;}
	
	private String email;
	public String getEmail() {return email;}
	public void setEmail(String em) {email = em;}
	
	private String password;
	public String getPassword() {return password;}
	public void setPassword(String pw) {password = pw;}
	
	private String mobile;
	public String getMobile() {return mobile;}
	public void setMobile(String mn) {mobile = mn;}
	
	private List<Post> posts;
	public List<Post> getPosts() {return posts;}
	public void setPosts(List<Post> p) {posts = p;}
	
	
	public long getPostCount() {
		return posts.stream().filter(x -> x.getParent() == null).count();
	}
	
	public long getReplyCount() {
		return posts.stream().filter(x -> x.getParent() != null).count();
	}
	
	public void print() {
		String postWord = getPostCount() == 1 ? "post" : "posts";
		String replyWord = getReplyCount() == 1 ? "reply" : "replies";
		
		System.out.println(getFirstName() + " " + getLastName());
		System.out.println("Has " + getPostCount() + " " + postWord + ".");
		System.out.println("Has " + getReplyCount() + " " + replyWord + ".");
		
		System.out.println("Posts: ");
		printPosts(true);
		System.out.println("Replies: ");
		printPosts(false);
	}
	
	private void printPosts(boolean posts) {
		// if true print posts / if false print replies
		
		List<Post> messages = new ArrayList<Post>();
		
		if(posts){
			messages = this.posts.stream().filter(x -> x.getParent() == null).collect(Collectors.toList());
		}
		else {
			messages = this.posts.stream().filter(x -> x.getParent() != null).collect(Collectors.toList());
		}
		
		for(Post p : messages){
			System.out.println(p.getMessage());
		}
		
	}
	
}

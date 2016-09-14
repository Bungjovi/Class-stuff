import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Create a program that collects information on a person, their posts, and replies to thier post
// Print out the Person in order by last name first

// 1.) Person Class - First Name, Last Name, Username, email, password, mobile number
// 2.) user??
// 3.)Post class- Message, LocalDate, Owner(User), Collection<Reply>
// 4.)Reply Class - (Post), Post { Parent }, 

public class Program {

	public static void main(String[] args) {
		
		User user = new User();
		user.setFirstName("Donald");
		user.setLastName("Dicchico");
		user.setEmail("ddicchico@remulak.net");
		user.setUserName("beldar");
		user.setPassword("p@ssw0rd");
		
		Post post = new Post();
		post.setMessage("Just Say No!");
		post.setOwner(user);
		post.setPosted(LocalDate.now());
		
		Post post2 = new Post();
		post2.setMessage("I Tried");
		post2.setOwner(user);
		post2.setPosted(LocalDate.now());
		post2.setParent(post);
		
		List<Post> replies = new ArrayList<Post>();
		replies.add(post2);
		post.setReplies(replies);
		
		List<Post> all = new ArrayList<Post>();
		all.add(post);
		all.add(post2);
		
		user.setPosts(all);
		
		
		//------------------------------------------------------
		
		User user2 = new User();
		user2.setFirstName("Troy");
		user2.setLastName("Vannocker");
		user2.setEmail("tvannocker@stumail.fhtc.edu");
		user2.setUserName("tannocker");
		user2.setPassword("p@ssw0rd");
		
		Post post3 = new Post();
		post3.setMessage("Eat my shorts");
		post3.setOwner(user2);
		post3.setPosted(LocalDate.now());
		
		Post post4 = new Post();
		post4.setMessage("No way man!");
		post4.setOwner(user);
		post4.setPosted(LocalDate.now());
		post4.setParent(post3);
		
		List<Post> replies1 = new ArrayList<Post>();
		replies1.add(post3);
		post3.setReplies(replies1);
		
		List<Post> all1 = new ArrayList<Post>();
		all1.add(post3);
		all1.add(post4);
		
		user2.setPosts(all1);
		
		
		
		//------------------------------------------------------------
		
		User user3 = new User();
		user3.setFirstName("King");
		user3.setLastName("Koopa");
		user3.setEmail("Kkoopa@stumail.fhtc.edu");
		user3.setUserName("Kkoopa");
		user3.setPassword("p@ssw0rd");
		
		Post post5 = new Post();
		post5.setMessage("I eat turtles for lunch...");
		post5.setOwner(user2);
		post5.setPosted(LocalDate.now());
		
		Post post6 = new Post();
		post6.setMessage("I like turtles!");
		post6.setOwner(user);
		post6.setPosted(LocalDate.now());
		post6.setParent(post5);
		
		List<Post> replies2 = new ArrayList<Post>();
		replies2.add(post5);
		post5.setReplies(replies2);
		
		List<Post> all2 = new ArrayList<Post>();
		all2.add(post5);
		all2.add(post6);
		
		user3.setPosts(all2);
		
		
		List<User> users = new ArrayList<User>();
		users.add(user);// adds an item at the end of the array
		users.add(user2);
		users.add(user3);
		
		
		for (User u : users){
				u.print();
		}
		
		// Print out post count
		// Print out reply count
		
		//long postCount = user.getPosts().stream().filter(x -> x.getParent() == null).count();
		
		//long replyCount = user.getPosts().stream().filter(x -> x.getParent() != null).count();
		
		// stream filter post.getParent() == null = Root Post
		//                                != null = Post Reply
		
		// Dependency chain
		// Person <- User <- Post <- Reply
		 
		

	}

}

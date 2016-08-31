/*
 * This class takes us back to the good old days of Napster and Morpheus file sharing. The track below
 * represents a MP3 audio track. Complete the todo statements and submit the file to moodle.
 */

import java.util.Scanner;

public class Track {
	
	public static Scanner scanner = new Scanner(System.in);
	
	// TODO create variables for the following fields: 
	// track number
	private int trackNum;
	
	// title
	private String title;
	
	// artist
	private String artist;
	
	// duration ( in seconds ),
	private int duration;
	
	// bit rate ( acceptable values are 128 kbps, 160 Kbps, 192 Kbps, 256 Kbps, 320 Kbps )
	private int bitRate;
	
	
	// TODO create getters/setters for the fields
	
	public int getTrackNum() { return trackNum; }
	public void setTrackNum(int tn) { trackNum = tn; }
	
	public String getTitle() {return title;}
	public void setTitle(String t){ title = t; }
	
	public String getArtist() {return artist;}
	public void setArtist(String a){ artist = a; }
	
	public int getDuration() { return duration; }
	public void setDuration(int d) { duration = d; }
	
	// TODO create a default constructor that prompts for all of the fields
	public void trackInfo() {
		
		System.out.println("Enter the number of the track: ");
		System.out.println("Enter the Title of the track: ");
		System.out.println("Enter the Artist: ");
		System.out.println("Enter the duration of the track in seconds: ");
		System.out.println("Enter the bit rate of the track: ");
		
	}
	
	
	// TODO when assigning a bit rate make sure it ends up as one of the acceptable values
	int v = 128;
	int w = 160;
	int x = 192;
	int y = 256;
	int z = 320;
	// If the number is > 128 but < 160 it should be assigned 128, like wise for 160 - 191, 193 - 255,
	// and 257 - 319
	public void Rate() {
	
	if (bitRate <= v && bitRate >= w){
		System.out.println("Good");
	}
	else if (bitRate <= x && bitRate >= y){
		System.out.println("Better");
	}
	else {
		System.out.println("Best");
	}
	}
	// TODO create a function that returns a string rating of the bit rate
	// 128, 160 = "Good"
	// 192, 256 = "Better"
	// 320 = "Best
	
	// TODO create a function that returns a string duration in minutes and seconds ( human readable )

	// TODO create a function that prints out the track's information as follows:
	/*
	   {track number} - {title}
	   {artist}
	   {human readable duration }
	   {bit rate} {bit rate rating}
	   
	   ex.
	   
	   2 - Nutshell
	   Alice in Chains
	   4 minutes and 19 seconds
	   256 Kbps Better Quality	   
	   
	 */
}
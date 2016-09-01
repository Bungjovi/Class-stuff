/*
 * This class takes us back to the good old days of Napster and Morpheus file sharing. The track below
 * represents a MP3 audio track. Complete the todo statements and submit the file to moodle.
 */

import java.util.Scanner;

public class Track {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	// TODO create variables for the following fields: 
	private int trackNum;
	private String title;
	private String artist;
	private int duration;
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
	
	// If the number is > 128 but < 160 it should be assigned 128, like wise for 160 - 191, 193 - 255,
	// and 257 - 319
	public void Rate(); {
		
		
	
	if (bitRate <= 127 && bitRate >= 159){
		System.out.println("128");
	}
	else if (bitRate <= 160 && bitRate >= 191){
		return v + String.format("Kpbs Quality is ");
	}
	else if (bitRate <= 192 && bitRate >= 255){
		System.out.println("192");
	}
	else if (bitRate <= 256 && bitRate >= 319){
		System.out.println("256");
	}
	else
	{	System.out.println("320");}
	}
	// TODO create a function that returns a string rating of the bit rate
	// 128, 160 = "Good"
	// 192, 256 = "Better"
	// 320 = "Best
	
	public static String Quality(int bitRate) {
		
		int v = 128;
		int w = 160;
		int x = 192;
		int y = 256;
		int z = 320;
		
		if (bitRate <= 127 && bitRate >= 159){
			return v + String.format("Kpbs Quality is good");
		}
		else if (bitRate <= 160 && bitRate >= 191){
			return w + String.format("Kpbs Quality is ");
		}
	}
}

	private static void Rate() {
		// TODO Auto-generated method stub
		
	}
	
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
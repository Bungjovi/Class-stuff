import java.util.Scanner;

public class Track {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Track t = new Track(); 
	System.out.println("Track: " + t.getTrackNum() + "Title: " + t.getTitle() + "Artist: " + t.getArtist() + "Minutes: " + t.getDurationMin() + ":" + t.getDurationSec() + "Your bit rate is: " + t.getBitRate()  );
	}

	// TODO create variables for the following fields:
	private int trackNum;
	private String title;
	private String artist;
	private int durationMin;
	private int durationSec;
	private int bitRate;

	// TODO create getters/setters for the fields

	public int getTrackNum() {
		return trackNum;
	}

	public void setTrackNum(int tn) {
		trackNum = tn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String a) {
		artist = a;
	}

	public int getDurationMin() {
		return durationMin;
	}

	public void setDurationMin(int dm) {
		durationMin = dm;
	}
	public int getDurationSec(){
		return durationSec;}
	public void setDurationSec(int ds){
		durationSec= ds;
	}
	
	public int getBitRate(){
		return bitRate;}
	public void setBitRate(int br){
		bitRate = br;
	}
	

	// TODO create a default constructor that prompts for all of the fields
	public Track() {

		System.out.println("Enter the number of the track: ");
		trackNum = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the Title of the track: ");
		title = scanner.nextLine();
		System.out.println("Enter the Artist: ");
		artist = scanner.nextLine();
		System.out.println("Enter the duration of the track minutes: ");
		durationMin = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the duration of the track in seconds");
		durationSec = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the bit rate of the track: ");
		bitRate = Integer.parseInt(scanner.nextLine());
	}

	// TODO when assigning a bit rate make sure it ends up as one of the
	// acceptable values

	// If the number is > 128 but < 160 it should be assigned 128, like wise for
	// 160 - 191, 193 - 255,
	// and 257 - 319
	public void Rate(int bitRate) {

		if (bitRate <= 127 && bitRate >= 159) {
			System.out.println("128");
		} else if (bitRate <= 160 && bitRate >= 191) {
			System.out.println("160");
		} else if (bitRate <= 192 && bitRate >= 255) {
			System.out.println("192");
		} else if (bitRate <= 256 && bitRate >= 319) {
			System.out.println("256");
		} else {
			System.out.println("320");
		}
	}

	// TODO create a function that returns a string rating of the bit rate
	// 128, 160 = "Good"
	// 192, 256 = "Better"
	// 320 = "Best
	public String Quality(int bitRate) {

		int v = 128;
		int w = 160;
		int x = 192;
		int y = 256;
		int z = 320;

		if (bitRate <= v && bitRate >= w) {
			return v + String.format("Kpbs Quality is Good");
		} else if (bitRate <= 192 && bitRate >= 256) {
			return w + String.format("Kpbs Quality is Better");
		} else {
			return z + String.format("Kbps Quality is Best");
		}
	}

	// TODO create a function that returns a string duration in minutes and
	// seconds ( human readable )
	public String Time() {
		int mins = durationMin / 60;
		int sec = durationMin - (durationSec / 60);
		String time = Integer.toString(mins) + sec;
		return time;
		

	}

	// TODO create a function that prints out the track's information as
	// follows:
	/*
	 * {track number} - {title} {artist} {human readable duration } {bit rate}
	 * {bit rate rating}
	 * 
	 * ex.
	 * 
	 * 2 - Nutshell Alice in Chains 4 minutes and 19 seconds 256 Kbps Better
	 * Quality
	 * 
	 */
}

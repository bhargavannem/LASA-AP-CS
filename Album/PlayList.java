import java.util.Arrays;
import java.lang.Math;

public class PlayList {
	/** Song[] array list instance variable */
	private Song[] list;

	/** default constructor used to set the instance variables to default values */
	public PlayList() {
		// I would recommend setting the length to 1
		list = new Song[1];
		// Then make sure you add 1 song to the list in index 0
		/*
		 * list[0].setTitle(""); list[0].setAlbum(""); list[0].setArtist("");
		 * list[0].setLength(0);
		 */
		list[0] = new Song("", "", "", 0);

	}

	/**
	 * initialization constructor used to set the instance variables
	 * 
	 * @param x the length of the playlist
	 */
	public PlayList(int x) {
		// this should set the length of the playlist
		list = new Song[x];
	}

	/**
	 * modifier method to set the instance variable list
	 * 
	 * @param x the length of the playlist
	 */
	public void setList(int x) {
		// this should set the length of the playlist
		list = new Song[x];
	}

	/**
	 * accessor method to get the entire playlist
	 * 
	 * @return return the entire playslist as a Song[] array
	 */
	public Song[] getList() {
		return list;
	}

	/**
	 * method to add a song to the playlist
	 * 
	 * @param x the position in the playlist to add the song
	 * @param s the song to add to the playlist
	 */
	public void addSong(int x, Song s) {
		/*
		 * you need to check to make sure the array is big enough to add the song if it
		 * is not big enough you will need to create a large enough array and then
		 * transfer the songs to the new array before assigning the new array back to
		 * the list array
		 */
		int someNum = 0;
		for (Song i : list) {
			if (i == null) {
				someNum++;
			}
		}
<<<<<<< HEAD
=======
		int lis = list.length;
		int xval = x;
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
		int diff = 0;
		if ((someNum != list.length && someNum == 0) || x > list.length - 1) {
			diff = x - (list.length - 1);
			Song ls[] = new Song[list.length + diff];
			int count = 0;
			for (Song j : list) {
				ls[count] = j;
				count++;
			}
			list = Arrays.copyOf(ls, ls.length);
		}
		list[x] = s;
	}

	/**
	 * method to get a song from the playlist
	 * 
	 * @param x the position in the playlist to get the song from
	 * @return return the song in the position specified
	 */
	public Song getSong(int x) {
		return list[x];
	}

	/**
	 * method to get the number of songs in the playlist
	 * 
	 * @return return the number of songs in the playlist
	 */
	public int numSongs() {
		return list.length;
	}

	/**
	 * method to get the total length of the playlist specified in seconds
	 * 
	 * @return return the length of the playlist in seconds
	 */
	public int totalLength() {
		/*
		 * before accessing the length of an individual song you should ensure that the
		 * song reference is not null
		 */
		int total = 0;
		int len = 0;
		for (Song i : list) {
			if (i != null) {
				len = i.getLength();
				total += len;
			}
		}
		return total;
	}

	/**
	 * method to remove any songs from the specified artist
	 * 
	 * @param ar the artist of the songs to remove from the playlist
	 */
	public void removeArtist(String ar) {
		/*
		 * to remove the songs with the specified artist you will first need to count
		 * the occurances of that artist. Then you will need to create a new smaller
		 * array Then you can copy the songs to the new array excluding the ones from
		 * the artist
		 */
		int c = 0;
		int loc = 0;
		String artist = "";
		for (Song i : list) {
			if (i != null) {
				artist = i.getArtist();
				if (artist == ar) {
					c++;
				}
				loc++;
			}
		}
		int num = list.length - c;
		Song[] nList = new Song[num];
		loc = 0;
		for (Song j : list) {
			if (j != null) {
				artist = j.getArtist();
			}
			if (artist != ar || j == null) {
				nList[loc] = j;
				loc++;
			}
		}
		list = nList.clone();
	}

	/**
	 * method to remove any songs longer than the length specified
	 * 
	 * @param length length of songs to removed given in seconds
	 */
	public void removeLength(int length) {
		// same as method above with creating a smaller array
		int c = 0;
		int len = 0;
		for (Song i : list) {
			if (i != null) {
				len = i.getLength();
				if (len == length) {
					c++;
				}
			}
		}
		int num = list.length - c;
		Song[] nList = new Song[num];
		int loc = 0;
		for (Song j : list) {
			if (j != null) {
				len = j.getLength();
			}
			if (len != length || j == null) {
				nList[loc] = j;
				loc++;
			}

		}
		list = nList.clone();
	}

	/**
	 * method to shuffle the order of the playlist - use the card shuffling example
	 * from the arrays presentation to help
	 */
	public void shuffle() {
		// use the card shuffling example from the arrays presentation to help you with
		// this
		int n = list.length;
		for (int i = 0; i < n; i++) {
			int a = i + (int) (Math.random() * (n - i));
			Song temp = list[i];
			list[i] = list[a];
			list[a] = temp;
		}

	}

	/**
	 * equals method to determine if two playlists are equal The base class for all
	 * classes instantiated into objects in Java is "Object"
	 * 
	 * @param obj the object to be compared
	 * @return return true or false if the playlists are equal
	 */
	public boolean equals(Object obj) {
		PlayList pl = (PlayList) obj;
		if (!Arrays.equals(list, pl.getList()))
			return false;
		return true;
	}

	/**
	 * toString() method to get the instance variables
	 * 
	 * @return return a String containing the instance variablees
	 */
	public String toString() {
		return Arrays.toString(list);
	}
}
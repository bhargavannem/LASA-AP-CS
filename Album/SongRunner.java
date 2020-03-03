<<<<<<< HEAD
public class SongRunner {
	public static void main(String[] args) {
=======
public class SongRunner
{
	public static void main(String[] args)
	{
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
		// create object using default constructor
		Song test1 = new Song();
		// test the default constructor which also tests the toString() method
		System.out.println(test1);
		// create object using the initialization constructor
		Song test2 = new Song("title", "album", "artist", 333);
		// test the initilization constructor which also tests the toString() method
		System.out.println(test2);
		// create equivalent object for testing equals method
		Song test3 = test2;
		// call setTitle() method
		test2.setTitle("newTitle");
		// call the getTitle() method which also tests the setTitle() method
		System.out.println(test2.getTitle());
		// call setAlbum() method
		test2.setAlbum("newAlbum");
		// call the getAlbum() method which also tests the setAlbum() method
		System.out.println(test2.getAlbum());
		// call the setArtist() method
		test2.setArtist("newArtist");
		// call the getArtist() method which also tests the setArtist() method
		System.out.println(test2.getArtist());
		// call the setLength() method
		test2.setLength(500);
		// call the getLength() method which also tests the setLength() method
		System.out.println(test2.getLength());
		// call the equals method on non-equal objects
		System.out.println(test1.equals(test2));
<<<<<<< HEAD
		// call the equals method on equal objects
=======
		//call the equals method on equal objects
>>>>>>> 215e92c77c3b064abea00bdfaf7b3c54ea749560
		System.out.println(test2.equals(test3));
	}
}
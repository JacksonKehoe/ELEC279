//Jackson Kehoe 20105920
package assignment2;

public class Singer extends Person {
    private String debutAlbum;
    private Date debutAlbumReleaseDate;

    //initializing the no-argument constructor
    public Singer() {
        super();
        debutAlbum = " ";
    }

    //initializing constructor
    public Singer(Person person, String album, Date release) {
        super(person);                                              //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = release;
    }

    //initialize constructors
    public Singer(String entityName, String strBorn, String album, String personsGender, String strRelease, Double level) {
        super(entityName, strBorn, personsGender, level);           //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = new Date(strRelease);
    }

    //initialize constructors
    public Singer(String entityName, int month, int day, int year, String album, String personsGender, int releaseMonth, int releaseDay, int releaseYear, Double level) {
        super(entityName, month, day, year, personsGender, level);  //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = new Date(releaseMonth, releaseDay, releaseYear);
    }

    //initialize constructors
    public Singer(String entityName, String month, int day, int year, String album, String personsGender, String releaseMonth, int releaseDay, int releaseYear, Double level) {
        super(entityName, month, day, year, personsGender, level);  //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = new Date(releaseMonth, releaseDay, releaseYear);
    }

    //initialize constructors
    public Singer(String entityName, int year, String album, String personsGender, Date release, Double level) {
        super(entityName, year, personsGender, level);              //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = release;
    }

    //initialize constructors
    public Singer(String entityName, Date birthDate, String personsGender, String album, Date release, Double level) {
        super(entityName, birthDate, personsGender, level);         //initializing instance variables using the inputs to constructor
        debutAlbum = album;
        debutAlbumReleaseDate = release;
    }

    //initializing copy-constructor
    public Singer(Singer singer){
        super(singer);                                              //copying input object into new object
        debutAlbum = singer.getDebutAlbum();
    }

    //initialize clone
    public Singer clone() {
        return new Singer(this);                                    //make a duplication of the input object
    }

    // accessor to fetch the debutAlbum
    public String getDebutAlbum() {
        return debutAlbum;
    }

    // accessor to fetch the releaseDate
    public Date getReleaseDate() {
        return new Date(debutAlbumReleaseDate);
    }

    //returning a String to the abstract method entityType
    public String entityType() {
        return "This is a Singer!";                                 //entityType is Singer
    }

    //initializing the toString function to return details about the entity
    public String toString() {
        return "Name: " + this.getName() + "\nBorn at: " + this.getBorn() + "\nGender: " + this.getGender() + "\nDebut Album: " + this.getDebutAlbum() + "\nRelease Date: " + this.getReleaseDate();
    }
}
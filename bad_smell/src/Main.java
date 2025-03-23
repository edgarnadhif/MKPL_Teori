
public class Main {
    public static void main(String[] args) {
        Song song = new Song("1", "Bohemian Rhapsody", "1975", "queen_bohrap.mp3");
        song.setGenre(Genre.ROCK);

        Artist artist = new Artist("Queen", "Legendary Rock Band", "queen.jpg");
        Album album = new Album("A Night at the Opera", "opera_cover.jpg");

        song.setArtist(artist);
        song.setAlbum(album);

        System.out.println("Detail Level 0:");
        song.printInfo(0);
        
        System.out.println("\nDetail Level 1:");
        song.printInfo(1);
        
        System.out.println("\nDetail Level 2:");
        song.printInfo(2);
        
        System.out.println("\nDetail Level 3:");
        song.printInfo(3);
    }
}

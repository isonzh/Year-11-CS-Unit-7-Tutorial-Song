import java.util.ArrayList;

public class Song {

        //properties
        private String title;
        private String artist;
    ArrayList<String> temp = new ArrayList<>();

        //constructor
        public Song(String title, String artist){
            this.title = title;
            this.artist = artist;
        }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }
    public int howMany (ArrayList<String> people){
        int count = 0;
        for (String name: people) {
            String finalName = name.toLowerCase();
            if (temp.contains(finalName) == false) {
                temp.add(finalName);
                count++;
            }

        }
        return count;

    }
}

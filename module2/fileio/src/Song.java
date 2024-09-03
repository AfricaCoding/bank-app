import java.util.Set;
import java.util.TreeSet;

class Song {
    private String name;
    private int number;
    private Set<Verse> verses;

    public Song() {
        this.verses = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set<Verse> getVerses() {
        return verses;
    }

    public void setVerses(Set<Verse> verses) {
        this.verses = verses;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", verses=" + verses +
                '}';
    }
}

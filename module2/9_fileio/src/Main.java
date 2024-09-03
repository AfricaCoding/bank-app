import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private final static String NOM_DU_FICHIER = "fichier.txt";
    private final static String PATTERN_COUPLET = "^(\\d+)\\.\\s+(\\w.+)";
    private final static String PATTERN_REFRAIN = "^(\\*)\\s+(\\w.+)";
    private final static String PATTERN_SONG_NUMBER = "^\\d+$";
    private final static String PATTERN_SONG_NAME = "^[A-Z].+$";
    private final static String PATTERN_NEW_LINE = "\\n\\n";


    public static void main(String[] args) throws IOException {
        Pattern patternCouplet = Pattern.compile(PATTERN_COUPLET);
        Pattern patternRefrain = Pattern.compile(PATTERN_REFRAIN);
        Pattern patternSongNumber = Pattern.compile(PATTERN_SONG_NUMBER);
        Pattern patternSongName = Pattern.compile(PATTERN_SONG_NAME);
        Pattern patternNewLine = Pattern.compile(PATTERN_NEW_LINE);

        List<Song> songs = new ArrayList<>();

        File file = new File(NOM_DU_FICHIER);
        if (!file.exists()){
            boolean newFile = file.createNewFile();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(NOM_DU_FICHIER))) {
            Song song = new Song();

            String ligne;
            while ((ligne = br.readLine()) != null) {
                Matcher matcherCouplet = patternCouplet.matcher(ligne);
                Matcher matcherRefrain = patternRefrain.matcher(ligne);
                Matcher matcherSongNumber = patternSongNumber.matcher(ligne);
                Matcher matcherSongName = patternSongName.matcher(ligne);
                Matcher matcherNewLine = patternNewLine.matcher(ligne);

               if (matcherSongNumber.find()){
                   song.setNumber(Integer.parseInt(ligne));
               }else if (matcherSongName.find()){
                  song.setName(ligne);
               } else if (matcherCouplet.find()) {
                   Verse verse = new Verse();
                   verse.setId(matcherCouplet.group(1));
                   verse.setLine(matcherCouplet.group(2));
                   verse.setRefrain(false);
                   song.getVerses().add(verse);
               } else if (matcherRefrain.find()) {
                   Verse verse = new Verse();
                   verse.setId(matcherRefrain.group(1));
                   verse.setLine(matcherRefrain.group(2));
                   verse.setRefrain(true);
                   song.getVerses().add(verse);
               }else if (ligne.isEmpty()|| ligne.isBlank()){
                   songs.add(song);
                   song = new Song();
               }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (Song song: songs){
            System.out.println(song.getNumber());
            System.out.println(song.getName());
            for (Verse verse: song.getVerses()){
                if (verse.isRefrain()){
                    System.out.print(verse.getId()+" ");
                }else {
                    System.out.print(verse.getId()+". ");
                }
                System.out.println(verse.getLine());
            }
            System.out.println("***** fin du cantique ****\n");
        }

    }
}



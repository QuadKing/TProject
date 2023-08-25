package Diary;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ID {
    private String entry;
    private String timestamp;
    private String id;

    public ID(String entry) {
        this.entry = entry;
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.timestamp = date.format(formatter);
        Random rand = new Random();
        this.id = timestamp + "-" + Integer.toString(rand.nextInt(1000));
    }

    public String getEntry() {
        return entry;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }
}

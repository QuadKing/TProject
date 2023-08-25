package Diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class DiaryEntry {
        private String entry;
        private String timestamp;

        public DiaryEntry(String entry) {
            this.entry = entry;
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            this.timestamp = date.format(formatter);
        }

        public String getEntry() {
            return entry;
        }

        public String getTimestamp() {
            return timestamp;
        }
    }



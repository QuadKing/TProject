package Diary;

import DiaryEntryID.DiaryEntryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiaryEntryTest {
    @Test
    public void testDiaryEntry() {
        // Create a new DiaryEntry object with a sample entry
        String sampleEntry = "Today was a good day.";
        DiaryEntryID diaryEntry = new DiaryEntryID(sampleEntry);

        // Check that the entry is correctly set
        Assertions.assertEquals("Today was a good day.", sampleEntry, diaryEntry.getEntry());

        // Check that the timestamp is correctly set and in the correct format
        String timestamp = diaryEntry.getTimestamp();
        String expectedFormat = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
        Assertions.assertTrue(timestamp.matches(expectedFormat), "The timestamp should be correctly set and in the format 'yyyy-MM-dd HH:mm:ss'");
    }
}

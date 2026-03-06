package se.lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ConversionLogger {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void logConversion() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Converted at: " + now.format(formatter));
    }
}
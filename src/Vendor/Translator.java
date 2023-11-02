package Vendor;

import java.util.Random;

public class Translator {
    private String sourceLanguage;
    private String targetLanguage;

    private static final String[] availableLanguages = { "English", "French", "Spanish", "German","Polish", "Italy" };

    public Translator() {
        Random random = new Random();
        sourceLanguage = availableLanguages[random.nextInt(availableLanguages.length)];
        targetLanguage = availableLanguages[random.nextInt(availableLanguages.length)];
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    @Override
    public String toString() {
        return sourceLanguage + " -> " + targetLanguage;
    }
}


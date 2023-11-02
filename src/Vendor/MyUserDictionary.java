package Vendor;

import java.util.HashMap;
import java.util.Map;

public class MyUserDictionary implements UserDictionary {
    private Map<String, Translator> userDictionary;

    public MyUserDictionary() {
        userDictionary = new HashMap<>();
        userDictionary.put("Carolinca", new Translator());
        userDictionary.put("Vasile", new Translator());
        userDictionary.put("Leopold", new Translator());
        userDictionary.put("Diana", new Translator());
        userDictionary.put("Victor", new Translator());
        // Adaugă mai mulți utilizatori și traducători după nevoie
    }

    @Override
    public Map<String, Translator> getUserDictionary() {
        return userDictionary;
    }
}

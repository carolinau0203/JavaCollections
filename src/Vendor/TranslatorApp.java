package Vendor;

import java.util.Map;

public class TranslatorApp {
    public static void main(String[] args) {
        UserDictionary userDictionary = new MyUserDictionary();
        Map<String, Translator> dictionary = userDictionary.getUserDictionary();

        for (Map.Entry<String, Translator> entry : dictionary.entrySet()) {
            String username = entry.getKey();
            Translator translator = entry.getValue();
            System.out.println(username + ": " + translator.toString());
        }
    }
}

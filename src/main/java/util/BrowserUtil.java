package util;

import java.io.IOException;

public class BrowserUtil {
    public static void openBrowserOnMac(String url) throws IOException {

        if (url == null || url.isEmpty() || url.length() == 0) {
            url = "http://yahoo.com.hk";
        }
        String Command = "open " + url;
        Process Child = Runtime.getRuntime().exec(Command);

    }
}

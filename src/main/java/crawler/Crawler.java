package crawler;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Crawler {

    public void crawling(String domainName)
    {
        URL url;
        InputStream is = null;
        BufferedReader dis;
        String line;

        try {
            url = new URL(domainName);
            is = url.openStream();  // throws an IOException
            dis = new BufferedReader(
                    new InputStreamReader(is));
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
            }
            dis.close();
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }
    }
}

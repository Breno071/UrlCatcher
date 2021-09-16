package pagina;

import java.io.*;
import java.net.URL;

public class Pagina {

    public void getPage(URL url, File file) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String inputLine;


        while ((inputLine = br.readLine()) != null) {
            System.out.println(inputLine);

            bw.write(inputLine);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

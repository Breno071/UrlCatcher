import pagina.Pagina;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--------------------------");
        System.out.println("Bem vindo ao UrlCatcher!");
        System.out.println("--------------------------");
        Thread.sleep(2000);
        System.out.println("Digite uma url v�lida");
        Scanner input = new Scanner(System.in);
        String userIn = input.nextLine();
        input.close();
        /*http://pudim.com.br/*/
        URL url;
        File file = new File("pagina.html");

        try {
            url = new URL(userIn);
            Pagina pagina = new Pagina();
            pagina.getPage(url, file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

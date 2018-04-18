package parser;

import java.io.BufferedWriter;
import java.io.IOException;
import org.jsoup.*;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {

    /*public static void zczytujLinki() throws UnsupportedEncodingException, FileNotFoundException, IOException {
        int i = 0;
        int x;
        int y = 1;
        int z = 5;

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("oglo.txt"), "utf-8"))) {

            //Tu trzeba uwaĹĽaÄ‡, bo przy j>2 - "wyskakuje" z "odam za darmo" i pokazuje gĹ‚Ăłwnie ogĹ‚oszenia z cenÄ….
            for (int j = 0; j < 3; j++) {

                for (x = y; x < z; x++) {

                    String mainURL = new String("https://www.olx.pl/oddam-za-darmo/?page=" + x);

                    Connection connect = Jsoup.connect(mainURL);
                    Document document = connect.get();

                    Elements links = document.getElementsByClass("thumb vtop inlblk rel tdnone linkWithHash scale4 detailsLink ");

                    for (Element link : links) {

                        i++;
                        String linkHref = link.attr("href");
                        //System.out.println(x + " " + i + " " + linkHref);
                        writer.append(linkHref);
                        writer.newLine();

                    }

                }
                x += 49;
                y += 49;
                z += 49;
            }

            writer.close();
        }
    }*/
    public static void zapisujOgloszenia() throws UnsupportedEncodingException, IOException, NoSuchElementException {
        //Map<Long, Ogloszenie> mapaOgloszen = new HashMap<Long, Ogloszenie>();

        /*File file = new File("oglo1.txt");
        Scanner in = new Scanner(file);*/
        String linkWczytywany = " ";
        File fileBaza = new File("lista.txt");
        PrintWriter out = new PrintWriter(fileBaza);
        //out.println("ID: ,,, TITLE: ,,, LOCALIZATION: ,,, HOW ADDED: ,,, ");

        //while (in.hasNextLine()) {
        for (int i = 1; i < 501; i++) {

            //String mainURL = new String("https://www.olx.pl/oddam-za-darmo/?page=" + i);
            String mainURL = new String("https://www.olx.pl/moda/ubrania/pozostale/?page=" + i);
            Connection connect = Jsoup.connect(mainURL);
            Document document = connect.get();

            //Elements links = document.getElementsByClass("thumb vtop inlblk rel tdnone linkWithHash scale4 detailsLink ");
            Elements links = document.getElementsByClass("thumb tdnone scale1 rel detailsLink linkWithHash ").tagName("href=");
            //System.out.println(links);
            for (Element link : links) {

                linkWczytywany = link.attr("href");

                //linkWczytywany = linkHref;
                Connection connect1 = Jsoup.connect(linkWczytywany);
                
                Document ogloszenieWczytywane;
                
                Elements idOgloszenia = null;
                Elements titleOgloszenia= null;
                Element localOgloszenia= null;
                Elements dateOgloszenia= null;
                Elements descrOgloszenia= null;
                Elements viewsOgloszenia= null;
                Elements cenaOgloszenia= null;
                
                try {ogloszenieWczytywane = connect1.get();
                                
                idOgloszenia = ogloszenieWczytywane.getElementsByClass("clm-samurai");
                titleOgloszenia = ogloszenieWczytywane.getElementsByClass("xx-large fbold lheight26 pdingtop10");
                localOgloszenia = ogloszenieWczytywane.getElementsByClass("show-map-link").first();
                dateOgloszenia = ogloszenieWczytywane.getElementsByTag("em");
                descrOgloszenia = ogloszenieWczytywane.getElementsByClass("pding10 lheight20 large");
                viewsOgloszenia = ogloszenieWczytywane.getElementsByClass("pdingtop10").eq(2);
                cenaOgloszenia = ogloszenieWczytywane.getElementsByClass("xxxx-large not-arranged");
                if (cenaOgloszenia.isEmpty()){
                cenaOgloszenia = ogloszenieWczytywane.getElementsByClass("xxxx-large arranged");    
                }
                } catch (Exception ee) {System.out.println("Error");}
                
             
                String iD = idOgloszenia.attr("data-item");
                String title = titleOgloszenia.text();
                
                String local = "!!!";
                if (localOgloszenia!=null){
                local = localOgloszenia.text();
                }
                
                String date = dateOgloszenia.text();
                
                
                int indexID = date.indexOf(", ID");
                int indexO = (date.indexOf(" o ")+9);
                
                try {date = date.substring(indexO, indexID);
                        } catch (StringIndexOutOfBoundsException e) {System.out.println("Error");}
                
                String descr = descrOgloszenia.text();
                String views = viewsOgloszenia.text();
                
                try {views = views.substring(11);
                        } catch (StringIndexOutOfBoundsException e) {System.out.println("Error");}
                String price = cenaOgloszenia.text();
                if (price.isEmpty()) {
                    price = "!a darmo";
                }
                
                

                out.println(iD + " ,,, " + title + " ,,, " + local + " ,,, "
                         + date + " ,,, "+ views+ " ,,, " + price + " ,,, "+ descr  +" ,,, " + linkWczytywany);
            }
        }
        
        
        out.close();
    }

    //try (BufferedReader reader = new BufferedReader(new InputStreamReader(
    //        new FileInputStream("baza.txt"), "utf-8"))) {
    //}


public static void main(String[] args) throws IOException {
        try{
        zapisujOgloszenia();
        } catch (Exception e) {System.out.println("Error");}

    }

}

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

    public static void zapisujOgloszenia() throws UnsupportedEncodingException, IOException, NoSuchElementException {
        //Map<Long, Ogloszenie> mapaOgloszen = new HashMap<Long, Ogloszenie>();

        /*File file = new File("oglo1.txt");
        Scanner in = new Scanner(file);*/
        String linkWczytywany = " ";
        File fileBaza = new File("lista.txt");
        PrintWriter out = new PrintWriter(fileBaza);
        

     
        for (int i = 1; i < 3; i++) {

            String mainURL = new String("https://www.otomoto.pl/osobowe/?page=" + i);
            Connection connect = Jsoup.connect(mainURL);
            Document document = connect.get();

            Elements links = document.getElementsByClass("offer-item__photo-link");
           // Elements links = document.getElementsByClass("thumb tdnone scale1 rel detailsLink linkWithHash ").tagName("href=");
            //System.out.println(links);
            for (Element link : links) {

                linkWczytywany = link.attr("href");
                
                Connection connect1 = Jsoup.connect(linkWczytywany);
                Document ogloszenieWczytywane;
                
                //String photoNumber = null;
                Elements idOgloszenia = null;
                Elements titleOgloszenia= null;
                Element localOgloszenia= null;
                Elements dateOgloszenia= null;
                Elements descrOgloszenia= null;
                Elements viewsOgloszenia= null;
                Elements cenaOgloszenia= null;
                
                try {ogloszenieWczytywane = connect1.get();
                                
                //idOgloszenia = ;
                
                //photoNumber = ogloszenieWczytywane.wholeText();
                
                //    System.out.println(photoNumber);
                titleOgloszenia = ogloszenieWczytywane.getElementsByClass("offer-title big-text");
                cenaOgloszenia = ogloszenieWczytywane.getElementsByClass("offer-price__number");
                descrOgloszenia = ogloszenieWczytywane.getElementsByClass("offer-description");
                
                    
                out.print(linkWczytywany + " ,,, " + ogloszenieWczytywane.getElementsByClass("offer-meta__label").next().text() + " ,,, " + titleOgloszenia.text() + " ,,, " + cenaOgloszenia.text() + " ,,, " + descrOgloszenia.text());
                out.println();
                
                /*localOgloszenia = ogloszenieWczytywane.getElementsByClass("show-map-link").first();
                dateOgloszenia = ogloszenieWczytywane.getElementsByTag("em");
                
                viewsOgloszenia = ogloszenieWczytywane.getElementsByClass("pdingtop10").eq(2);
               
                if (cenaOgloszenia.isEmpty()){
                cenaOgloszenia = ogloszenieWczytywane.getElementsByClass("xxxx-large arranged");    
                }*/
                } catch (Exception ee) {System.out.println("Error getElements");}
                
             
                //String iD = idOgloszenia.attr("data-item");
                //String title = titleOgloszenia.text();
                
                /*String local = "!!!";
                if (localOgloszenia!=null){
                local = localOgloszenia.text();
                }*/
                
                //String date = dateOgloszenia.text();
                
                
                //int indexID = date.indexOf(", ID");
                //int indexO = (date.indexOf(" o ")+9);
                
                //try {date = date.substring(indexO, indexID);
                //        } catch (StringIndexOutOfBoundsException e) {System.out.println("Error date");}
                
                //String descr = descrOgloszenia.text();
                //String views = viewsOgloszenia.text();
                
                //try {views = views.substring(11);
                //        } catch (StringIndexOutOfBoundsException e) {System.out.println("Error views");}
                //String price = cenaOgloszenia.text();
                //if (price.isEmpty()) {
                //    price = "!Error!ceny";
                //}
                
                

                //System.out.println(title +  " ,,, " + views+ " ,,, " + price + " ,,, "+ descr  +" ,,, " + linkWczytywany);
                //out.println(title +  " ,,, " + views+ " ,,, " + price + " ,,, "+ descr  +" ,,, " + linkWczytywany);
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
        } catch (Exception e) {System.out.println("Error main");}

    }

}

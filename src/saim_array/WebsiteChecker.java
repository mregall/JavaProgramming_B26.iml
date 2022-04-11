package saim_array;

import java.util.Arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        /*
        Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain

Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu,
         */

        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int com = 0;
        int org = 0;
        int edu = 0;

        for (int i = 0; i < websites.length; i++) {
            if (websites[i].contains(".com")){
                com++;
            }else if(websites[i].contains(".org")){
                org++;
            }else if(websites[i].contains(".edu")){
                edu++;
            }

        }System.out.println("Dotcoms: " + com);
        System.out.println("Dotorgs: " + org);
        System.out.println("Dotedus: " + edu);
        System.out.println("Others: " + (websites.length - com - org - edu));
    }
}

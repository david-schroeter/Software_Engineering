package three;

import java.util.*;

public class Satellite {
    // ratings are subjective, sorry if your favorite beer didn't make the cut, you can add it if you want!
    private final static List<Beer> beers = Arrays.asList(
        new Beer("Cuvée des Trolls", 8),
        new Beer("Lupulus", 9),
        new Beer("Kwak", 10),
        new Beer("Punk IPA", 7),
        new Beer("Gurten", 5),
        new Beer("Wittekop", 4),
        new Beer("Brooklyn Lager", 6),
        new Beer("CoCo POW!", 0)
    );

    private static final TopNPrinter<Beer> printer = new TopNPrinter<>(5, "====TOP BEERS====");

    // prints the top N most popular beers in a nice way
    public static void prettyPrintMostPopularBeers() {
        printer.prettyPrintTopN(beers);
    }

    // Other methods like:
    // getOpeningHours()
    // getPizzaOfTheDayTopping()
    // getMostPopularNonAlcoholicBeverages()
    // ...

    static private class Beer implements Comparable<Beer> {
        String name;
        int popularity;

        Beer(String name, int popularity) {
            this.name = name;
            this.popularity = popularity;
        }

        @Override
        public int compareTo(Beer o) {
            return Integer.compare(o.popularity, this.popularity);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

package com.myob;

public enum Zodiac {

    ARIES("March 21 – April 19","Mars","The Ram"),
    TAURUS("April 20 – May 20","Venus","The bull"),
    GEMINI("May 21 – June 20","Mercury","The Twins"),
    CANCER("June 21 – July 22","Moon","The Crab"),
    LEO("July 23 – August 22","Sun","The Lion"),
    VIRGO("August 23 – September 22","Mercury","The Maiden"),
    LIBRA("September 23 – October 22","Venus","The Balance"),
    SCORPIO("October 23 – November 21","Mars","The Scorpio"),
    SAGITTARIUS("November 22 – December 21","Jupiter","The Archer"),
    CAPRICON("December 22 – January 19","Saturn","The Goat-Fish hybrid"),
    AQUARIUS("January 20 – February 18","Saturn","The Water bearer"),
    PISCES("February 19 – March 20","Jupiter","The Fish");

    String dateRange;
    String rulingPlanet;
    String symbol;
    Zodiac(String dateRange,String rulingPlanet, String symbol) {
        this.dateRange = dateRange;
        this.rulingPlanet = rulingPlanet;
        this.symbol = symbol;
    }

    public String getDateRange() {
        return dateRange;
    }

    public String getRulingPlanet() {
        return rulingPlanet;
    }

    public String getSymbol() {
        return symbol;
    }
}

package edu.ucsb.cs156.pconrad.menuitem;

public class MenuItem {

    private String name;
    private int priceInCents;
    private String category;

    /**
     * Custom exception thrown when getPrice is called with a width
     * that is too narrow for the formatted price.
     */

    public static class TooNarrowException extends RuntimeException {
    }


    public MenuItem(String name, int priceInCents, String category) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }


    public String getPrice() {
        return "$" + princeInCents / 100 + "." + princeInCents % 100;
    }

    public String getPrice(int width) {
        String price = getPrice();
        int L = price.length;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < width - L; i++;){
                sb.sppend(" ");
            }
        if (width < l) throw new TooNarrowException();
        else return sb.toString()+"$" + price.substring(1);
    }

    @Override
    public String toString() {
        return this.name + "," + priceInCents + "," + category;
    }

}

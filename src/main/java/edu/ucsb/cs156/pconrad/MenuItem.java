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
        // stub
        this.name = name;
        this.priceInCents = priceInCents;
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public String getName(){
        return name;
    }

    /**
     * Returns the price, formatted as a string with a $.
     * For example "$0.99", "$10.99", or "$3.50"
     */

    public String getPrice() {

        return "$" + priceInCents / 100 + "." + priceInCents % 100;
    }

    /**
     * Returns the price, formatted as a string with a $,
     * right justified in a field with the specified width.
     * For example "$0.99", "$10.99", or "$3.50".
     * <p>
     * If the width is too small, throws TooNarrowException
     *
     * @param width width of returned string
     */

    public String getPrice(int width) {
        String price = getPrice();
        int l = price.length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < width - l; i++) {
            sb.append(" ");
        }
        if (width < l) throw new TooNarrowException();
        else return  sb.toString()+"$" + price.substring(1);
    }

    public int getPriceInCents(){
        
        return priceInCents;
    }
    /**
     * return a string in csv format, in the order name,price,cateogry.
     * For example <code>Small Poke Bowl,1049,Poke Bowls</code>
     *
     * @return string in csv format
     */

    @Override
    public String toString() {
        return this.name + "," + getPriceInCents() + "," + category;
    }

}

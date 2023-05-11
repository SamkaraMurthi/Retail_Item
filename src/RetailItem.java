/** Kadek Narayana 60092
 * January 10, 2022
 */
class RetailItem {

    private String description;
    private int unitsOnhand;
    private double price;
    //Constructor parameter
    public RetailItem(String desc, int unt, double prc) throws NegativePrice, NegativeUnits {
        description = desc;
        if (unt < 0)
        {
            throw new NegativeUnits(unt);
        }
        else
        {
            unitsOnhand = unt;
        }
        unitsOnhand = unt;
        if (prc < 0)
        {
            throw new NegativePrice(prc);
        }
        else
        {
            price = prc;
        }
    }

    public void setDescription(String desc) {
        description = desc;
    }

    public void setPrice(double prc) throws NegativePrice {
        if (prc < 0)
        {
            throw new NegativePrice(prc);
        }
        else
        {
            price = prc;
        }
    }

    void setUnitsOnhand(int unt) throws NegativeUnits {
        if (unt < 0)
        {
            throw new NegativeUnits(unt);
        }
        else
        {
            unitsOnhand = unt;
        }
    }

    //get Data method
    public int getUnitsOnhand() {
        return unitsOnhand;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
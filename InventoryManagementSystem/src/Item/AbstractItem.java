package Item;

import java.time.LocalDate;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    protected String name;
    protected String description;
    protected int price;
    protected int quantity;
    protected String category;
    protected boolean perishable;
    protected boolean sellable;
    protected boolean broken;

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public void setBroken(boolean b) {
        if(b){
            this.broken = true;
        }
    }

    @Override
    public String getItemStatus() {
        if(broken){
            return "Broken";
        }
        return "Not Broken";
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public boolean isCategorizable() {
        return false;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public double calculateValue(int quantity) {
        return 0;
    }

    @Override
    public boolean isPerishable() {
        return false;
    }

    @Override
    public void setPerishable(boolean perishable) {

    }

    @Override
    public LocalDate setInitialDate(LocalDate initialDate) {
        return null;
    }

    @Override
    public LocalDate calculateExpiryDate(int days) {
        return null;
    }

    @Override
    public void displayPerishable() {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {

    }
}

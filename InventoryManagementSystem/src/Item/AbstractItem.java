package Item;

import java.time.LocalDate;

public abstract class AbstractItem implements Item, Categorizable, Breakable, Perishable, Sellable {
    protected String name;
    protected String description;
    protected double price;
    protected String category;
    protected boolean perishable;
    protected boolean broken;
    protected LocalDate initialDate;

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public void setBroken(boolean b) {
        if (b) {
            this.broken = true;
        }
    }

    @Override
    public String getItemStatus() {
        if (broken) {
            return "Broken";
        }
        return "Not Broken";
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        if (description != null && !description.isEmpty()) {
            this.description = description;
        }
    }

    @Override
    public abstract double calculateValue(int quantity);

    @Override
    public abstract boolean isPerished();

    @Override
    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    ;

    @Override
    public abstract LocalDate calculateExpiryDate(int days);

    @Override
    public void displayPerishable() {
        if (perishable) {
            System.out.println("Perishable");
        } else {
            System.out.println("Not Perishable");
        }
    }

    @Override
    public double getPrice() {
        if (price != 0) {
            return price;
        }
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

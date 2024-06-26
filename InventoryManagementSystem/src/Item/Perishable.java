package Item;

import java.time.LocalDate;

public interface Perishable {
    public boolean isPerishable();
    public void setPerishable(boolean perishable);
    public LocalDate setInitialDate(LocalDate initialDate);
    LocalDate calculateExpiryDate(int days);
    void displayPerishable();

}

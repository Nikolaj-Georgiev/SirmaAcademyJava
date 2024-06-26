package Item;

import java.time.LocalDate;

public interface Perishable {
    public boolean isPerishable();
    public void setPerishable(boolean perishable);
    public void setInitialDate(LocalDate initialDate);
    LocalDate calculateExpiryDate(int days);
    void displayPerishable();
}

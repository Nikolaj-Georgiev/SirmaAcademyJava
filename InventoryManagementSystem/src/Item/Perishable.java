package Item;

import java.time.LocalDate;

public interface Perishable {
    boolean isPerishable();

    void setPerishable(boolean perishable);

    void setInitialDate(LocalDate initialDate);

    LocalDate calculateExpiryDate(int days);

    void displayPerishable();
}

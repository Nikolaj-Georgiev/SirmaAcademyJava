package item;

import java.time.LocalDate;

public interface Perishable {
    boolean isPerished();

    void setPerishable(boolean perishable);

    void setInitialDate(LocalDate initialDate);

    LocalDate calculateExpiryDate(int days);

    void displayPerishable();
}

package FileInputOutput;

import Inventory.GroceryItem;
import Inventory.InventoryItem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import static FileInputOutput.ExcelConstants.*;

public class ExcelFileIO {
    private static final String FILE_NAME = "inventory.xlsx";

    public static void saveInventory(List<InventoryItem> inventory) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Inventory");

        int rowNum = 0;
        for (InventoryItem item : inventory) {
            Row row = sheet.createRow(rowNum++);

            writeItem(item, row);
        }

        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME)) {
            workbook.write(fileOut);
        }

        workbook.close();
    }

    private static void writeItem(InventoryItem item, Row row) {
        Cell cell = row.createCell(COL_CLASS_NAME);
        cell.setCellValue(item.getClass().getSimpleName());

        cell = row.createCell(COL_ID);
        cell.setCellValue(item.getId());

        cell = row.createCell(COL_NAME);
        cell.setCellValue(item.getName());

        cell = row.createCell(COL_DESCRIPTION);
        cell.setCellValue(item.getDescription());

        cell = row.createCell(COL_PRICE);
        cell.setCellValue(item.getPrice());

        cell = row.createCell(COL_CATEGORY);
        cell.setCellValue(item.getCategory());

        cell = row.createCell(COL_QUANTITY);
        cell.setCellValue(item.getQuantity());

        if (item instanceof GroceryItem) {
            GroceryItem gItem = (GroceryItem) item;
            cell = row.createCell(COL_EXP_DAYS);
            cell.setCellValue(gItem.getExpDays());
        }
//    ако има други специфични колони могат да се направят проверки и за тях

    }
}

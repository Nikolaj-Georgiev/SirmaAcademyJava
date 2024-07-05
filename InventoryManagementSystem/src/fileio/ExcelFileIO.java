package fileio;

import inventory.ElectronicsItem;
import inventory.FragileItem;
import inventory.GroceryItem;
import inventory.InventoryItem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static fileio.ExcelConstants.*;

public class ExcelFileIO {
    private static final String FILE_NAME = "inventory.xlsx";

    public static void saveInventory(List<InventoryItem> inventory) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("inventory");

        int rowNum = 0;
        for (InventoryItem item : inventory) {
            XSSFRow row = sheet.createRow(rowNum++);

            writeItem(item, row);
        }

        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME)) {
            workbook.write(fileOut);
        }

        workbook.close();
    }

    private static void writeItem(InventoryItem item, XSSFRow row) {
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

        cell = row.createCell(COL_INITIAL_DATE);
        cell.setCellValue(item.getInitialDate());

        if (item instanceof GroceryItem) {
            GroceryItem gItem = (GroceryItem) item;
            cell = row.createCell(COL_EXP_DAYS);
            cell.setCellValue(gItem.getExpDays());
        }
//    I can add more checks if there are other specific colls

    }

    public static List<InventoryItem> loadInventory() throws IOException {
        List<InventoryItem> inventory = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(FILE_NAME)) {
            XSSFWorkbook workbook = new XSSFWorkbook(fileIn);
            XSSFSheet sheet = workbook.getSheet("inventory");

            for (Row row : sheet) {
                InventoryItem item = readItem((XSSFRow) row);
                inventory.add(item);
            }
            workbook.close();
        }
        return inventory;
    }

    private static InventoryItem readItem(XSSFRow row) {
        String className = row.getCell(COL_CLASS_NAME).getStringCellValue();
        String id = row.getCell(COL_ID).getStringCellValue();
        String name = row.getCell(COL_NAME).getStringCellValue();
        String description = row.getCell(COL_DESCRIPTION).getStringCellValue();
        double price = row.getCell(COL_PRICE).getNumericCellValue();
        String category = row.getCell(COL_CATEGORY).getStringCellValue();
        int quantity = Integer.parseInt(row.getCell(COL_QUANTITY).getStringCellValue());
        LocalDate initialDate = LocalDate.parse(row.getCell(COL_INITIAL_DATE).getStringCellValue());

        switch (className) {
            case "GroceryItem":
                int expDays = (int) row.getCell(COL_EXP_DAYS).getNumericCellValue();
                GroceryItem groceryItem = new GroceryItem(name, description, price, category, quantity, expDays);
                groceryItem.setInitialDate(initialDate);
                return groceryItem;
            case "ElectronicItem":
                ElectronicsItem electronicsItem = new ElectronicsItem(name, description, price, category, quantity);
                electronicsItem.setInitialDate(initialDate);
                return electronicsItem;
            case "FragileItem":
                FragileItem fragileItem = new FragileItem(name, description, price, category, quantity);
                fragileItem.setInitialDate(initialDate);
                return fragileItem;
            default:
                throw new IllegalArgumentException(STR."Unknown item type: \{className}");
        }

    }
}

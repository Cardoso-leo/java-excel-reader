import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeitorExcel {

    public static void main(String[] args) {

        String caminhoArquivo = "C:\\Users\\SeuUsuario\\Desktop\\arquivo.xlsx";

        try (FileInputStream fis = new FileInputStream(caminhoArquivo);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // primeira aba

            for (Row row : sheet) {
                for (Cell cell : row) {

                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;

                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;

                        default:
                            System.out.print(" \t");
                            break;
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Import java.io as Javinha

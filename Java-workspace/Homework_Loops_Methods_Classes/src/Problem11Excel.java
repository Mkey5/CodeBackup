//import java.io.FileInputStream;
//import java.util.TreeMap;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Problem11Excel {
//
//	public static void main(String[] args) {
//		try {
//			FileInputStream excel = new FileInputStream(
//					"3. Incomes-Report.xlsx");
//			XSSFWorkbook workbook = new XSSFWorkbook(excel);
//			XSSFSheet sheet = workbook.getSheetAt(0);
//			int rows = sheet.getLastRowNum();
//
//			TreeMap<String, Double> offices = new TreeMap<String, Double>();
//			double totalIncome = 0;
//
//			for (int i = 1; i <= rows; i++) {
//				XSSFRow currentRow = sheet.getRow(i);
//				XSSFCell officeName = currentRow.getCell(0);
//				String currentOffice = officeName.getStringCellValue();
//
//				XSSFCell officeIncome = currentRow.getCell(5);
//				double currentIncome = officeIncome.getNumericCellValue();
//
//				totalIncome += currentIncome;
//
//				if (offices.containsKey(currentOffice)) {
//					currentIncome += offices.get(currentOffice);
//				}
//				offices.put(currentOffice, currentIncome);
//
//			}
//
//			for (String office : offices.keySet()) {
//				double income = offices.get(office);
//				System.out.printf("%s Total -> %.2f%n", office, income);
//			}
//			System.out.println("\nGrand Total -> " + totalIncome);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
package Oxhead_excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class DataClass extends Baseclass {
	static FileInputStream fs;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	int row;
	int col;
	String DataPath="C:\\\\Users\\\\BalarajuGone\\\\git\\\\Envela\\\\Envela\\\\Data\\\\Data1.xlsx"; //"D:\\\\KCSM7\\\\Oxhead\\\\Data\\\\Oxheadtestdata.xlsx"


//	public DataClass2(String filepath) throws FileNotFoundException {
//		this.filepath=filepath;
//
//	}


	public static String data(String sheetname,int rownumber, int cellnumber) throws IOException {
		fs=new FileInputStream(filepath);
		wb =new XSSFWorkbook(fs);
		sh=wb.getSheet(sheetname);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rownumber).getCell(cellnumber));
		return value;
	}


	//Sravya methods
	@DataProvider
	public Object Registrationdata() throws IOException, InterruptedException {
		fs=new FileInputStream(DataPath);  
		wb =new XSSFWorkbook(fs);
		sh=wb.getSheet("RegistrationData");
		row=sh.getLastRowNum();
		col=sh.getRow(0).getLastCellNum();
		Object value[][]=new Object[row][col];
		for(int i=1;i<=row;i++) {
			for(int j=0;j<col;j++) {
				value[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.println("rownumber "+i+" cellnumber "+j+" value "+value[i-1][j]);

			}
		}
		return value;
	}
	
	@DataProvider
	public Object logindata() throws IOException, InterruptedException {
		fs=new FileInputStream(DataPath);
		wb =new XSSFWorkbook(fs);
		sh=wb.getSheet("LoginData");
		row=sh.getLastRowNum();
		col=sh.getRow(0).getLastCellNum();
		Object value[][]=new Object[row][col];
		for(int i=1;i<=row;i++ ) {
			for(int j=0;j<col;j++) {
				value[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
				//System.out.println("rownumber "+i+" cellnumber "+j+" value "+value[i-1][j]);
			}
		}
		return value;
	}

	@DataProvider
	public Object validlogindata() throws IOException, InterruptedException {
		fs=new FileInputStream(DataPath);
		wb =new XSSFWorkbook(fs);
		sh=wb.getSheet("validlogin");
		row=sh.getLastRowNum();
		col=sh.getRow(0).getLastCellNum();
		Object value[][]=new Object[row][col];
		for(int i=1;i<=row;i++ ) {
			for(int j=0;j<col;j++) {
				value[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return value;
	}
	
	@DataProvider
	public Object Addressdata() throws Throwable
	{
		 fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("AddressData");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		Object val[][] = new Object[rows][cols];
				for(int r=1;r<=rows;r++)
				{
					XSSFRow row=sh.getRow(r);
				for(int c=0;c<cols;c++)
				{
					XSSFCell cell=row.getCell(c);
					switch (cell.getCellType()) 
					{
					case STRING:val[r-1][c] = cell.getStringCellValue(); break;
					case NUMERIC:val[r-1][c]=(long) cell.getNumericCellValue();break;
					}
					//System.out.println("khuiyfdgh   "+val[r-1][c]+"  jhgfdf   "+cell.getCellType());
				}
				}
				return val;
	}
	
	@DataProvider
	public Object ValidAddress() throws Throwable
	{
		 fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("ValidAddress");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		Object val[][] = new Object[rows][cols];
				for(int r=1;r<=rows;r++)
				{
					XSSFRow row=sh.getRow(r);
				for(int c=0;c<cols;c++)
				{
					XSSFCell cell=row.getCell(c);
					switch (cell.getCellType()) 
					{
					case STRING:val[r-1][c] = cell.getStringCellValue(); break;
					case NUMERIC:val[r-1][c]=(long) cell.getNumericCellValue();break;
					}
					//System.out.println("khuiyfdgh   "+val[r-1][c]+"  jhgfdf   "+cell.getCellType());
				}
				}
				return val;
	}
	
	
	
	@DataProvider
	public String[][] getData() throws IOException {
		
		 fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("validcontact");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		String ContactUSpage[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				 DataFormatter formatter=new DataFormatter();
				ContactUSpage[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
				System.out.println(ContactUSpage[i-1][j]);
			}
		}
		
		return ContactUSpage;
	}
	
	@DataProvider
	public String[][] getData2() throws IOException {
		
		 fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Contact");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		String ContactUSpage[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				 DataFormatter formatter=new DataFormatter();
					ContactUSpage[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
					System.out.println(ContactUSpage[i-1][j]);
			}
		}
		return ContactUSpage;
	}
	
	
	@DataProvider
	public String[][] getData3() throws IOException {
		
		fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("FAQPage");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		String FAQPage[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				FAQPage[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return FAQPage;
		
	}
	@DataProvider
	public String[][] getData4() throws IOException {
		
		fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("FAQPage2");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		String FAQPage2[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				FAQPage2[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return FAQPage2;
	}
	
	@DataProvider
	public String[][] getData5() throws IOException {
		
		fs=new FileInputStream(DataPath);
		 wb=new XSSFWorkbook(fs);
		sh=wb.getSheet("Adressbookpage1");
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		String Addressbookpage1[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Addressbookpage1[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		return Addressbookpage1;
	}
	
	@DataProvider
	public String[][] getData6() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("Adressbookpage2");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String Addressbookpage2[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Addressbookpage2[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		return Addressbookpage2;
	}
	
	@DataProvider
	public String[][] getData7() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("shippingadress");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String shippingadress[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				shippingadress[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return shippingadress;
		
	}
	@DataProvider
	public String[][] getData8() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("Trackanorder1");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String Trackanorder1[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Trackanorder1[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return Trackanorder1;
		
	}
	@DataProvider
	public String[][] getData9() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("Trackanorder2");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String Trackanorder2[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Trackanorder2[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return Trackanorder2;
		
	}
	@DataProvider
	public String[][] getData10() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("Trackanorder3");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String Trackanorder3[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Trackanorder3[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return Trackanorder3;
		
	}
	@DataProvider
	public String[][] getData11() throws IOException {
		
		fs=new FileInputStream(DataPath);
	 wb=new XSSFWorkbook(fs);
	sh=wb.getSheet("Footerpage");
	int rows=sh.getLastRowNum();
	int cols=sh.getRow(0).getLastCellNum();
		String Footerpage[][]=new String[rows][cols];
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<cols;j++) {
				DataFormatter formatter=new DataFormatter();
				Footerpage[i-1][j]=formatter.formatCellValue(sh.getRow(i).getCell(j));
			}
		}
		
		return Footerpage;
		
	}
}

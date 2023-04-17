package javaPackage;

import java.util.HashMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelData {

	static Fillo dbFillo;
	static HashMap<String, String> datamap;
	static Connection con;

	// Creating fillo object and establishing connection
	public void getExcelConnection() {

		dbFillo = new Fillo();
		String strexcelpath = ("./src/Resources/Data/ExcelData.xlsx");
		try {
			con = dbFillo.getConnection(strexcelpath);
			System.out.println("Connection");

		} catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Execute query and load into hashmap object for login testcase
	public void queryData(String stable, String stcid) {

		String strQuery = "select * from " + stable + " where TC_ID='" + stcid + "'";
		Recordset rs = null;
		datamap = new HashMap();
		try {
			rs = con.executeQuery(strQuery);

			int count = rs.getFieldNames().size();

			System.out.println("Total columns is " + count);
			while (rs.next()) {
				for (int i = 0; i < count; i++) {

					// System.out.println(rs.getFieldNames().get(i)+" "+rs.getField(i).value());
					datamap.put(rs.getFieldNames().get(i), rs.getField(i).value());

				}
			}
			System.out.println(datamap);
		}

		catch (FilloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//Execute query and load into hashmap object for register testcase 
	/*
	 * public void queryRegister(String scolname) {
	 * 
	 * String strQuery = "select * from Register";
	 * 
	 * Recordset rs = null; datamap = new HashMap(); try { rs =
	 * con.executeQuery(strQuery);
	 * 
	 * int count = rs.getFieldNames().size();
	 * 
	 * System.out.println("Total columns is " + count); while (rs.next()) { for (int
	 * i = 0; i < count; i++) {
	 * 
	 * // System.out.println(rs.getFieldNames().get(i)+" "+rs.getField(j).value());
	 * datamap.put(rs.getFieldNames().get(i), rs.getField(i).value());
	 * 
	 * } } System.out.println(datamap); }
	 * 
	 * catch (FilloException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

}

/*
 * CSVTool is a simple java program used to take a CSV document and append the values
 * to a file in your choice (SQL formatted in this case)
 * TODO
 * check to make sure the previous character is \n BEFORE writing to a file
 * omit any "" marks from the string before writing to file
 * crashes when a value is null
 */
package io.valhala.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	private static final String DELIMITER = ",";
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the full file path: e.g, /home/user/Desktop/file or C:\\Users\\Desktop\\file");
		String inFile, outFile;
		inFile = scan.nextLine();
		System.out.println("Please enter the file to append to");
		outFile = scan.nextLine();
		BufferedReader br = null;
		BufferedWriter bw = null;
		try
		{
			bw = new BufferedWriter(new FileWriter(outFile, true));
			br = new BufferedReader(new FileReader(inFile));
			String line = "";
			while((line = br.readLine()) != null)
			{
				
				String[] clientDetails = line.split(DELIMITER); //we have to detect if a field is empty

				if (clientDetails.length > 0)
				{
					Client temp = new Client();
					temp.setFirstName(clientDetails[0]);
					temp.setLastName(clientDetails[1]);
					temp.setEmail(clientDetails[2]);
					temp.setStreet(clientDetails[3]);
					temp.setCity(clientDetails[4]);
					temp.setZip(clientDetails[5]);
					temp.setState(clientDetails[6]);
					temp.setHomePhone(clientDetails[7]);
					temp.setMobilePhone(clientDetails[8]);
					temp.setNotes(clientDetails[9]);
					bw.write("('" + temp.getFirstName() + "'," + "'" + temp.getLastName() + "'," 
							+ "'" + temp.getEmail() + "'," + "'" + temp.getStreet() + "'," + "'" + temp.getCity() + "',"
							+ "'" + temp.getZip() + "'," + "'" + temp.getState() + "'," + "'" + temp.getHomePhone() + "',"
							+ "'" + temp.getMobilePhone() + "'," + "'" + temp.getNotes() + "'),");
					bw.newLine();
					bw.flush();
				}
			}
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				bw.close();
				br.close();
				scan.close();
			} catch (IOException io)
			{
				io.printStackTrace();
			}
		}
		System.out.println("done");
	}
}

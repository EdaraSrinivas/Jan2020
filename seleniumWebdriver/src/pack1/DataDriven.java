package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		// Validate login Functionality with data driven
		
		File file = new File("E:\\SampleData.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String read = br.readLine();
		
		while(read!=null) {
			
			String data[] = read.split(",");
			System.out.println(data[0]);
			System.out.println(data[1]);
			
			// Writting
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("info");
			bw.close(); // Saving the file with changes
			read = br.readLine();
		}
		br.close();
		
	}
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleWriter {
	
		
		private static SimpleWriter sw;
		private String filename;
		private static File file;
		FileWriter out;  
		/*
		 * File writer using a Simpleton pattern, creates a file using a date class and writes to that file using the write method
		 * Chose a simpleton pattern for the file writer to avoid the chance of having multiples instances of this class while logging the transactions
		 * 
		 * */
		private SimpleWriter() throws IOException {
			
			//Get the current date and time
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			filename = dateFormat.format(cal.getTime());
			//Pass the filename to the file
			file = new File(filename+".txt");			
			out = new FileWriter(file, true);
		
		}

		//Static getter to instantiate the simple writer outside this class
		public static SimpleWriter getInstance() throws IOException{
			
			//lazy implementation
			if	(sw == null){
		
				sw = new SimpleWriter();
			}
						
			return sw;
		}
		public void closer() {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		//Method to write to file using FileWriter
		public void write(String message){			
		
			try{				
				out.write(message);
				System.out.println(message);
				}
			
			catch(IOException e){				
				System.err.println("ERROR: Could not write to log file");
				}
			}}
		 
package net.tutorit.reporting;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileReporter extends ReporterBase {
	private String filename;
	
	public FileReporter(String filename) {
		this.filename = filename;
	}
	
	//luodaan tiedosto
	public PrintWriter getWriter() {
		try {
			PrintWriter out = new PrintWriter(new FileWriter(filename));
			return out;
		} catch (IOException e) {
			System.out.println("File " + filename + " could not be opened");
		}
		return null;
	}
	
	//stream flush ja sulkeminen
	public void closeWriter(PrintWriter writer) {
		writer.flush();
		writer.close();
	}
}

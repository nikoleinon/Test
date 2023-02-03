package net.tutorit.reporting;

import java.io.PrintWriter;

public class ScreenReporter extends ReporterBase{ 
	 
	@Override
	protected PrintWriter getWriter(){
		return new PrintWriter(System.out);
	}
	
	@Override
	protected void closeWriter(PrintWriter writer){
		writer.flush();
	}
}
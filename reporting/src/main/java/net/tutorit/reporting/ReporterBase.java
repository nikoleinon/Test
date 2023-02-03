package net.tutorit.reporting;

import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class ReporterBase implements Reporter {
	private ArrayList<ColumnDef> columns = new ArrayList<>();
	private int columnCounter = 0;
	private PrintWriter out = null;

	abstract PrintWriter getWriter();
	abstract void closeWriter(PrintWriter writer);
	
	public void beginReport() {
		out = getWriter();
		printColumns();
	}
	
	public void endReport() {
		closeWriter(out);
		columns.clear();
	}
	
	public void printData(String data) {
		// ColumnDef cd = columns.get(columnCounter);
	    out.print(format(data,columns.get(columnCounter).getWidth()));
	    columnCounter ++;
	    if (columnCounter >= columns.size()){
	        columnCounter = 0;
	        out.println();
	    }
	}
	
	public void printColumns() {
		for (ColumnDef column : columns) {
		out.print(format(column.getTitle(), column.getWidth()));
		}
		out.println();
	}

	public String format(String title, int width) {
		String format = "%-" + width + "s";
		String result = String.format(format, title).substring(0,width);
		return result;
	}
	
	public void addColumn(String title, int width) {
		columns.add(new ColumnDef(title, width));
	}
	
	public void printData(int i) {
		printData("" + i);
	}
}

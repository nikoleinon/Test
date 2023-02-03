package net.tutorit.reporting;

public interface Reporter {
	
	public void beginReport();
	public void endReport();
	
//	public void printColumns();
	
	public void addColumn(String title, int width);
	public void printData(String data);
	public void printData(int data);
}
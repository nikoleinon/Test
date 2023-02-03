package net.tutorit.reporting;

public class ColumnDef {
	private String title;
	private int width;
	
	public ColumnDef(String title, int width) {
		this.title = title;
		this.width = width;
	}

	public String getTitle() {
		return title;
	}

	public int getWidth() {
		return width;
	} 
}
package net.tutorit.reporting;

import java.util.ArrayList;

//siirretty toiminnallisuuksia CompanyReport ja PersonReport -luokista
public abstract class ReportBase<T> {
	private ArrayList<T> items=new ArrayList<>();
	private Reporter reporter;
	
	public ReportBase(Reporter rep) {
		reporter = rep;
		addColumns(reporter);
	}
	
    public void addData(T item){
        items.add(item);
    }
    
    abstract protected void printData(Reporter reporter,T item);
    abstract protected void addColumns(Reporter reporter);
    
    public void doReport(){
    	reporter.beginReport();
        //reporter.printColumns();
        for(T item:items){
        	printData(reporter,item);
        }
        reporter.endReport();
    }
}
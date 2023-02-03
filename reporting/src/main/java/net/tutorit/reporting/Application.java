package net.tutorit.reporting;

public class Application {

	public static void main(String[] args) {
		
		
//		ScreenReporter rep = new ScreenReporter();
//		rep.addColumn("Name",20);
//		rep.addColumn("Age",5);
//		rep.printColumns();
//		rep.printData("John Wayne");
//		rep.printData(82);
//		rep.printData("Ronald Reagan");
//		rep.printData(93);
		
		
		
//	    PersonReport pr = new PersonReport();
//        pr.addData(new Person("John Wayne",81));
//        pr.addData(new Person("Ronald Reagan",92));
//        pr.doReport();
//        
//        System.out.println();
//      
//        CompanyReport cr = new CompanyReport();
//        cr.addData(new Company("Coders Unlimited","555-234234","info@coders.net"));
//        cr.addData(new Company("Testers united","555-123123","info@testers.com"));
//        cr.doReport();
        
        
		
//        FileReporter fr = new FileReporter("testfile.txt");
//        fr.beginReport();
//        fr.addColumn("Name", 20);
//        fr.addColumn("Age", 20);
//        fr.printColumns();
//        fr.printData("John Wayne");
//        fr.printData(100);
//        fr.printData("Chuck Norris");
//        fr.printData(60);
//        fr.endReport();
		
		 ScreenReporter reportScreen = new ScreenReporter();
		 FileReporter reportFile = new FileReporter("report.txt");
		 
		 PersonReport pr = new PersonReport(reportScreen);
		 pr.addData(new Person("John Wayne",82));
		 pr.addData(new Person("Ronald Reagan",92));
		 pr.doReport();
		 
		 CompanyReport cr = new CompanyReport(reportFile);
		 cr.addData(new Company("Coders Unlimited","555-234234","info@coders.net"));
		 cr.addData(new Company("Testers united","555-123123","info@testers.com"));
		 cr.doReport();

        
	}
}
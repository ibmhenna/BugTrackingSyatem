
public class Tester {
	
	private static BUGSTATUS status = BUGSTATUS.NEW;
	private static int count = 0;
	private static int count2 = 0;

	public void testing() {
		Manager manager = new Manager();
		manager.assignBug();
		//run code and find bug
		if(count==0) {
			count++;
			System.out.println(count);
			addNewBug();
		}
		else {
			status = BUGSTATUS.REOPEN;
			System.out.println(status);
			count2++;
			while (count2<2) {
				Developer.bugAnalyzing(7365, "Abug");
				
			}
		}
	}
	
	public void retest(int id, String name, int counter) {
		// TODO Auto-generated method stub
		
	}


}

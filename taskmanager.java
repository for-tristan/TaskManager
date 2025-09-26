package tsgmngr;

import java.util.ArrayList;

public class taskmanager {

	private ArrayList<Task> tasks = new ArrayList<>();
	
	public void taskadding(Task task) {
		tasks.add(task);
	}
	
	public void tasklisting() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks at the moment");
			return;
			
		}
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i+1) + ". " + tasks.get(i).toString());
		}
	}
	public void setcompleted(int index) {	
		
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).setcompleted();
		} else {
			System.out.println("Invalid task");
		}
		
	}
}

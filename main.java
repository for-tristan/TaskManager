package tsgmngr;

import java.util.Scanner;

public class main {
	
	
	public static void main(String[] args) {
		
    taskmanager manager = new taskmanager();		
		Scanner scanner = new Scanner(System.in);
		while (true) {
		       	System.out.println("\n1. add task");
		            	System.out.println("2. list tasks");
		                	System.out.println("3. mark task as completed");
			                   System.out.println("4. exit");
		          	System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (choice) {
			case 1 -> {
				  System.out.print("Enter task name: ");
			     	String title = scanner.nextLine();
				  Task task = new Task(title);
				     manager.taskadding(task);
			}
			case 2 -> manager.tasklisting();
		           	case 3 -> {
		            		System.out.print("Enter task number to mark as completed: ");
				int taskNumber = scanner.nextInt();
				manager.setcompleted(taskNumber - 1);}
				
				case 4 -> {
			     		System.out.println("Exiting...");
			         		scanner.close();
			    		System.exit(0);
				}
                default -> System.out.println("Wrong option");

			
			
			}
		}
	}
}


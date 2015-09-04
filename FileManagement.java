import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileManagement {

	SimpleDateFormat dateFormat = new SimpleDateFormat("\nMMM dd, yyyy\nhh:mm");

	// ------------------------------Employee Screen---------------------------

	void Employee() throws IOException {

		FileManagement obj1 = new FileManagement();

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to the Employee Page");

		Date obj2 = new Date();

		System.out.println(dateFormat.format(obj2));

		System.out
				.println("Please enter option number to access the following files :");

		System.out.println("Press 1 to enter Tasks File");

		System.out.println("Press 2 to enter Knowledge Management File");

		System.out.println("Press 3 to Log Out");

		String input = in.nextLine();

		// ------------------Option-------------------

		if (input.equals("1")) {

			FileInputStream readInput = new FileInputStream("Tasks");

			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Tasks");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			}

			// ------------------Option-------------------

		} else if (input.equals("2")) {

			FileInputStream readInput = new FileInputStream(
					"Knowledge_Management");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Knowledge_Management");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Employee();

			}

			// ------------------Option-------------------

		} else if (input.equals("3")) {

			try {
				obj1.FileMan();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("Please enter a valid option");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			obj1.Employee();

		}

	}

	// ------------------------------Manager Screen---------------------------

	void Manage() throws IOException {

		FileManagement obj1 = new FileManagement();

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to the Manager Page");

		Date obj2 = new Date();

		System.out.println(dateFormat.format(obj2));

		System.out
				.println("Please enter option number to access the following files :");

		System.out.println("Press 1 to enter Performance Report File");

		System.out.println("Press 2 to enter Attendance Report File");

		System.out.println("Press 3 to enter Personal Details File");

		System.out.println("Press 4 to enter Project Details File");

		System.out.println("Press 5 to enter Tasks File");

		System.out.println("Press 6 to enter Knowledge Management File");

		System.out.println("Press 7 to Log Out");
		String input = in.nextLine();

		// ------------------Option-------------------

		if (input.equals("1")) {

			FileInputStream readInput = new FileInputStream(
					"Performance_Report");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Performance_Report");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			}

			// ------------------Option-------------------

		} else if (input.equals("2")) {

			FileInputStream readInput = new FileInputStream("Attendance_Report");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Attendance_Report");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			}

			// ------------------Option-------------------

		} else if (input.equals("3")) {

			FileInputStream readInput = new FileInputStream("Personal_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Personal_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			}

			// ------------------Option-------------------

		} else if (input.equals("4")) {

			FileInputStream readInput = new FileInputStream("Project_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Project_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			}

			// ------------------Option-------------------

		} else if (input.equals("5")) {

			FileInputStream readInput = new FileInputStream("Tasks");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task at line 5 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Tasks");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Manage();

			}

			// ------------------Option-------------------

		} else if (input.equals("6")) {

			FileInputStream readInput = new FileInputStream(
					"Knowledge_Management");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.exit(0);

			// ------------------Option-------------------

		} else if (input.equals("7")) {

			try {
				obj1.FileMan();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("Please enter a valid option");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			obj1.Manage();

		}

	}

	// ------------------------------Human Resources
	// Screen---------------------------

	void HR() throws IOException {

		FileManagement obj1 = new FileManagement();

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to the Human Resource Page");

		Date obj2 = new Date();

		System.out.println(dateFormat.format(obj2));

		System.out
				.println("Please enter option number to access the following files :");

		System.out.println("Press 1 to enter Performance Report File");

		System.out.println("Press 2 to enter Leave Details File");

		System.out.println("Press 3 to enter Personal Details File");

		System.out.println("Press 4 to enter Project Details File");

		System.out.println("Press 5 to enter Billing Details File");

		System.out.println("Press 6 to enter Knowledge Management File");

		System.out.println("Press 7 to enter Policies File");

		System.out.println("Press 8 to Log Out");
		String input = in.nextLine();

		// ------------------Option-------------------

		if (input.equals("1")) {

			FileInputStream readInput = new FileInputStream(
					"Performance_Report");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Performance_Report");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("2")) {

			FileInputStream readInput = new FileInputStream("Leave_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Leave_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("3")) {

			FileInputStream readInput = new FileInputStream("Personal_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Personal_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("4")) {

			FileInputStream readInput = new FileInputStream("Project_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Project_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("5")) {

			FileInputStream readInput = new FileInputStream("Billing_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Billing_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("6")) {

			FileInputStream readInput = new FileInputStream(
					"Knowledge_Management");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Knowledge_Management");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("7")) {

			FileInputStream readInput = new FileInputStream("Policies");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 4 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Policies");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 4; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.HR();

			}

			// ------------------Option-------------------

		} else if (input.equals("8")) {

			try {
				obj1.FileMan();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("Please enter a valid option");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			obj1.HR();

		}

	}

	// ------------------------------Financial
	// Department---------------------------

	void Financial() throws IOException {

		FileManagement obj1 = new FileManagement();

		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to the Financial Employee Page");

		Date obj2 = new Date();

		System.out.println(dateFormat.format(obj2));

		System.out
				.println("Please enter option number to access the following files :");

		System.out.println("Press 1 to enter Leave Details File");

		System.out.println("Press 2 to enter Billing Details File");

		System.out.println("Press 3 to Log Out");
		String input = in.nextLine();

		// ------------------Option-------------------

		if (input.equals("1")) {

			FileInputStream readInput = new FileInputStream("Leave_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 3 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Leave_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 3; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			}

			// ------------------Option-------------------

		} else if (input.equals("2")) {

			FileInputStream readInput = new FileInputStream("Billing_Details");
			int read;

			while ((read = readInput.read()) != -1) {

				System.out.print((char) read);

			}

			readInput.close();

			System.out.println(dateFormat.format(obj2));

			System.out.println("\nEnter 1 to add task at the end of the file");

			System.out.println("Enter 2 to add task after line 3 of the file");

			System.out
					.println("Enter 3 to exit back to the previous dashboard");

			Scanner inp1 = new Scanner(System.in);

			String addTask = inp1.nextLine();

			File task = new File("Billing_Details");

			FileWriter inputTask = new FileWriter(task, true);

			if (addTask.equals("1")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				inputTask.write("\n" + inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			} else if (addTask.equals("2")) {

				System.out.println("Please enter in the new task: ");

				Scanner inp = new Scanner(System.in);

				String inp2 = inp.nextLine();

				for (int j = 0; j < 3; j++) {

					inputTask.write("\n");

				}

				inputTask.write(inp2);

				inputTask.flush();

				System.out.println("Task has been entered, Goodbye!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			} else {

				System.out.println("Please enter a valid option");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				obj1.Financial();

			}

			// ------------------Option-------------------

		} else if (input.equals("3")) {

			try {
				obj1.FileMan();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {

			System.out.println("Please enter a valid option");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			obj1.Financial();

		}

	}

	// ------------------------------File Management---------------------------

	void FileMan() throws IOException, InterruptedException {

		FileManagement obj1 = new FileManagement();

		System.out.println("Welcome to the File Management System");

		Date obj2 = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"MMM dd, yyyy\nhh:mm");

		System.out.println(dateFormat.format(obj2));

		int i = 0;
		int count = 3;
		while (i < 3) {

			Scanner in = new Scanner(System.in);

			System.out.println("Please enter your username: ");

			System.out.println("Please enter your password: ");

			System.out.println("Enter 9 to exit");

			if (count == 2 || count == 1) {

				System.out.println("Attempts left:" + count);

			}

			String userName = in.nextLine();

			if (userName.equals("9")) {

				System.out.println("Goodbye!");

				System.exit(0);

			}
			String passWord = in.nextLine();

			if (userName.equals("E1000") && passWord.equals("E1000")) {

				obj1.Employee();

			} else if (userName.equals("M2000") && passWord.equals("M2000")) {

				obj1.Manage();

			} else if (userName.equals("HR3000") && passWord.equals("HR3000")) {

				obj1.HR();

			} else if (userName.equals("FR4000") && passWord.equals("FR4000")) {

				obj1.Financial();

			} else {

				System.out.println("Please try again");

				Thread.sleep(1000);

				count--;

				i++;

			}

		}

		System.out.println("Please wait 5 minutes and try again");

		Thread.sleep(300000);

		obj1.FileMan();

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileManagement obj1 = new FileManagement();

		try {
			obj1.FileMan();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
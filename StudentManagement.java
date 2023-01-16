import java.util.*;
class StudentManagement{
	public static String[] StudentID=new String[0];
	public static String[] Studentnames=new String[0];
	public static int[] PFmarks=new int[0];
	public static int[] DMSmarks=new int[0];
	public static int[] Totalarray=new int[0];
	public static double[] Avaragearray=new double[0];
	public static int[] valuecollector=new int[1];
	
	public static void TempID(){
	String[] Temp=new String[StudentID.length+1];
		for(int i=0;i<StudentID.length;i++){
			Temp[i]=StudentID[i];
		}
		StudentID=Temp;
	}
	
	public static void Tempnames(){
	String[] Temp=new String[Studentnames.length+1];
		for(int i=0;i<Studentnames.length;i++){
			Temp[i]=Studentnames[i];
		}
		Studentnames=Temp;
	}
	
	public static void TempPFmarks(){
	int[] Temp=new int[PFmarks.length+1];
		for(int i=0;i<PFmarks.length;i++){
			Temp[i]=PFmarks[i];
		}
		PFmarks=Temp;
	}
	
	public static void TempDMSmarks(){
	int[] Temp=new int[DMSmarks.length+1];
		for(int i=0;i<DMSmarks.length;i++){
			Temp[i]=DMSmarks[i];
		}
		DMSmarks=Temp;
	}
	
	
	public static void main(String args[]){
		titlepage();
	}
	public static void titlepage(){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t\t\t|\n");
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		System.out.print("[1] Add New Student\t\t\t[2] Add New Students with Marks\n");
		System.out.print("[3] Add Marks\t\t\t\t[4] Update Student Details\n");
		System.out.print("[5] Update Marks\t\t\t[6] Delete Student\n");
		System.out.print("[7] Print Student Details\t\t[8] Print Student Ranks\n");
		System.out.println("[9] Best in Programming Fundamentals\t[10] Best in Database Management System\n");
		int N;
		do{
		System.out.print("Enter an Option to Continue >");
		N=input.nextInt();
		
		switch(N){
			case 1:clearConsole();Addnewstudent();break;
			case 2:clearConsole();Addnewstudentwithmarks();break;
			case 3:clearConsole();Addmarks();break;
			case 4:clearConsole();Updatestudentdetails();break;
			case 5:clearConsole();Updatemarks();break;
			case 6:clearConsole();Deletestudent();break;
			case 7:clearConsole();Printstudentdetails();break;
			case 8:clearConsole();Printstudentranks();break;
			case 9:clearConsole();BestinPF();break;
			case 10:clearConsole();BestinDMS();break;
			default:System.out.println("Wrong input try again");
		}
		}while(N!=1&N!=2&N!=3&N!=4&N!=5&N!=6&N!=7&N!=8&N!=9&N!=10);
	}
	
	public final static void clearConsole(){
			try {
				final String os = System.getProperty("os.name");
				if (os.contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				}
				else {
					System.out.print("\033[H\033[2J");
					System.out.flush();
				}
			}
			catch (final Exception e) {
					e.printStackTrace();// Handle any exceptions.
			}
		}

	public static void Addnewstudent(){	
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tADD NEW STUDENT\t\t\t\t\t|\n");
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Addnewstudentsubmethod();
	}

	public static void Addnewstudentsubmethod(){
	Scanner input=new Scanner(System.in);
	int i=valuecollector[0];
	
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		for(int k=0;k<i;k++){		
			if(StudentID[k].equalsIgnoreCase(a)){
				System.out.println("The Student ID already exists");
				Addnewstudentsubmethod();
			}
		}
		TempID();
		Tempnames();
		TempPFmarks();
		TempDMSmarks();
		Temptotal();
		Tempavarage();
		StudentID[i]=a;
		System.out.print("Enter Student Name: ");
		Studentnames[i]=input.nextLine();
		System.out.print("Student has been added successfully.");
		char op;
		do{
			System.out.print("Do you want to add a new student (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);	
			switch(op){
				case 'Y':{
					valuecollector[0]=++i;
					clearConsole();
					Addnewstudent();
				}
				case 'y':{
					valuecollector[0]=++i;
					clearConsole();
					Addnewstudent();;
				}
				case 'n':{
					valuecollector[0]=++i;
					clearConsole();
					titlepage();		
				}
				case 'N':{
					valuecollector[0]=++i;
					clearConsole();
					titlepage();
				}
				default:System.out.println("Wrong input.please try again");
				continue;
			}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');
}

	public static void Addnewstudentwithmarks(){
		for(int i=0;i<105;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tADD NEW STUDENT WITH MARKS\t\t\t\t\t|\n");
		for(int i=0;i<105;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Addnewstudentwithmarkssubmethod();

	}
	
	
	public static void Addnewstudentwithmarkssubmethod(){
		Scanner input=new Scanner(System.in);
	int i=valuecollector[0];
	
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		for(int k=0;k<i;k++){		
			if(StudentID[k].equalsIgnoreCase(a)){
				System.out.println("The Student ID already exists");
				Addnewstudentwithmarkssubmethod();
			}
		}
		
		TempID();
		Tempnames();
		TempPFmarks();
		TempDMSmarks();
		Temptotal();
		Tempavarage();
		StudentID[i]=a;		
		System.out.print("Enter Student Name: ");
		Studentnames[i]=input.nextLine();
		System.out.print("\n");
		markssubmethod(i);
		System.out.print("Student has been added successfully.");
		loop(i);

}

	public static void loop(int i){
		char op;
		do{
		Scanner input=new Scanner(System.in);
		System.out.print("Do you want to add a new student (Y/n): ");
		
			String c=input.nextLine();
			op=c.charAt(0);	
			switch(op){
				case 'Y':{
					valuecollector[0]=++i;
					clearConsole();
					Addnewstudentwithmarks();
				}
				case 'y':{
					valuecollector[0]=++i;
					clearConsole();
					Addnewstudentwithmarks();
				}
				case 'n':{
					valuecollector[0]=++i;
					clearConsole();
					titlepage();		
				}
				case 'N':{
					valuecollector[0]=++i;
					clearConsole();
					titlepage();
				}
				default:System.out.println("Wrong input.please try again");
				continue;
			}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');
	}
	
	
	public static void markssubmethod(int j){
		Scanner input=new Scanner(System.in);
		do{
		System.out.print("Programming Fundamentals Marks: ");
		PFmarks[j]=input.nextInt();
		if(PFmarks[j]<0||PFmarks[j]>100){
			System.out.println("invalid marks. please enter correct marks.");
		}
	}while(PFmarks[j]<0||PFmarks[j]>100);
		do{
			System.out.print("Database Management System Marks: ");
			DMSmarks[j]=input.nextInt();
			if(DMSmarks[j]<0||DMSmarks[j]>100){
				System.out.println("invalid marks. please enter correct marks.");
			}
		}while(DMSmarks[j]<0||DMSmarks[j]>100);
		System.out.print("\n");
	}
	
	
	public static void Addmarks(){
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tADD MARKS\t\t\t\t\t|\n");
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Addmarkssubmethod_1();
	}
	
	public static void Addmarkssubmethod_1(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		int i;
		for(i=0;i<StudentID.length;i++){
			if(StudentID[i].equalsIgnoreCase(a)){
				Addmarkssubmethod_2(i);
			}
		}
		Addmarkssubmethod_3();
	}
		
	public static void Addmarkssubmethod_2(int i){
		Scanner input=new Scanner(System.in);
		System.out.println("Student Name: "+Studentnames[i]+"\n");
		if(PFmarks[i]!=0){
			System.out.println("This Student's marks have been already added.\nIf you want to update the marks, please use [4] Update marks option\n");
			loopmethod();
		}
		else{
			markssubmethod(i);
			System.out.print("Marks have been added.");		
			loopmethod();	
		}
	}	
	public static void Addmarkssubmethod_3(){
		System.out.print("Invalid Student ID.");
		loopmethodnew();
	}
	
	public static void loopmethod(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to add marks for another student? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Addmarks();
				break;
			}
			case 'y':{
				clearConsole();
				Addmarks();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}			
	
	public static void loopmethodnew(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to serach again? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Addmarks();
				break;
			}
			case 'y':{
				clearConsole();
				Addmarks();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void Updatestudentdetails(){
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tUPDATE STUDENTS DETAILS\t\t\t\t\t|\n");
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Updatestudentdetailssubmethod_1();
	}		
	
	public static void Updatestudentdetailssubmethod_1(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		int i;
		for(i=0;i<StudentID.length;i++){
			if(StudentID[i].equalsIgnoreCase(a)){
				Updatestudentdetailssubmethod_2(i);
			}
		}
		Updatestudentdetailssubmethod_3();
	}
	
	public static void Updatestudentdetailssubmethod_2(int i){
		Scanner input=new Scanner(System.in);
		System.out.println("Student Name: "+Studentnames[i]+"\n");
		System.out.print("Enter the new student name: ");	
		Studentnames[i]=input.nextLine();
		System.out.println("Student details has been added successfully.");
		loopmethodupdatedetailsnew();
	}	
				

	public static void Updatestudentdetailssubmethod_3(){
		System.out.print("Invalid Student ID.");
		loopmethodupdatedetails();
	}			
	
	public static void loopmethodupdatedetails(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to serach again? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Updatestudentdetails();
				break;
			}
			case 'y':{
				clearConsole();
				Updatestudentdetails();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void loopmethodupdatedetailsnew(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to update another student details? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Updatestudentdetails();
				break;
			}
			case 'y':{
				clearConsole();
				Updatestudentdetails();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void Updatemarks(){
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tUPDATE MARKS\t\t\t\t\t|\n");
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Updatemarkssubmethod_1();
	}				
	
	
	public static void Updatemarkssubmethod_1(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		int i;
		for(i=0;i<StudentID.length;i++){
			if(StudentID[i].equalsIgnoreCase(a)){
				Updatemarkssubmethod_2(i);
			}
		}
		Updatemarkssubmethod_3();
	}
	
	public static void Updatemarkssubmethod_2(int i){
		Scanner input=new Scanner(System.in);
		System.out.println("Student Name: "+Studentnames[i]+"\n");
		System.out.println("Programming Fundementals marks: "+PFmarks[i]);
		System.out.println("Database Management System marks: "+DMSmarks[i]+"\n\n");
		do{
		System.out.print("Enter new programming fundementals marks: ");
		PFmarks[i]=input.nextInt();
		if(PFmarks[i]<0||PFmarks[i]>100){
			System.out.println("invalid marks. please enter correct marks.");
		}
	}while(PFmarks[i]<0||PFmarks[i]>100);
		do{
			System.out.print("Enter new database management system marks: ");	
			DMSmarks[i]=input.nextInt();
			if(DMSmarks[i]<0||DMSmarks[i]>100){
				System.out.println("invalid marks. please enter correct marks.");
			}
		}while(DMSmarks[i]<0||DMSmarks[i]>100);
		System.out.print("\n");
		System.out.println("Marks have been updated successfully.");
		loopmethodupdatedemarksnew();
	}	
				

	public static void Updatemarkssubmethod_3(){
		System.out.print("Invalid Student ID.");
		loopmethodupdatemarks();
	}			
	
	public static void loopmethodupdatemarks(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to serach again? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Updatemarks();
				break;
			}
			case 'y':{
				clearConsole();
				Updatemarks();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void loopmethodupdatedemarksnew(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to update marks for another student ? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Updatemarks();
				break;
			}
			case 'y':{
				clearConsole();
				Updatemarks();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void Deletestudent(){
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tDELETE STUDENT\t\t\t\t\t|\n");
		for(int i=0;i<89;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Deletestudentsubmethod_1();
	}
	
	public static void Deletestudentsubmethod_1(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		int i;
		for(i=0;i<StudentID.length;i++){
			if(StudentID[i].equalsIgnoreCase(a)){
				Deletestudentsubmethod_2(i);
			}
		}
		Deletestudentsubmethod_3();
	}
	
	public static void Deletestudentsubmethod_3(){
		System.out.print("Invalid Student ID.");
		loopmethodDeletestudent();
	}			
	
	public static void loopmethodDeletestudent(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to serach again? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Deletestudent();
				break;
			}
			case 'y':{
				clearConsole();
				Deletestudent();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void Deletestudentsubmethod_2(int index){
		String[] tempid=new String[StudentID.length-1];
		for(int i=0;i<index;i++){
			tempid[i]=StudentID[i];
		}
		for(int i=index;i<tempid.length;i++){
			tempid[i]=StudentID[i+1];
		}
		StudentID=tempid;
		
		
		String[] tempnames=new String[Studentnames.length-1];
		for(int i=0;i<index;i++){
			tempnames[i]=Studentnames[i];
		}
		for(int i=index;i<tempnames.length;i++){
			tempnames[i]=Studentnames[i+1];
		}
		Studentnames=tempnames;
		
		
		int[] tempPFmarks=new int[PFmarks.length-1];
		for(int i=0;i<index;i++){
			tempPFmarks[i]=PFmarks[i];
		}
		for(int i=index;i<tempPFmarks.length;i++){
			tempPFmarks[i]=PFmarks[i+1];
		}
		PFmarks=tempPFmarks;
		
		
		int[] tempDMSmarks=new int[DMSmarks.length-1];
		for(int i=0;i<index;i++){
			tempDMSmarks[i]=DMSmarks[i];
		}
		for(int i=index;i<tempDMSmarks.length;i++){
			tempDMSmarks[i]=DMSmarks[i+1];
		}
		DMSmarks=tempDMSmarks;
		
		int[] tempTotal=new int[Totalarray.length-1];
		for(int i=0;i<index;i++){
			tempTotal[i]=Totalarray[i];
		}
		for(int i=index;i<tempTotal.length;i++){
			tempTotal[i]=Totalarray[i+1];
		}
		Totalarray=tempTotal;
		
		double[] tempAvg=new double[Avaragearray.length-1];
		for(int i=0;i<index;i++){
			tempAvg[i]=Avaragearray[i];
		}
		for(int i=index;i<tempAvg.length;i++){
			tempAvg[i]=Avaragearray[i+1];
		}
		Avaragearray=tempAvg;
		
		System.out.println("Student has been deleted successfully.\n");
		
		valuecollector[0]--;
		
		loopmethodDeletestudentnew();
	}
	
	public static void loopmethodDeletestudentnew(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to delete another student ? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Deletestudent();
				break;
			}
			case 'y':{
				clearConsole();
				Deletestudent();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	
	public static void Printstudentdetails(){
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tPRINT STUDENT DETAILS\t\t\t\t\t|\n");
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Totalmarks();
		Avaragemarks();
		sort();
		Printstudentdetailssubmethod_1();
	}
	
	public static void Printstudentdetailssubmethod_1(){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Student ID: ");
		String a=input.nextLine();
		int i;
		for(i=0;i<StudentID.length;i++){
			if(StudentID[i].equalsIgnoreCase(a)){
				Printstudentdetailssubmethod_2(i);
			}
		}
		Printstudentdetailssubmethod_3();
	}
	
	public static void Printstudentdetailssubmethod_2(int i){
		Scanner input=new Scanner(System.in);
		System.out.println("Student Name: "+Studentnames[i]+"\n");
		if(PFmarks[i]!=0){
			Printstudentdetailstable(i);		
			loopmethodPrintstudentdetailsnew();
		}
		else{
			System.out.println("Marks not have been added for this student.Please go to 3[]Add Marks and try again.\n");	
			loopmethodPrintstudentdetails();
		}
	}
		
	
	public static void Printstudentdetailstable(int i){
		System.out.println("+---------------------------------+---------------+");
		System.out.print("|Programming Fundementals Marks   |");
		System.out.printf("%15d",PFmarks[i]);
		System.out.println("|");
		System.out.print("|Database Management System Marks |");
		System.out.printf("%15d",DMSmarks[i]);
		System.out.println("|");
		System.out.print("|Total Marks                      |");
		System.out.printf("%15d",Totalarray[i]);
		System.out.println("|");
		System.out.print("|Avarage Marks                    |");
		System.out.printf("%15f",Avaragearray[i]);
		System.out.println("|");
		System.out.print("|Rank                             |");
		rankplace(i);
		System.out.println("|");
		System.out.println("+---------------------------------+---------------+");
		loopmethodPrintstudentdetailsnew();
	}	
	
	
	public static void rankplace(int i){
		if(i==Totalarray.length-1){
			System.out.printf("%7d%8s",rank(i),"(First)");
		}
		else if(i==Totalarray.length-2){
			System.out.printf("%6d%9s",rank(i),"(Second)");
		}
		else if(i==Totalarray.length-3){
			System.out.printf("%7d%8s",rank(i),"(Third)");
		}
		else if(i==0){
			System.out.printf("%8d%7s",rank(i),"(Last)");
		}
		else{
			System.out.printf("%15d",rank(i));
		}
	}
			
	
	
	
	public static void Printstudentdetailssubmethod_3(){
		System.out.print("Invalid Student ID.");
		loopmethodPrintstudentdetails();
	}			
	
	public static void loopmethodPrintstudentdetails(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to serach again? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Printstudentdetails();
				break;
			}
			case 'y':{
				clearConsole();
				Printstudentdetails();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void loopmethodPrintstudentdetailsnew(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to search another student details? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				Printstudentdetails();
				break;
			}
			case 'y':{
				clearConsole();
				Printstudentdetails();
				break;
			}
			case 'N':{
				clearConsole();
				titlepage();
			}
			case 'n':{
				clearConsole();
				titlepage();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}

	
	
	
	public static void Printstudentranks(){
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tPRINT STUDENT RANKS\t\t\t\t\t|\n");
		for(int i=0;i<97;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		Totalmarks();
		Avaragemarks();
		sort();	
		Printstudentrankssubmethod();
	}
	
	public static void Printstudentrankssubmethod(){
		System.out.print("+-----+-----+-----------------+-----------+-------------+\n");
		System.out.print("|Rank |ID   |NAME             |Total Marks|Avarage Marks|\n");
		System.out.print("+-----+-----+-----------------+-----------+-------------+\n");
		for(int i=StudentID.length-1;i>=0;i--){
			if(Totalarray[i]==0){
				continue;
			}
			else{
				System.out.print("|");
				System.out.printf("%-5d",rank(i));
				System.out.print("|");
				System.out.printf("%-5s",StudentID[i]);
				System.out.print("|");
				System.out.printf("%-17s",Studentnames[i]);
				System.out.print("|");
				System.out.printf("%11d",Totalarray[i]);
				System.out.print("|");
				System.out.printf("%13s",Avaragearray[i]);
				System.out.print("|\n");
			}
		}
		System.out.print("+-----+-----+-----------------+-----------+-------------+\n\n");
		loopmethodPrintstudentranks();
	}
	
	
	public static int rank(int i){
		if(Totalarray[i]==Totalarray[Totalarray.length-1]){
			return 1;
		}
		else if(Totalarray[i]==Totalarray[i+1]){
			return Totalarray.length-(i+1);
		}
		else{
			return Totalarray.length-i;
		}
	}

	
	public static void loopmethodPrintstudentranks(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to go back to main menu? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'N':{
				clearConsole();
				Printstudentranks();
			}
			case 'n':{
				clearConsole();
				Printstudentranks();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	
	
	public static void Temptotal(){
	int[] Temp=new int[Totalarray.length+1];
		for(int i=0;i<Totalarray.length;i++){
			Temp[i]=Totalarray[i];
		}
		Totalarray=Temp;
	}
	
	public static void Tempavarage(){
	double[] Temp=new double[Avaragearray.length+1];
		for(int i=0;i<Avaragearray.length;i++){
			Temp[i]=Avaragearray[i];
		}
		Avaragearray=Temp;
	}
	
	
	
	
	
	
	public static void Totalmarks(){
		for(int i=0;i<PFmarks.length;i++){
			int total=PFmarks[i]+DMSmarks[i];
			Totalarray[i]=total;
		}
	}
		
	public static void Avaragemarks(){
		for(int i=0;i<StudentID.length;i++){
			double avarage=Totalarray[i]/2;
			Avaragearray[i]=avarage;	
		}
	}
	
	
	public static void sort(){
		for(int j=0;j<Totalarray.length-1;j++){
			int max=Totalarray[0];
			String a=StudentID[0];
			String b=Studentnames[0];
			int c=PFmarks[0];
			int d=DMSmarks[0];
			double e=Avaragearray[0];
			int index=0;
			for(int i=0;i<Totalarray.length-j;i++){
				if(Totalarray[i]>max){
					max=Totalarray[i];
					a=StudentID[i];
					b=Studentnames[i];
					c=PFmarks[i];
					d=DMSmarks[i];
					e=Avaragearray[i];
					index=i;
				}
			}
			StudentID[index]=StudentID[StudentID.length-(1+j)];
			Studentnames[index]=Studentnames[Studentnames.length-(1+j)];
			PFmarks[index]=PFmarks[PFmarks.length-(1+j)];
			DMSmarks[index]=DMSmarks[DMSmarks.length-(1+j)];
			Totalarray[index]=Totalarray[Totalarray.length-(1+j)];
			Avaragearray[index]=Avaragearray[Avaragearray.length-(1+j)];
			
			StudentID[StudentID.length-(1+j)]=a;
			Studentnames[Studentnames.length-(1+j)]=b;
			PFmarks[PFmarks.length-(1+j)]=c;
			DMSmarks[DMSmarks.length-(1+j)]=d;
			Avaragearray[Avaragearray.length-(1+j)]=e;
			Totalarray[Totalarray.length-(1+j)]=max;
		}
	}
		
	
    public static void BestinPF(){
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t\t\t|\n");
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		sortPF();
		BestinPFsubmethod();
	}
	
	public static void BestinPFsubmethod(){
		System.out.print("+-----+-----------------+-----------+-------------+\n");
		System.out.print("|ID   |NAME             |PF Marks   |DMS Marks    |\n");
		System.out.print("+-----+-----------------+-----------+-------------+\n");
		for(int i=PFmarks.length-1;i>=0;i--){
			if(PFmarks[i]==0){
				continue;
			}
			else{
				System.out.print("|");
				System.out.printf("%-5s",StudentID[i]);
				System.out.print("|");
				System.out.printf("%-17s",Studentnames[i]);
				System.out.print("|");
				System.out.printf("%11d",PFmarks[i]);
				System.out.print("|");
				System.out.printf("%13d",DMSmarks[i]);
				System.out.println("|");
			}
		}
		System.out.print("+-----+-----------------+-----------+-------------+\n\n");
		loopmethodBstinPF();	
	}
	
	public static void loopmethodBstinPF(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to go back to main menu? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'N':{
				clearConsole();
				BestinPF();
			}
			case 'n':{
				clearConsole();
				BestinPF();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void sortPF(){
		for(int j=0;j<PFmarks.length-1;j++){
			String a=StudentID[0];
			String b=Studentnames[0];
			int c=DMSmarks[0];
			int index=0;
			int max=PFmarks[0];
			for(int i=0;i<PFmarks.length-j;i++){
				if(PFmarks[i]>max){
					max=PFmarks[i];
					a=StudentID[i];
					b=Studentnames[i];
					c=DMSmarks[i];
					index=i;
				}
			}
			StudentID[index]=StudentID[StudentID.length-(1+j)];
			Studentnames[index]=Studentnames[Studentnames.length-(1+j)];
			PFmarks[index]=PFmarks[PFmarks.length-(1+j)];
			DMSmarks[index]=DMSmarks[DMSmarks.length-(1+j)];
			
			StudentID[StudentID.length-(1+j)]=a;
			Studentnames[Studentnames.length-(1+j)]=b;
			PFmarks[PFmarks.length-(1+j)]=max;
			DMSmarks[DMSmarks.length-(1+j)]=c;
		}
	}
	
	
	public static void BestinDMS(){
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n|\t\t\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t\t\t|\n");
		for(int i=0;i<113;i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		sortDMS();
		BestinDMSsubmethod();
	}
	
	
	public static void BestinDMSsubmethod(){
		System.out.print("+-----+-----------------+-----------+-------------+\n");
		System.out.print("|ID   |NAME             |DMS Marks   |PF Marks    |\n");
		System.out.print("+-----+-----------------+-----------+-------------+\n");
		for(int i=DMSmarks.length-1;i>=0;i--){
			if(DMSmarks[i]==0){
				continue;
			}
			else{
				System.out.print("|");
				System.out.printf("%-5s",StudentID[i]);
				System.out.print("|");
				System.out.printf("%-17s",Studentnames[i]);
				System.out.print("|");
				System.out.printf("%11d",DMSmarks[i]);
				System.out.print("|");
				System.out.printf("%13d",PFmarks[i]);
				System.out.println("|");
			}
		}
		System.out.print("+-----+-----------------+-----------+-------------+\n\n");
		loopmethodBstinDMS();	
	}
	
	public static void loopmethodBstinDMS(){
		Scanner input=new Scanner(System.in);
		char op;
		do{
			System.out.print("Do you want to go back to main menu? (Y/n): ");
			String c=input.nextLine();
			op=c.charAt(0);
			switch(op){
			case 'Y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'y':{
				clearConsole();
				titlepage();
				break;
			}
			case 'N':{
				clearConsole();
				BestinDMS();
			}
			case 'n':{
				clearConsole();
				BestinDMS();
			}
			default:System.out.println("Wrong input.please try again");
			continue ;
		}
		}while(op!='Y'&op!='y'&op!='N'&op!='n');	
	}
	
	public static void sortDMS(){
		for(int j=0;j<DMSmarks.length-1;j++){
			String a=StudentID[0];
			String b=Studentnames[0];
			int c=PFmarks[0];
			int index=0;
			int max=DMSmarks[0];
			for(int i=0;i<DMSmarks.length-j;i++){
				if(DMSmarks[i]>max){
					max=DMSmarks[i];
					a=StudentID[i];
					b=Studentnames[i];
					c=PFmarks[i];
					index=i;
				}
			}
			StudentID[index]=StudentID[StudentID.length-(1+j)];
			Studentnames[index]=Studentnames[Studentnames.length-(1+j)];
			PFmarks[index]=PFmarks[PFmarks.length-(1+j)];
			DMSmarks[index]=DMSmarks[DMSmarks.length-(1+j)];
			
			StudentID[StudentID.length-(1+j)]=a;
			Studentnames[Studentnames.length-(1+j)]=b;
			PFmarks[PFmarks.length-(1+j)]=c;
			DMSmarks[DMSmarks.length-(1+j)]=max;
		}
	}
	
	
}
	
	


				




		










	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		



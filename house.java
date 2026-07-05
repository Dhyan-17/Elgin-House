import java.util.*;
class Resident
{
    Scanner sc=house.sc;
    int support,choice_password,choice_help,choice_internet,choice_food,choice_room_ca,choice_cleanliness;
    String chack_Email,password,id,id_chack,valid="Enter valid number";
    double randomNumber=Math.random();
    int random_no=(int)(Math.random()*100)+1;
    String responce="Thank you , Your ticket no. is "+random_no+". Your ticket has been recorded our team will contact you within twenty four hours & solve your problem";
    int nextInt()
    {
        while(true)
        {
            try
            {
                return sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
        }
    }
    void check()
    {
        System.out.println("Enter Your ID (ex: 25ELG+roomId+BedNo)");
        id=sc.nextLine();
        boolean id_valid=false;
        for(int Id1=101;Id1<=120;Id1++)
        {
            for(int bed1=1;bed1<=2;bed1++)
            {
                if (Id1 >= 104) {
                    if (Id1 > Guest.nextRoom2 || (Id1 == Guest.nextRoom2 && bed1 >= Guest.nextBed2)) {
                        continue;
                    }
                }
                id_chack="25ELG"+Id1+bed1;
                if(id.equals(id_chack))
                {
                    id_valid=true;
                    check_password();
                    break;
                }
            }
            if (id_valid) break;
        }
        if(!id_valid)
        {
            for(int Id2=201;Id2<=215;Id2++)
            {
                for(int bed2=1;bed2<=3;bed2++)
                {
                    if (Id2 >= 204) {
                        if (Id2 > Guest.nextRoom3 || (Id2 == Guest.nextRoom3 && bed2 >= Guest.nextBed3)) {
                            continue;
                        }
                    }
                    id_chack="25ELG"+Id2+bed2;
                    if(id.equals(id_chack))
                    {
                        id_valid=true;
                        check_password();
                        break;
                    }
                }
                if (id_valid) break;
            }
        }
        if(!id_valid)
        {
            for(int Id3=301;Id3<=310;Id3++)
            {
                for(int bed3=1;bed3<=4;bed3++)
                {
                    if (Id3 >= 304) {
                        if (Id3 > Guest.nextRoom4 || (Id3 == Guest.nextRoom4 && bed3 >= Guest.nextBed4)) {
                            continue;
                        }
                    }
                    id_chack="25ELG"+Id3+bed3;
                    if(id.equals(id_chack))
                    {
                        id_valid=true;
                        check_password();
                        break;
                    }
                }
                if (id_valid) break;
            }
        }
        if(!id_valid)
        {
            System.out.println("Invalid ID! please try again");
            check();
        }
    }
    void check_password()
    {
        System.out.println("Enter your Password");
        password=sc.nextLine();
        boolean chack_password=true;
        while(chack_password)
        {
            if(password.equals("Stanza_Spectra"))
            {
                System.out.println("+===================+");
                System.out.println("|HOW CAN I HELP YOU |");
                System.out.println("|CASE 1 : Services  |");
                System.out.println("|CASE 2 : Support   |");
                System.out.println("+===================+");
                choice_help = nextInt();
                boolean Help=true;
                while(Help)
                {
                    if(choice_help == 1) 
                    {
                        service();
                        break;
                    }
                    else if(choice_help == 2) 
                    {
                        support();
                        break;
                    }
                    else
                    {
                        System.out.println("+----------------------+");
                        System.out.println("+ Enter a valid number |");
                        System.out.println("+----------------------+");
                        choice_help=nextInt();
                    }
                }
                break;
            }
            else
            {
                System.out.println("+----------------------------+");
                System.out.println("| 1 : Forgot password        |");
                System.out.println("| 2 : ReEnter your password  |");
                System.out.println("+----------------------------+");
                choice_password=nextInt();
                boolean correct_password=true;
                while(correct_password)
                {
                    if(choice_password==2)
                    {
                        sc.nextLine();
                        System.out.println("Enter a correct password");
                        password=sc.nextLine();
                        correct_password=false;
                    }
                    else if(choice_password==1)
                   {
                        sc.nextLine();
                        Chack_Email();
                        correct_password=false;
                    }
                    else
                    {
                        System.out.println("Enter a correct choice");
                        choice_password=nextInt();
                    }
                    break;
                }
            }
        }  
    }
	void service()
    {
		System.out.println("+=========================+");
		System.out.println("|+==== STAY SERVICES ====+|");
		System.out.println("|1 : Internet plan        |");
		System.out.println("|2 : Meal plan Time table |");
		System.out.println("|3 : Housekeeping         |");
		System.out.println("|4 : Laundry              |");
		System.out.println("|5 : Electricity          |");
		System.out.println("|6 : Water                |");
		System.out.println("|7 : Exit                 |");
		System.out.println("+=========================+");
		int serviceType = nextInt();
		boolean Service_case=true;

         while(Service_case)
         {
            if(serviceType==1)
			{
                System.out.println("+----------------------------+");
                System.out.println("|You are select Internet plan|");
                System.out.println("|Max devices: 2              |");
                System.out.println("|Total Data: 75.0GB          |");
                System.out.println("|Resets in 30 Days           |");
                System.out.println("|Speed: 10Mbps               |");
                System.out.println("+----------------------------+");
				service();
				break;
			}
			else if(serviceType==2)
			{
                System.out.println("+------------------------------------+");
                System.out.println("|You are select Meal Timetable       |");
                System.out.println("|Daily 07:30 AM - 09:30 AM: Breakfast|");
                System.out.println("|Daily 12:30 PM - 02:30 PM: Lunch    |");
                System.out.println("|Daily 04:30 PM - 06:30 PM: Snacks   |");
                System.out.println("|Daily 07:30 PM - 09:30 PM: Dinner   |");
                System.out.println("+------------------------------------+");
				service();
				break;
			}
			else if(serviceType==3)
			{
                System.out.println("+------------------------------------+");
                System.out.println("|You are select Housekeeping details |");
                System.out.println("|Room: 3 times/week                  |");
                System.out.println("|Common area: Daily                  |");
                System.out.println("+------------------------------------+");
				service();
				break;
			}
            else if(serviceType==4)
			{
                System.out.println("+------------------------------------+");
                System.out.println("|You are select Laundry details      |");
                System.out.println("|Wash & Iron: 2 times/week           |");
                System.out.println("+------------------------------------+");
				service();
				break;
			}
            else if(serviceType==5)
			{
                System.out.println("+-------------------------------------------------------------------------------------------------+");
                System.out.println("|You are select Electricity details                                                               |");
                System.out.println("|Room, Common area, Geyser, Common Geyser, Power Backup charges are included in your monthly fee. |");
                System.out.println("|AC: 13 rupees/unit is not included in your monthly fee.                                          |");
                System.out.println("+-------------------------------------------------------------------------------------------------+");
				service();
				break;
			}
            else if(serviceType==6)
			{
				sc.nextLine();
                System.out.println("+------------------------------------------------------------------------------------------------+");
                System.out.println("|You are select Water details                                                                    |");
                System.out.println("|Additional costs incurred for water supply through tankers will be passed on to all residents.  |");
                System.out.println("+------------------------------------------------------------------------------------------------+");
				service();
				break;
			}
			else if(serviceType==7)
			{
				break;
			}
			else
			{
				System.out.println("+----------------------+");
				System.out.println("+ Enter a valid number |");
				System.out.println("+----------------------|");
				serviceType=nextInt();
			}
        }
    }
    void Chack_Email()
    {
        System.out.println("Enter Email id ");
        chack_Email=sc.nextLine();
        boolean valid_Email=true;
        while(valid_Email)
        {
            if(chack_Email.equals(chack_Email.toLowerCase()))
            {
                String[] parts=chack_Email.split("@");
                if(parts.length==2 && parts[1].equals("gmail.com"))
                {
                    System.out.println("Your password : Stanza_Spectra");
                    valid_Email=false;
                }
                else
                {
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| Enter a valid Email & all leter must be small later |");
                    System.out.println("+-----------------------------------------------------+");
                    chack_Email=sc.nextLine();
                }
            }
            else
            {
                System.out.println("+-----------------------------------------------------+");
                System.out.println("| Enter a valid Email & all leter must be small later |");
                System.out.println("+-----------------------------------------------------+");
                chack_Email=sc.nextLine();
            }
        }
    }
	void support()
	{
		System.out.println("+=========================+");
		System.out.println("|Stay Supports            |");
		System.out.println("|1 : Internet             |");
		System.out.println("|2 : Food                 |");
		System.out.println("|3 : Room + common area   |");
		System.out.println("|4 : Laundry              |");
		System.out.println("|5 : Cleanliness          |");
		System.out.println("|6 : Security             |");
		System.out.println("+=========================+");
		support= nextInt();
		switch(support)
		{
			case 1:
			supportInternet();
			break;
			case 2:
			supportFood();
			break;
			case 3:
			supportRoom_CA();
			break;
			case 4:
			supportLaundry();
			break;
			case 5:
			supportCleanliness();
			break;
			case 6:
			supportSecurity();
			break;
			default:
			System.out.println("+----------------------+");
			System.out.println("+ Enter a valid number |");
			System.out.println("+----------------------|");
			support();
		}		
	}
    void supportInternet()
    {
        System.out.println("+----------------------------------------+");
		System.out.println("|=============Choose catagory============|");
		System.out.println("|CASE 1 : Data & recharges issuse        |");
		System.out.println("|CASE 2 : Slow speed                     |");
		System.out.println("|CASE 3 : Frequently Getting disconnected|");
		System.out.println("|CASE 4 : Unable to connect              |");
        System.out.println("+----------------------------------------+");
		choice_internet=nextInt();
		switch(choice_internet)
		{
			case 1:
            System.out.println("+------------------------------------------------------------------------------+");
			System.out.println("|1 : App shows higher data consumption                                         |");
			System.out.println("|2 : Purchased an add-on pack pack,but got less Data                           |");
			System.out.println("|3 : Purchased an add-on but it is not reflecting                              |");
			System.out.println("|4 : Purchased an add-on for new device but cannot acess internet on it        |");
			System.out.println("|5 : Unused data from the last cycle is not reflecting on my total unsused data|");
            System.out.println("+------------------------------------------------------------------------------+");
            ans();
			break;

			case 2:
            System.out.println("+--------------------------------+");
			System.out.println("|1 : My internet speed has droped|");
			System.out.println("|2 : weak WiFi signal in my room |");
			System.out.println("|3 : want higher speed internet  |");
            System.out.println("+--------------------------------+");
			ans();	
			break;

			case 3:
            System.out.println("+------------------------+");
			System.out.println("| Frequent disconnection +");
            System.out.println("+------------------------+");
			System.out.println(responce);
			break;

			case 4:
            System.out.println("+-----------------------------------------+");
			System.out.println("|1 : Login page not loading               |");
			System.out.println("|2 : Invalid user ID                      |");
			System.out.println("|3 : didn't recive OTP                    |");
			System.out.println("|2 : Not able to connect a specific device|");
            System.out.println("+-----------------------------------------+");
            ans();
			break;
			default:
			System.out.println(valid);
			supportInternet();
			break;
		}
	}
	void supportFood()
	{	
        System.out.println("+-------------------------------+");			
		System.out.println("|========Choose catagory========|");
		System.out.println("|CASE 1 : Quality or test issuse|");
		System.out.println("|CASE 2 : Meal timings          |");
        System.out.println("+-------------------------------+");
		choice_food=nextInt();
		switch(choice_food)
		{
			case 1:
            System.out.println("+---------------------------------+");
			System.out.println("|1 : Raw or undercooked           |");
			System.out.println("|2 : Not liking the test          |");
			System.out.println("|3 : food served cold             |");
			System.out.println("|4 : Addtional items Not available|");
            System.out.println("+---------------------------------+");
			ans();
			break;
			case 2:
            System.out.println("+---------------------------------+");
			System.out.println("|Case 1 : Food served late        |");
			System.out.println("|Case 2 : Meal removed before time|");
            System.out.println("+---------------------------------+");
			ans();
			break;
			default:
			System.out.println(valid);
			supportFood();
			break;
		}
	}
	void supportRoom_CA()
	{
        System.out.println("+--------------------+");
		System.out.println("|==Choose catagory===|");
		System.out.println("|CASE 1 : Room       |");
		System.out.println("|CASE 2 : Wash room  |");
		System.out.println("|CASE 3 : Common area|");
        System.out.println("+--------------------+");
		choice_room_ca=nextInt();
		switch(choice_room_ca)
		{
			case 1:
            System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|AC , Fan , Tubelight / Bulb , Socket / Switch , Bed , Matterss & |");
			System.out.println("|Door , Cupboard , Curtain , Window , Table , Chair , Mirror      |");
            System.out.println("|Are you having problems with any of the above?                   |");
			System.out.println("+-----------------------------------------------------------------+");
            sc.nextLine();
            String room_Problem=sc.nextLine();
			System.out.println(responce);
			System.out.println();
			break;
			case 2:
            System.out.println("+-----------------------------------------------------------------------------------------+");
			System.out.println("|Geyser , Exhaust Fan , Flush , Jet Spray / Faucet , Pot/Water issue , Tap , Shower , Door|");
			System.out.println("|Are you having problems with any of the above?                                           |");
            System.out.println("+-----------------------------------------------------------------------------------------+");
            sc.nextLine();
			String washRoom_Problem=sc.nextLine();
			System.out.println();
			System.out.println(responce);
			break;
			case 3:
            System.out.println("+------------------------------------------------------------+");
			System.out.println("|Refrigetor , Induction , Tea Machine , Microwave , RO , TV  |");
			System.out.println("|Are you having problems with any of the above?              |");
            System.out.println("+------------------------------------------------------------+");
			sc.nextLine();
			String CA_Problem=sc.nextLine();
			System.out.println();
			System.out.println(responce);
			break;
			default:
			System.out.println(valid);
			supportRoom_CA();
			break;
		}
	}
	void supportLaundry()
	{
		sc.nextLine();
        System.out.println("+--------------------------------------------------------------------------+");
		System.out.println("|Service Delays , Quality Defects and issues , Service issues and Requests |");
		System.out.println("|Is your problem one of Given options given above? yes or no ?             |");
        System.out.println("+--------------------------------------------------------------------------+");
		String choice_laundry=sc.nextLine();
		System.out.println();
		boolean laundry;
		if(choice_laundry.toLowerCase().equals("yes"))
		{
			System.out.println(responce);
            laundry=false;
		}
		else if(choice_laundry.toLowerCase().equals("no"))
		{
			System.out.println("What is your problrm?");
			String Problem1=sc.nextLine();
			System.out.println(responce);
			laundry=false;
		}
		else
		{
			System.out.println("Enter a valid Answer");
			supportLaundry();
		}
	}
	void supportCleanliness()
	{
        System.out.println("+--------------------+");
		System.out.println("|==Choose catagory===|");
		System.out.println("|CASE 1 : Room       |");
		System.out.println("|CASE 2 : Common area|");
		System.out.println("|CASE 3 : Dining Area|");
        System.out.println("+--------------------+");
		choice_cleanliness=nextInt();
		switch(choice_cleanliness)
		{
			case 1:
			System.out.println("Room , Washroom , Balcony");
			ans();
			break;
			case 2:
			System.out.println("Stairs , Corridor , Laundry area , Entrance Area , Elevator Area , Washroom ");
			ans();
			break;
			case 3:
			System.out.println("Floor , Basin , Handwash Dustbin , Utensils ");
			ans();
			break;
			default:
			System.out.println(valid);
			supportCleanliness();
			break;
		}
	}
	void supportSecurity()
	{
		sc.nextLine();
		System.out.println("+------------------------------------------------------------------------+");
		System.out.println("|============================Choose catagory=============================|");
		System.out.println("|1 : Personal Belongings Got Lost or Damaged                             |");
		System.out.println("|2 : Issue with Biometric Security                                       |");
		System.out.println("|3 : CCTV not Working                                                    |");
		System.out.println("|4 : External People Staying in the Property                             |");
		System.out.println("|5 : No security Guard present in property                               |");
		System.out.println("|You don't need to penic , Are you having problmes with which of these?  |");
		System.out.println("+------------------------------------------------------------------------+");
		String choice_security=sc.nextLine();
		System.out.println();
		System.out.println(responce);
	}
	void ans()
	{
		sc.nextLine();
		System.out.println("Is your problem one of Given options given above? yes or no?");
		String choice_ans=sc.nextLine();
		boolean chack_ans;
		if(choice_ans.toLowerCase().equals("yes"))
		{
			System.out.println(responce);
		}
		else if(choice_ans.toLowerCase().equals("no"))
		{
			System.out.println("What is your problem?");
			String Problem2=sc.nextLine();
			System.out.println(responce);
			chack_ans=false;
		}
		else
		{
            System.out.println("+--------------------+");
			System.out.println("| Enter valid answer |");
            System.out.println("+--------------------+");
			ans();
		}
	}
}
class Guest
{
	Scanner sc=house.sc;
	String name,father_Name,mother_Name,Name,address,city,state,job_tital,Degree,room;
    String district,email,blood_groop,institute_name,Contract,course,degree,houseVar,pincode;
    String Mobile_no,mobile_no,father_mobile_no,mother_mobile_no,aadharcard_number,id,birthdate,Today_Date;
    int date,month,year,room_choice,Contracts,Month,Date ,Case5;
	int Year=2025,room_need,your_choice,present_work,room_no,bed_no;
    static int bed,Room;
    static int nextRoom2 = 104;
    static int nextBed2 = 1;
    static int nextRoom3 = 204;
    static int nextBed3 = 1;
    static int nextRoom4 = 304;
    static int nextBed4 = 1;
    int nextInt()
    {
        while(true)
        {
            try
            {
                return sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
            }
        }
    }
	void check()
	{
		Guest House = new Guest();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("| Do you need a room to stay and that's what you came here for? |");
		System.out.println("|---------------------------------------------------------------|");
		System.out.println("| Case 1 : Yes                                                  |");
		System.out.println("| Case 2 : No                                                   |");
		System.out.println("+---------------------------------------------------------------+");
		room_need=nextInt();
        boolean need_room=true;
		while(need_room)
		{
			if(room_need==1)
            {
                facilities();
                System.out.println("+----------------------------------------------+");
                System.out.println("| Do you want to stay in this pin guest house? |");
                System.out.println("|----------------------------------------------|");
                System.out.println("| Case 1 : Yes                                 |");
                System.out.println("| Case 2 : No                                  |");
                System.out.println("+----------------------------------------------+");
                your_choice=nextInt();
                boolean choice_your=true;
                while(choice_your)
                {
                    if(your_choice==1)
                    {
                        stay();
                        System.out.println("+----------------------------------------------------------+");
                        System.out.println("| Our team is active 24*7 If a resident faces any problem, |");
                        System.out.println("| contact our support system immediately                   |");
                        System.out.println("| Thank you, STANZA LEAVING ELGIN HOUSE                    |");
                        System.out.println("+----------------------------------------------------------+");
                        choice_your=false;
                    } 
                    else if(your_choice==2)
                    {
                        System.out.println("+-----------------------------+");
                        System.out.println("| Thank you , Have a nice day |");
                        System.out.println("+-----------------------------+");
                        choice_your=false;
                    }
                    else
                    {
                        System.out.println("+----------------------+");
                        System.out.println("| Enter a valid Number |");
                        System.out.println("+----------------------+");
                        your_choice=nextInt();
                    }
                }
                need_room=false;
            }
			else if(room_need==2)
			{
			System.out.println("+-----------------------------+");
			System.out.println("| Thank you , Have a nice day |");
			System.out.println("+-----------------------------+");
			need_room=false;
            }
			else
            {
                System.out.println("+----------------------+");
                System.out.println("| Enter a valid Number |");
                System.out.println("+----------------------+");
                room_need=nextInt();
            }
		}		
	}
    void facilities()
    {
        System.out.println("+=========================================================================================================================+");
        System.out.println("| 18000 rupees per month 2 Sharing room with include Other Facilities                                                     |");
        System.out.println("| 15000 rupees per month 3 Sharing room with include Other Facilities                                                     |");
        System.out.println("| 12000 rupees per month 4 Sharing room with include Other Facilities                                                     |");
        System.out.println("| Other Facilities are include Meal plan , Internet plan , House Kepping , Laundry , Electricity , Water                  |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Stay Services                                                                                                           |");
        System.out.println("| 1 : Internet plan                                                                                                       |");
        System.out.println("| 2 : Meal plan                                                                                                           |");
        System.out.println("| 3 : HouseKepping                                                                                                        |");
        System.out.println("| 4 : Laundry                                                                                                             |");
        System.out.println("| 5 : Electricity                                                                                                         |");
        System.out.println("| 6 : Water                                                                                                               |");
    
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|1: Internet plan                                                                                                         |");
        System.out.println("|   Max devices : 2                                                                                                       |");
        System.out.println("|   Total Data : 75.0GB                                                                                                   |");
        System.out.println("|   Resets in 30 Days                                                                                                     |");
        System.out.println("|   Speed 10Mbps                                                                                                          |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
    
        System.out.println("|2: Meal plan                                                                                                             |");
        System.out.println("|   Daily  07:30 AM - 09:30 AM Breakfast                                                                                  |");
        System.out.println("|   Daily  12:30 PM - 02:30 PM Lunch                                                                                      |");
        System.out.println("|   Daily  04:30 PM - 06:30 PM Snacks                                                                                     |");
        System.out.println("|   Daily  07:30 PM - 09:30 PM Dinner                                                                                     |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
     
        System.out.println("|3: HouseKepping                                                                                                          |");
        System.out.println("|   Room : 3 times/week                                                                                                   |");
        System.out.println("|   Common area : Daily                                                                                                   |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");

        System.out.println("|4: Laundry                                                                                                               |");
        System.out.println("|   Wash & Iron 2 times/week                                                                                              |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");

        System.out.println("|5: Electricity                                                                                                           |");
        System.out.println("|   Room , Common area , Geyser , Common Geyser , Power Backup charges are include in your monthly fee                    |");
        System.out.println("|   AC : 13 Ruppes/unit are not include in your monthly fee                                                               |");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
    
        System.out.println("|6: Water                                                                                                                 |");
        System.out.println("|   Any additional costs incurred to ensure adequate water supply through water tankers will be passed on to all residents|");
        System.out.println("|=========================================================================================================================|");

        System.out.println();
        System.out.println("**********************************************************************************************************");
        System.out.println("* Room no 101 to 120 are 2 sharing                                                                       *");
        System.out.println("* Room no 201 to 215 are 3 sharing                                                                       *");
        System.out.println("* Room no 301 to 310 are 4 sharing                                                                       *");					
        System.out.println("*========================================================================================================*");
        System.out.println("* There are three types of Contracts with us                                                             *");
        System.out.println("* 1 : Three Months                                                                                       *");
        System.out.println("* 2 : Six Months                                                                                         *");
        System.out.println("* 3 : Twele Months                                                                                       *");
        System.out.println("* one Maintenance charge as per contract is six thousand                                                 *");
        System.out.println("* You have to pay one month's rent extra when you declare your agreement and you have to pay the month's *");
        System.out.println("* rent in the first week otherwise there will be an extra charge                                         *");
        System.out.println("**********************************************************************************************************");
    }
    void stay()
    {
        sc.nextLine();
		date();
        room();
		sc.nextLine();
        System.out.println("Enter Your full name : ");
        Name=sc.nextLine();
        System.out.println("Enter Your Father full name : ");
        father_Name=sc.nextLine();
        System.out.println("Enter Your Mother name : ");
        mother_Name=sc.nextLine();
        System.out.println("Enter Mobile Number : ");
		mobile_no=sc.nextLine();
        MobileNo(mobile_no);
        mobile_no=Mobile_no;
        System.out.println("Enter Father Mobile Number :");
        father_mobile_no=sc.nextLine();
        MobileNo(father_mobile_no);
        father_mobile_no=Mobile_no;
        System.out.println("Enter Mother Mobile Number :");
        mother_mobile_no=sc.nextLine();
        MobileNo(mother_mobile_no);
        mother_mobile_no=Mobile_no;
        System.out.println("Select your BirthDate :");
        BirthDate();
        System.out.println("Enter Your Address : ");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println("Enter Your pin code no : ");
        pincode=sc.nextLine();
        Pincode(pincode);
        System.out.println("Enter Your city : ");
		city=sc.nextLine();
		System.out.println("Enter Your District : ");
		district=sc.nextLine();
		System.out.println("Enter Your State : ");
		state=sc.nextLine();
		System.out.println("Enter Your Aadharcard number : ");
        aadharcard_number=sc.nextLine();
        Aadharcard(aadharcard_number);
        System.out.println("Enter Your Email address : ");
        email=sc.nextLine();
        Email(email);
        BloodGroup();
        System.out.println("Which of you following do you do?");
        System.out.println("Case 1 : Job");
        System.out.println("Case 2 : Study");
        present_work=nextInt();
        boolean work=true;
        while(work)
        {
            if(present_work==1)
            {
                System.out.println("What job do you do?");
                sc.nextLine();
                job_tital=sc.nextLine();
                System.out.println("Enter Your Degree : ");
                Degree=sc.nextLine();
                System.out.println("+-------------------------------------------------------------------------------+");
                System.out.println("+ You give us your Aadhar card copy , ration card copy , your photo , pancard , +");    
                System.out.println("+ any your document copy of job                                                 +");
                System.out.println("+-------------------------------------------------------------------------------+");
                display();
                job();
                work=false;
            }
            else if(present_work==2)
            {
                System.out.println("Enter Institude name : ");
                sc.nextLine();
                institute_name=sc.nextLine();
                System.out.println("Enter Your course : ");
                course=sc.nextLine();
                System.out.println("Enter Your Degree : ");
                degree=sc.nextLine();
                System.out.println("+-------------------------------------------------------------------------------+");
                System.out.println("+ You give us your Aadhar card copy , ration card copy , your photo , pancard , +");    
                System.out.println("+ any your document copy of collage/school , KYC document copy                  +");
                System.out.println("+-------------------------------------------------------------------------------+");
                display();
                student();
                work=false;
            }
            else
            {
                System.out.println("+======================+");
                System.out.println("| Enter a valid number |");
                System.out.println("+======================+");
                present_work=nextInt();
            }
        }
    }
	void BloodGroup()
    {
        System.out.println("+============================+");
        System.out.println("| What is Your Blood Groop?  |");
        System.out.println("| case 1: O+                 |");
        System.out.println("| case 2: A+                 |");
        System.out.println("| case 3: B+                 |");
        System.out.println("| case 4: O-                 |");
        System.out.println("| case 5: A-                 |");
        System.out.println("| case 6: B-                 |");
        System.out.println("| case 7: AB+                |");
        System.out.println("| case 8: AB-                |");
        System.out.println("+============================+");
        int choice_bloodGroup=nextInt();
        switch(choice_bloodGroup)
        {
            case 1:
            blood_groop="O+";
            break;
            case 2:
            blood_groop="A+";
            break;
            case 3:
            blood_groop="B+";
            break;
            case 4:
            blood_groop="O-";
            break;
            case 5:
            blood_groop="A-";
            break;
            case 6:
            blood_groop="B-";
            break;
            case 7:
            blood_groop="AB+";
            break;
            case 8:
            blood_groop="AB-";
            break;
            default:
            System.out.println("Enter valid number");
            BloodGroup();
        }
    }
    void MobileNo(String Mobile_no)
    {
        boolean MobileNo=true;
        while(MobileNo)
        {
            if((Mobile_no.length()==10)&&(Mobile_no.charAt(0)=='9'||Mobile_no.charAt(0)=='8'||Mobile_no.charAt(0)=='7'||Mobile_no.charAt(0)=='6'))
            {
                this.Mobile_no=Mobile_no;
                MobileNo=false;
            }
            else
            {
                System.out.println("Enter a valid Mobile number");
                Mobile_no=sc.nextLine();
            }   
        }
    }
	void BirthDate()
    {
        boolean Birth_chack=true;
        while (Birth_chack)
        {
            System.out.println("+------------------------------+");
            System.out.println("| Enter your BirthYear         |");
            year=nextInt();
            System.out.println("+------------------------------+");
            System.out.println("| Enter your BirthMonth(1-12)  |");
            month=nextInt();
            if(month==2)
            {
                if((year%400==0)||(year%4==0&&year%100!=0))
                {
                    System.out.println("+------------------------------+");
                    System.out.println("| Enter your birth Date (1-29) |");
				    date=nextInt();
                    if(date>=1&&date<=29)
                    {
                        Birth_chack=false;
                    }
                    else
                    {
                        System.out.println("+------------------------------+");
                        System.out.println("| Enter a correct birth date   |");
                    }
                }
                else
                {
                    System.out.println("+------------------------------+");
                    System.out.println("| Enter your birth Date (1-28) |");
				    date=nextInt();
                    if(date>=1&&date<=28)
                    {
                        Birth_chack=false;
                    }
                    else
                    {
                        System.out.println("+------------------------------+");
                        System.out.println("| Enter a correct birth date   |");
                    }
                }
            }
            else if(month==4||month==6||month==9||month==11)
            {
                System.out.println("+------------------------------+");
                System.out.println("| Enter your birth Date (1-30) |");
		    	date=nextInt();
                if(date>=1&&date<=30)
                {
                    Birth_chack=false;
                }
                else
                {
                    System.out.println("+------------------------------+");
                    System.out.println("| Enter a correct birth date   |");
                }
            }
            else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            {
                System.out.println("+------------------------------+");
                System.out.println("| Enter your birth Date (1-31) |");
		    	date=nextInt();
                if(date>=1&&date<=31)
                {
                    Birth_chack=false;
                }
                else
                {
                    System.out.println("+------------------------------+");
                    System.out.println("| Enter a correct birth date   |");
                }
            }
        }
        birthdate=date+"/"+month+"/"+year;
    }
    void Pincode(String Pincode)
    {
        boolean chack_pincode=true;
        while(chack_pincode)
        {
            if(Pincode.length()==6)
            {
                pincode=Pincode;
                chack_pincode=false;
            }
            else
            {
                System.out.println("+-----------------------+");
                System.out.println("| Enter a valid Pincode |");
                System.out.println("+-----------------------+");
                Pincode=sc.nextLine();
            }
        }
    }
    void Aadharcard(String Aadharcard_number)
    {
        boolean chack_aadharcard=true;
        while(chack_aadharcard)
        {
            if(Aadharcard_number.length()==12)
            {
                aadharcard_number=Aadharcard_number;
                chack_aadharcard=false;
            }
            else
            {
                System.out.println("+---------------------------------+");
                System.out.println("| Enter a valid Aadharcard number |");
                System.out.println("+---------------------------------+");
                Aadharcard_number=sc.nextLine();
            }
        }
    }
    void Email(String Email)
    {
        boolean chack_email=true;
        while(chack_email)
        {
            if(Email.equals(Email.toLowerCase()))
            {
                String[] parts=Email.split("@");
                if(parts.length==2 && parts[1].equals("gmail.com"))
                {
                    email=Email;
                    chack_email=false;
                }
                else
                {
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| Enter a valid Email & all leter must be small later |");
                    System.out.println("+-----------------------------------------------------+");
                    Email=sc.nextLine();
                }
            }
            else
            {
                System.out.println("+-----------------------------------------------------+");
                System.out.println("| Enter a valid Email & all leter must be small later |");
                System.out.println("+-----------------------------------------------------+");
                Email=sc.nextLine();
            }
        }
    }
	void room()
    {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| What kind of room do you want? Enter your choice    |");
		System.out.println("| Option 1: 2 Sharing room                            |");
		System.out.println("| Option 2: 3 Sharing room                            |");
		System.out.println("| Option 3: 4 Sharing room                            |");
        System.out.println("+-----------------------------------------------------+");
        room_choice=nextInt();
        boolean choice_room=true;
        while(choice_room)
        {
            if(room_choice==1)
            {
                room="2 Sharing room";
                if(nextRoom2 > 120)
                {
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| All 2-sharing rooms are fully booked!               |");
                    System.out.println("+-----------------------------------------------------+");
                    choice_room=false;
                }
                else
                {
                    Room = nextRoom2;
                    bed = nextBed2;
                    room_no = Room;
                    bed_no = bed;
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| Your Room number is "+Room+" & Bed number is "+bed+"           |");
                    System.out.println("+-----------------------------------------------------+");
                    
                    nextBed2++;
                    if(nextBed2 > 2)
                    {
                        nextBed2 = 1;
                        nextRoom2++;
                    }
                    contract(room_choice);
                    choice_room=false;
                }
            }
            else if(room_choice==2)
            {
                room="3 Sharing room";
                if(nextRoom3 > 215)
                {
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| All 3-sharing rooms are fully booked!               |");
                    System.out.println("+-----------------------------------------------------+");
                    choice_room=false;
                }
                else
                {
                    Room = nextRoom3;
                    bed = nextBed3;
                    room_no = Room;
                    bed_no = bed;
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| Your Room number is "+Room+" & Bed number is "+bed+"           |");
                    System.out.println("+-----------------------------------------------------+");
                    
                    nextBed3++;
                    if(nextBed3 > 3)
                    {
                        nextBed3 = 1;
                        nextRoom3++;
                    }
                    contract(room_choice);
                    choice_room=false;
                }
            }
            else if(room_choice==3)
            {
                room="4 Sharing room";
                if(nextRoom4 > 310)
                {
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| All 4-sharing rooms are fully booked!               |");
                    System.out.println("+-----------------------------------------------------+");
                    choice_room=false;
                }
                else
                {
                    Room = nextRoom4;
                    bed = nextBed4;
                    room_no = Room;
                    bed_no = bed;
                    System.out.println("+-----------------------------------------------------+");
                    System.out.println("| Your Room number is "+Room+" & Bed number is "+bed+"           |");
                    System.out.println("+-----------------------------------------------------+");
                    
                    nextBed4++;
                    if(nextBed4 > 4)
                    {
                        nextBed4 = 1;
                        nextRoom4++;
                    }
                    contract(room_choice);
                    choice_room=false;
                }
            }
            else
            {
                System.out.println("-----------------------+");
                System.out.println("| Enter a valid number |");
                System.out.println("-----------------------+");
                room_choice=nextInt();
            }
        }
    }
    void contract(int room_choice)
    {
        if(room_choice==1)
        {
            System.out.println("+----------------------------------+");
            System.out.println("| Which contract do you want?      |");
            System.out.println("|----------------------------------|");
            System.out.println("| Option 1 : Three Months          |");
            System.out.println("| Option 2 : Six Months            |");
            System.out.println("| Option 3 : Twelve Months         |");
            System.out.println("+----------------------------------+");
            Contracts=nextInt();
            {
                boolean choice_contract_2=true;
                while(choice_contract_2)
                {
                    if(Contracts==1)
                    {
                        Contract="Three Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 60000 rupees                         |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 42000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_2=false;
                    }
                    else if(Contracts==2)
                    {   
                        Contract="Six Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 114000 rupees                        |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("|+ 1 month Advance rent + 1st Month rent = 42000 rupees   |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_2=false;
                    }
                    else if(Contracts==3)
                    {
                        Contract="Twelve Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 222000 rupees                        |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 42000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_2=false;
                    }
                    else
                    {
                        System.out.println("+--------------------+");
                        System.out.println("| Enter valid number |");
                        System.out.println("+--------------------+");
                        Contracts=nextInt();
                    }
                }
            }
        }
        if(room_choice==2)
        {
            System.out.println("+----------------------------------+");
            System.out.println("| Which contract do you want?      |");
            System.out.println("|----------------------------------|");
            System.out.println("| Option 1 : Three Months          |");
            System.out.println("| Option 2 : Six Months            |");
            System.out.println("| Option 3 : Twelve Months         |");
            System.out.println("+----------------------------------+");
            Contracts=nextInt();
            {
                boolean choice_contract_3=true;
                while(choice_contract_3)
                {
                    if(Contracts==1)
                    {
                        Contract="Three Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 51000 rupees                         |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 36000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_3=false;
                    }
                    else if(Contracts==2)
                    {   
                        Contract="Six Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 96000 rupees                         |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 36000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_3=false;
                    }
                    else if(Contracts==3)
                    {
                        Contract="Twelve Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 186000 rupees                        |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 36000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_3=false;
                    }
                    else
                    {
                        System.out.println("+--------------------+");
                        System.out.println("| Enter valid number |");
                        System.out.println("+--------------------+");
                        Contracts=nextInt();
                    }
                }
            }
        }
        if(room_choice==3)
        {
            System.out.println("+----------------------------------+");
            System.out.println("| Which contract do you want?      |");
            System.out.println("|----------------------------------|");
            System.out.println("| Option 1 : Three Months          |");
            System.out.println("| Option 2 : Six Months            |");
            System.out.println("| Option 3 : Twelve Months         |");
            System.out.println("+----------------------------------+");
            Contracts=nextInt();
            {
                boolean choice_contract_4=true;
                while(choice_contract_4)
                {
                    if(Contracts==1)
                    {
                        Contract="Three Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 42000 rupees                         |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 30000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_4=false;
                    }
                    else if(Contracts==2)
                    {   
                        Contract="Six Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 78000 rupees                         |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 30000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_4=false;
                    }
                    else if(Contracts==3)
                    {
                        Contract="Twelve Month";
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("| Your total rent is 150000 rupees                        |");
                        System.out.println("| According Stanza leaving Rule you give us Maintenance   |");
                        System.out.println("| + 1 month Advance rent + 1st Month rent = 30000 rupees  |");
                        System.out.println("+---------------------------------------------------------+");
                        choice_contract_4=false;
                    }
                    else
                    {
                        System.out.println("+--------------------+");
                        System.out.println("| Enter valid number |");
                        System.out.println("+--------------------+");
                        Contracts=nextInt();
                    }
                }
            }
        }
    }
    void date()
    {
		boolean thatday=true;
		while(thatday)
		{
			System.out.println("|+======================+|");
			System.out.println("| Select a that day'date |");
			System.out.println("+========================+");
			System.out.println("|  Enter a Month(1-12)   |");
			Month=nextInt();
			if(Month==2)
			{
				System.out.println("+----------------------------+");
				System.out.println("| Enter that day'Date (1-28) |");
				Date=nextInt();
				if(Date>=1&&Date<=28)
				{
					thatday=false;
				}
				else
				{
					System.out.println("+------------------------+");
					System.out.println("| Enter a correct date   |");
				}
			}
			else if(Month==4||Month==6||Month==9||Month==11)
			{
				System.out.println("+----------------------------+");
				System.out.println("| Enter that day'Date (1-30) |");
				Date=nextInt();
				if(Date>=1&&Date<=30)
				{
					thatday=false;
				}
				else
				{	
					System.out.println("+------------------------+");
					System.out.println("| Enter a correct date   |");
				}
			}
			else if(Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12)
			{
				System.out.println("+----------------------------+");
				System.out.println("| Enter that day'Date (1-31) |");
				Date=nextInt();
				if(Date>=1&&Date<=31)
				{
					thatday=false;
				}
				else
				{
					System.out.println("+------------------------+");
					System.out.println("| Enter a correct date   |");
				}
			}
		}
	Today_Date=Date+"/"+Month+"/"+Year;
    }
    void display()
    {
        System.out.println("+====================================================================================+");
        System.out.println("+");
        System.out.println("+");
        System.out.println("+                        STANZA LEAVING ELGIN HOUSE ");
        System.out.println("+");
        System.out.println("+");
        System.out.println("+  Ragistration Date : "+Today_Date);
        System.out.println("+");
        System.out.println("+  Name  : "+Name);
        System.out.println("+");
        System.out.println("+  Your ID : "+"25ELG"+room_no+bed);
        System.out.println("+");
        System.out.println("+  Room : "+room);
        System.out.println("+");
        System.out.println("+  Contract : "+Contract);
        System.out.println("+");
        System.out.println("+  Your Room number : "+Room);
        System.out.println("+");
        System.out.println("+  Bed number : "+bed);
        System.out.println("+");
        System.out.println("+  Email Address : "+email);
        System.out.println("+");
        System.out.println("+  Mobile Number : "+mobile_no);
        System.out.println("+");
        System.out.println("+  Birth Date    : "+birthdate);
        System.out.println("+");
        System.out.println("+  Aadharcard Number : "+aadharcard_number);
        System.out.println("+");
        System.out.println("+  Blood group : "+blood_groop);
        System.out.println("+");
        System.out.println("+  Father Name : "+father_Name);
        System.out.println("+");
        System.out.println("+  Father Mobile Number : "+father_mobile_no);
        System.out.println("+");
        System.out.println("+  Mother Name : "+mother_Name);
        System.out.println("+");
        System.out.println("+  Mother Mobile Number : "+mother_mobile_no);
        System.out.println("+");
        System.out.println("+  Pincode No :"+pincode);
        System.out.println("+");
        System.out.println("+  Address : "+address+" "+city+" "+district+" "+state);
        System.out.println("+");
    }
    void student()
    {
        System.out.println("+  Institute : "+institute_name);
        System.out.println("+");
        System.out.println("+  Course :"+course);
        System.out.println("+");
        System.out.println("+  Degree :"+degree);
        System.out.println("+");
        System.out.println("+");
        System.out.println("+");
        System.out.println("+====================================================================================+");
    }
    void job()
    {
        System.out.println("+  Job : "+job_tital);
        System.out.println("+");
        System.out.println("+  Degree :"+Degree);
        System.out.println("+");
        System.out.println("+");
        System.out.println("+====================================================================================+");

    }
}

class house {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Resident resident = new Resident();
        Guest guest = new Guest();
        
        while (true) {
            System.out.println("+=======================================+");
            System.out.println("| WELCOME TO STANZA LIVING ELGIN HOUSE |");
            System.out.println("+=======================================+");
            System.out.println("| Are you a resident or guest?          |");
            System.out.println("| 1: Resident                           |");
            System.out.println("| 2: Guest                              |");
            System.out.println("| 3: Exit                               |");
            System.out.println("+=======================================+");
            
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= 1 && choice <= 3) break;
                    else System.out.println("Invalid input! Please enter 1, 2, or 3.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }
            
            if (choice == 1) {
                resident.check();
            } else if (choice == 2) {
                guest.check();
            } else if (choice == 3) {
                System.out.println("Thank you! Exiting...");
                break;
            }
        }
        sc.close();
    }
}

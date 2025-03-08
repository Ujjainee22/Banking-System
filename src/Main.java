import java.util.*;
import java.io.*;
class BankList_and_operation
{
    static String name="";
    static String phone_no="";
    static String aadhar_no="";
    static String dob="";
    static String acc_no=""; static double balance=0.0;
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("The names of bank present:");
        System.out.println("Canara Bank\tState Bank of India\tAxis  Bank\tHongkong Bank\tBank Of India");
        System.out.println("Press 1 to continue");
        int cont;
        cont = sc.nextInt();
        if (cont == 1)
            System.out.println("Successfully logged in");
        else
        {
            System.out.println("Failed!");
            System.exit(0);
        }
        System.out.println("Enter the following value to use your account at respective bank\n\n");
        System.out.println(" Enter 1 for Canara bank");
        System.out.println(" Enter 2 for State bank of India");
        System.out.println(" Enter 3 for Axis bank");
        System.out.println(" Enter 4 for Hongkong bank");
        System.out.println(" Enter 5 for Bank Of India");
        int n= sc.nextInt();

        if(n==1||n==2||n==3||n==4||n==5)
        {


            System.out.println();
            switch(n)
            {
                case 1:
                    System.out.println("Bank name: Canara Bank");
                    System.out.println("The details of the branches of Canara Bank in Kolkata");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.printf("| %-25s | %-30s | %-15s | %-5s |\n", "Branch Name", "Location", "IFSC Code", "Rate");
                    System.out.println("-------------------------------------------------------------------------------------------");

                    String[] Branch1 = {"Canara Bank A F KOL", "Canara Bank A R M", "Canara Bank Accounts", "Canara Bank Accounts II"};
                    String[] Loc1 = {"I floor Damayanthi 041", "Adarshnagar Main Road 042", "Floor 7 Red cross Place 043", "6 Netaji Subhash Road 044"};
                    String[] IFSC_Code1 = {"CNRB0019595", "CNRB0000279", "CNRB0019595", "CNRB0000279"};
                    String[] RI1 = {"4%", "3%", "2%", "4%"};

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-25s | %-30s | %-15s | %-5s |\n", Branch1[i], Loc1[i], IFSC_Code1[i], RI1[i]);
                    }

                    System.out.println("-------------------------------------------------------------------------------------------");

                    break;

                case 2:
                    System.out.println("Bank name: State Bank Of India");
                    System.out.println("The details of the branches of State Bank of India in Kolkata");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.printf("| %-25s | %-35s | %-15s | %-5s |\n", "Branch Name", "Location", "IFSC Code", "Rate");
                    System.out.println("----------------------------------------------------------------------------------------------");

                    String[] Branch2 = {"SBI AGM Sme Ao", "SBI Agri Commercial", "SBI Alipore", "SBI Alipore Treasury"};
                    String[] Loc2 = {"SBI Zonal Office KOL-031", "Sariddhi Bhavan Block-C KOL-032", "24 by 1 Alipore Road KOL-033", "12, Biplabi Sarani KOL-034"};
                    String[] IFSC_Code2 = {"SBIB0019595", "SBIB0000279", "SBIB0019595", "SBIB0000279"};
                    String[] RI2 = {"4%", "3%", "2%", "4%"};

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-25s | %-35s | %-15s | %-5s |\n", Branch2[i], Loc2[i], IFSC_Code2[i], RI2[i]);
                    }

                    System.out.println("----------------------------------------------------------------------------------------------");


                    break;
                case 3:


                    System.out.println("Bank name: Axis Bank");
                    System.out.println("The details of the branches of Axis Bank in Kolkata");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("| %-20s | %-35s | %-15s | %-5s |\n", "Branch Name", "Location", "IFSC Code", "Rate");
                    System.out.println("---------------------------------------------------------------------------------------------");

                    String[] Branch3 = {"Kolkata", "Golpark", "Salt Lake", "Behala"};
                    String[] Loc3 = {"7, Shakespeare Sarani KOL-71", "20, Gariahat Road KOL-19", "Bd-20, Sector I KOL-64", "76 Diamond Harbour Road"};
                    String[] IFSC_Code3 = {"UTIB0019595", "UTIB0000279", "UTIB0019595", "UTIB0000279"};
                    String[] RI3 = {"4%", "3%", "2%", "4%"};

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-20s | %-35s | %-15s | %-5s |\n", Branch3[i], Loc3[i], IFSC_Code3[i], RI3[i]);
                    }

                    System.out.println("---------------------------------------------------------------------------------------------");





                    break;
                case 4:
                    System.out.println("Bank name: Hongkong Bank");
                    System.out.println("The details of the branches of Hongkong Bank in Kolkata");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.printf("| %-15s | %-35s | %-15s | %-5s |\n", "Branch Name", "Location", "IFSC Code", "Rate");
                    System.out.println("-------------------------------------------------------------------------------------------");

                    String[] Branch4 = {"Kolkata", "Griahat", "Howrah", "Garia"};
                    String[] Loc4 = {"31, Dalhousie kol-01", "No-5 Ramani Road kol-29", "Grand Truck Road kol-01", "Plot-25 Sarani kol-25"};
                    String[] IFSC_Code4 = {"HSBC0019595", "HSBC0000279", "HSBC0019595", "HSBC0000279"};
                    String[] RI4 = {"4%", "3%", "2%", "4%"};

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-15s | %-35s | %-15s | %-5s |\n", Branch4[i], Loc4[i], IFSC_Code4[i], RI4[i]);
                    }

                    System.out.println("-------------------------------------------------------------------------------------------");

                    break;
                case 5:
                    System.out.println("Bank name: Bank of India");
                    System.out.println("The details of the branches of Bank of India in Kolkata");
                    System.out.println("----------------------------------------------------------------------------------------------");
                    System.out.printf("| %-20s | %-40s | %-15s | %-5s |\n", "Branch Name", "Location", "IFSC Code", "Rate");
                    System.out.println("----------------------------------------------------------------------------------------------");

                    String[] Branch5 = {"Jodhpur Park", "Tollygunge", "Kolkata (M)", "Ruby Park"};
                    String[] Loc5 = {
                            "1, Gariahat Road, Kolkata-31",
                            "City High, 1st Floor, Kolkata-29",
                            "Netaji Subash Road, Kolkata-20",
                            "207 Kasba, Kolkata-67"
                    };
                    String[] IFSC_Code5 = {"BKID0019595", "BKID0000279", "BKDI0019595", "BKDI0000279"};
                    String[] RI5 = {"4%", "3%", "2%", "4%"};

                    for (int i = 0; i < 4; i++) {
                        System.out.printf("| %-20s | %-40s | %-15s | %-5s |\n", Branch5[i], Loc5[i], IFSC_Code5[i], RI5[i]);
                    }

                    System.out.println("----------------------------------------------------------------------------------------------");



            }

        }
        System.out.println("\n\nEnter the respective position of the branches to do transaction or create account at the respective branch else press 0 to exit");
        int branch=sc.nextInt();
        if(branch ==0)
            System.exit(0);
        System.out.println("Do you want to create a account ");
        System.out.println("Yes or  No");
        String chk=sc.next();

        if(chk.equalsIgnoreCase("yes"))
        {
            createAccount();
        }
        else
        {
            System.out.println("To perform some transaction press 1 to exit press 0");
            int chk2=sc.nextInt();
            if(chk2==1)
            {

                System.out.println("Do you already have an accocunt\nEnter Yes or No");
                String chk1=sc.next();

                if (chk1.equalsIgnoreCase("Yes")) {


                    transaction();


                }
                else
                {
                    System.out.println("As you do not have an account, transaction cannot be done");
                }
            }
            else
            {
                System.out.println("Exit");

            }
        }
    }
    static void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your phone number:");
        phone_no = sc.nextLine();

        System.out.println("Enter your aadhar card number:");
        aadhar_no = sc.nextLine();

        System.out.println("Enter your date of birth (in format DDMMYYYY):");
        dob = sc.nextLine();

        System.out.println("Enter the minimum amount to be deposited:");
        balance = sc.nextDouble();


        acc_no = phone_no.substring(0, 2) + aadhar_no.substring(2, 4) + dob.substring(4, 6) + phone_no.substring(5, 10);


        File accountFile = new File(acc_no);
        if (accountFile.exists()) {
            System.out.println("An account with this number already exists. Please try again with a different account number.");
            return;
        }


        try (FileOutputStream fw = new FileOutputStream(acc_no);
             DataOutputStream bw = new DataOutputStream(fw)) {


            bw.writeUTF(name);
            bw.writeUTF(phone_no);
            bw.writeUTF(aadhar_no);
            bw.writeUTF(dob);
            bw.writeDouble(balance);

            System.out.println("Account successfully created!");
            System.out.println("Your account number is: " + acc_no);

        } catch (IOException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }

        sc.close();
    }
    static void transaction()throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number:");
        String acc = sc.next();


        FileInputStream fr = new FileInputStream(acc);
        DataInputStream br = new DataInputStream(fr);


        String storedName = br.readUTF();
        String storedPhone = br.readUTF();
        String storedAadhar = br.readUTF();
        String storedDob = br.readUTF();
        double storedBalance = br.readDouble();


        br.close();
        fr.close();


        System.out.println("Enter 1 to withdraw money\nEnter 2 to deposit money\nEnter 3 to Check Balance\nEnter 4 to exit");
        int oper = sc.nextInt();


        FileOutputStream fw1 = new FileOutputStream(acc, false);
        DataOutputStream bw1 = new DataOutputStream(fw1);


        switch (oper) {
            case 1: // Withdrawal
                System.out.println("Current balance: " + storedBalance);
                System.out.println("Enter the amount to withdraw:");
                double withdrawAmount = sc.nextDouble();

                if (storedBalance < withdrawAmount) {
                    System.out.println("Insufficient funds!");
                } else {
                    storedBalance -= withdrawAmount;
                    System.out.println("Withdrawal successful. New balance: " + storedBalance);
                }
                break;

            case 2: // Deposit
                System.out.println("Enter the amount to deposit:");
                double depositAmount = sc.nextDouble();
                storedBalance += depositAmount;
                System.out.println("Deposit successful. New balance: " + storedBalance);
                break;

            case 3: // Check balance
                System.out.println("Your current balance is: " + storedBalance);
                break;
            case 4:System.exit(0);
            default:
                System.out.println("Invalid choice!");
                break;

        }
        bw1.writeUTF(storedName);
        bw1.writeUTF(storedPhone);
        bw1.writeUTF(storedAadhar);
        bw1.writeUTF(storedDob);
        bw1.writeDouble(storedBalance);


        bw1.close();
        fw1.close();

        sc.close();
    }
}
package Projects.OtoMailPaswordCreation;

import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com"; // Şirket Domaini
    int mailBoxCapacity = 1000;
    int defaultPasswordLength = 12;
    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        // System.out.println("Department: " + department);

        this.passWord = setRandomPassWord(defaultPasswordLength);
        //System.out.println("Password: " + passWord);

        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;
    }
    public String setDepartment() {
        System.out.println("Aşağıdaki departmanlardan birini seçiniz...\n"+
                    "\n1 Test Automation \n2 FS Developer \n3 Salesforce \n0 Hiçbiri");
        Scanner scanner  =new Scanner(System.in);
        int options = scanner.nextInt();

        if (options == 1){
            return  "testautomation.";
        } else if (options == 2) {
            return "fullstackdeveloper.";
        } else if (options == 3) {
            return "salesforce.";
        }else {
            return "";
        }
    }
    public String setRandomPassWord(int lenght) {
        String passWordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] password = new char[lenght];

        for (int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * passWordSet.length());
            password[i] = passWordSet.charAt(random);
        }
        return new String(password);
    }
    public String showInfo(){
        return "Ad-Soyad: " + firstName + " " + lastName + "\n"+
                "Sirket Email: " + email + "\n" +
                "Capasity: " + mailBoxCapacity + "mb \n" +
                "Password: " + passWord;
    }
}

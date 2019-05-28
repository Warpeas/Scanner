package A5;

public class Customer {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Gender gender;
    
    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    }
    
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    
    Customer(String firstName, String lastName, char gender, String ssn) {
            this.firstName = formatName(firstName);
            this.lastName = formatName(lastName);
//        switch (gender) {
//            case 'm':
//                this.gender = Gender.MALE;
//                break;
//            case 'f':
//                this.gender = Gender.FEMALE;
//                break;
//        }
		this.gender = formatGender(gender);
        this.socialSecurityNumber = ssn;
    }
    
    public static boolean checkName(String name) {
//        int flag = 0;
//        for (int i = 1; i < name.length(); i++) {
//            if (Character.isUpperCase(name.charAt(i)))
//                flag = 1;
//        }
//        if (Character.isUpperCase(name.charAt(0)) && flag == 0)
//            return true;
        if (name.matches("[a-zA-Z]+"))
            return true;
        else
            return false;
    }
    
    public static String formatName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
    
	public static Gender formatGender(char gender){
		if (gender == 'm')
                return Gender.MALE;
		else
                return Gender.FEMALE;
	}
    public static boolean checkSSN(String ssn) {
        if (ssn.length() == 8 && ssn.charAt(0) != '0')
            return true;
        else
            return false;
    }
}

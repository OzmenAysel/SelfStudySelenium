package Interview_questions.JavaQuestions;

public class PasswordValidationTask_String {
    /*1. Write a return method that can verify if a password is valid or not.
		requirements:
		1. Password MUST be at least have 6 characters and should not contain space
		2. PassWord should at least contain one upper case letter
		3. PassWord should at least contain one lowercase letter
		4. Password should at least contain one special characters
		5. Password should at least contain a digit
		if all requirements above are met, the method returns true, otherwise returns  false
		*/
    public static void main(String[] args) {
        String password = "123abc#@$AB";
        System.out.println(PassWordValidation(password));
        System.out.println(PassWordValidation2(password));
    }

    public static boolean PassWordValidation(String password){

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[-/,:-@].*)";

        boolean HashLower = password.matches(lowercase),
                HashUpper = password.matches(uppercase),
                HashDigit = password.matches(numbers),
                HashSpecial = password.matches(specialchars),

                Valid = false;
        if(password.length()>=6 && !password.contains(" "))
            if(HashLower&&HashUpper&&HashDigit&&HashSpecial)
                Valid=true;

        return Valid;
    }

    public static boolean PassWordValidation2(String password) {  // Hakan Abi

        if(password.length() < 6 || password.contains(" ")) {
            return false;
        }else {        // ASCII TABLE
            int upperCaseCount = 0;
            int loverCaseCount = 0;
            int specialCharacterCount = 0;
            int digitCount = 0;


            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                    upperCaseCount++;
                if (password.charAt(i) >= 97 && password.charAt(i) <= 122)
                    loverCaseCount++;
                if (password.charAt(i) >= 33 && password.charAt(i) <= 47 || password.charAt(i) >= 58 && password.charAt(i) <= 64
                || password.charAt(i) >= 91 && password.charAt(i) <= 96  || password.charAt(i) >= 123 && password.charAt(i) <= 126)
                     specialCharacterCount++;
                if (password.charAt(i) >= 48 && password.charAt(i) <= 57)
                    digitCount++;
            }
            return upperCaseCount > 0 && loverCaseCount > 0 && specialCharacterCount > 0 && digitCount > 0 ;
        }
    }
}

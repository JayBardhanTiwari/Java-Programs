public class Example {
    public static void main(String[] args) {
        // Given a String Jaybardhan add tiwari to it so output jaybardhantiwari
        String str = "jaybardhan";
        str += "tiwari";
        str = str.replace("ard", "rock");
        System.out.println(str);
        // System.out.println(str);
        boolean match = false;
        String ard = "ard";
        String rock = "rock";
        // Replace ard and put rock to the string jaybardhantiwari\
        StringBuilder sb = new StringBuilder();
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ard.charAt(j)) {
                j++;

                if (j == ard.length()) {
                    match = true;
                    j = i - (ard.length()-1);
                    break;
                }
            } else {
                j = 0;
            }
        }
        if (match == true) {
            String duplicate = "";
            for (int i = 0; i < str.length(); i++) {
                if (i < j) {
                    duplicate += str.charAt(i);

                } else if (match == true) {
                    duplicate += rock;
                    i += ard.length()-1;
                    match = false;
                }
                else{
                    duplicate += str.charAt(i);
                }

            }
            System.out.println(duplicate);

        }
    }

}

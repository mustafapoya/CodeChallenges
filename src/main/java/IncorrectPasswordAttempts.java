public class IncorrectPasswordAttempts {
    public static boolean code(String passcode, String [] attempts) {
        int failCount = 0;
        for(int i = 0; i < attempts.length; i++) {
            failCount = attempts[i].equals(passcode) ? 0 : ++failCount;

            if(failCount == 10) {
                return true;
            }
        }

        return false;
    }
}

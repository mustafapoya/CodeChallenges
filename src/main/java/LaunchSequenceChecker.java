import java.util.ArrayList;
import java.util.HashMap;

public class LaunchSequenceChecker {
    public static boolean code(String [] systemNames, int [] stepNumbers) {
        HashMap<String, Integer> launchCodes = new HashMap<>();

        for(int i = 0; i < systemNames.length; i++) {
            if(launchCodes.containsKey(systemNames[i])) {
                if(launchCodes.get(systemNames[i]) >= stepNumbers[i]) {
                    return false;
                }
                launchCodes.put(systemNames[i], stepNumbers[i]);
            } else {
                launchCodes.put(systemNames[i], stepNumbers[i]);
            }
        }

        return true;
    }
}

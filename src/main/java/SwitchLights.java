import java.util.Arrays;

public class SwitchLights {
    public static int [] code(int [] array) {
        int [] originalLights = Arrays.copyOfRange(array, 0, array.length);

        for(int i = 0; i < originalLights.length; i++) {
            if(array[i] == 1) {
                originalLights = swapLights(originalLights, i);
            }
        }

        return originalLights;
    }

    private static int[] swapLights(int lights[], int currentIndex) {
        for(int i = 0; i < currentIndex; i++) {
            lights[i] = lights[i] == 1 ? 0 : 1;
        }

        lights[currentIndex] = 0;
        return lights;
    }
}

public class PrintHighestLowestValue {
    /**
     * This program gives highest and lowest integer from array.
     */
    static class OutputParameter {
        /**
         * Integer lowest is declare.
         */
        private int lowest;
        /**
         * Integer highest is declared.
         */
        private int highest;
    }

    static OutputParameter findHighestLowest(final int[] arr, final int sizeOfArray) {
        OutputParameter outputParameter = new OutputParameter();
        int index;

        if (sizeOfArray == 1) {
            outputParameter.highest = arr[0];
            outputParameter.lowest = arr[0];
            return outputParameter;
        }

        if (arr[0] > arr[1]) {
            outputParameter.highest = arr[0];
            outputParameter.lowest = arr[1];
        } else {
            outputParameter.highest = arr[1];
            outputParameter.lowest = arr[0];
        }

        for (index = 2; index < sizeOfArray; index++) {
            if (arr[index] > outputParameter.highest) {
                outputParameter.highest = arr[index];
            } else if (arr[index] < outputParameter.lowest) {
                outputParameter.lowest = arr[index];
            }
        }
        return outputParameter;
    }

    /**
     * @param args in main method make parameter final.
     */
    public static void main(final String[] args) {
        final int[] inputArray = new int[] {1000, 11, 445, 1, 330, 3000};
        final int size = 6;
        OutputParameter outputParameter = findHighestLowest(inputArray, size);
        System.out.printf("\na is %d", outputParameter.lowest);
        System.out.printf("\nb is %d", outputParameter.highest);
    }
}




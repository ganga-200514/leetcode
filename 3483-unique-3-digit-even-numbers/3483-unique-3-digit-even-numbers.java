class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    
                    if (i == j || j == k || i == k) {
                        continue;
                    }

                   
                    if (digits[i] == 0) {
                        continue;
                    }

                   
                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];

                    
                    boolean duplicate = false;

                    
                    count++;
                }
            }
        }

        boolean[] used = new boolean[1000];
        int result = 0;

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    if (digits[i] == 0 || digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (!used[number]) {
                        used[number] = true;
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
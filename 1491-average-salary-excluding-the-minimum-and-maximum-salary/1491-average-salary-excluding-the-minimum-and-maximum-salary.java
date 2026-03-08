class Solution {

    // HimanshuSingh924
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for(int i = 1; i < salary.length; i++){
            if(max<salary[i]) max=salary[i];
            if(min>salary[i]) min=salary[i];
            sum += salary[i];
        }

        sum = sum - min - max;

        double res = (double)sum/(salary.length-2);

        return res;
    }
}
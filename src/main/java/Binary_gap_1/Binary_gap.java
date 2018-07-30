package Binary_gap_1;

public class Binary_gap {
    public int solution(int N) {
        // write your code in Java SE 8

        int input = N;
        //Remove the consecutive zeros eg: 10010000  => 00001001
        while(input > 0 && (input & 1)==0){
            input >>= 1;
        }
        int max = 0;
        int zeros = 0;

        input >>= 1; //remove the last 1 to find out the num of  0 between two 1s. eg: 00001001 => 00000100
        while(input>0){

            if((input & 1)==0)
            {
                zeros ++;
            }else{
                max = (max>zeros)?max:zeros;
                // max = Math.max(max, zeros);
                zeros = 0;
                input >>= 1;
            }
        }
        return max;
    }
}

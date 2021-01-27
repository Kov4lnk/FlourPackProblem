public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int bigCountConsist = 5;
        int sum = bigCount * bigCountConsist + smallCount;

        if (sum < goal){
            return false;
        }
        return (goal%5 <= smallCount);
    }
}

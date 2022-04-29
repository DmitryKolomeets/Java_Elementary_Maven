public class Jewels {


    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for(int i=0; i< stones.length(); i++){
            for(int j=0; j<jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }



    public static void main(String[] args) {
        Jewels jewels = new Jewels();

        System.out.println(jewels.numJewelsInStones("aA", "aAAbbbb" ));
        System.out.println(jewels.numJewelsInStones("z", "ZZ" ));

    }




}

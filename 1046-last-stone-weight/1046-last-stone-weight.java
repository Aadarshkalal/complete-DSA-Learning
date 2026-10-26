class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length == 0){
            return stones[0];
        }

        for(int ele : stones){
            pq.add(ele);
        }

        while(pq.size() > 1){
            int max = pq.remove();
            int smax = pq.remove();

            int new_stone = max - smax;

            if(new_stone != 0){
                pq.add(new_stone);
            }

        }
        if(pq.size() == 0){
            return 0;
        }else{
            return pq.remove();
        }
    }
}
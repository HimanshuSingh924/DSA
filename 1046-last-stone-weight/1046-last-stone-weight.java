class Solution {
    // HimanshuSingh924
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = 
                new PriorityQueue<>(Collections.reverseOrder());
		
        for (int num : stones)
		{
			pq.add(num);
		}

		while (pq.size() > 1)
		{
			int fMax = pq.remove();
			int sMax = pq.remove();

			int res = fMax - sMax;
			
			if (res > 0)
			{
				pq.add(res);
			}
		}

		return pq.isEmpty() ? 0 : pq.peek();
    }
}
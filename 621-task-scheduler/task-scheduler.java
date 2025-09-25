class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> freqChar = new HashMap<>();
        int ans =0;
        PriorityQueue<Integer> maxFreq = new PriorityQueue<>( Collections.reverseOrder());

        for(int i=0;i<tasks.length;i++){
            freqChar.put( tasks[i] , freqChar.getOrDefault(tasks[i],0) +1);
        }
        for( Map.Entry<Character,Integer> entry : freqChar.entrySet()){
            maxFreq.add(entry.getValue());
        }
        int max = maxFreq.peek();
        

        while( !maxFreq.isEmpty() && max == maxFreq.poll() ){
            ans +=1;
        }
        ans = (max-1)*(n+1)+ans;

        return Math.max(ans,tasks.length);
    }
}
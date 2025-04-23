class Solution {
    public int countLargestGroup(int n) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        int ans=0;

        for(int i=1;i<= n ;i++){
            int temp=i,sum=0;
            while(temp!=0){
                sum+= temp%10;
                temp /=10;
            }
            map.put(sum ,map.getOrDefault(sum,0)+1);
        }

        int maxVal = Collections.max(map.values());
        for(int val: map.values()){
            if( maxVal== val){
                ans++;
            }
        }
        
        return ans;
    }
}
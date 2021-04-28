class Solution {
    public boolean isHappy(int n) {
        return isHappyFn(n,new ArrayList());
    }

    public boolean isHappyFn(int n, ArrayList arr){
        if(n == 1){
            return true;
        }

        int sum = sumFn(n);
        for(int i = 0;i<arr.size();i++){
            if(arr.get(i).equals(sum)){
                return false;
            }
        }

        arr.add(sum);

        return isHappyFn(sum,arr);
    }
    public int sumFn(int n){
        return Arrays.stream(Stream.of(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt).toArray())
                .reduce(0,(sum, num) -> sum + (num*num));
    }
}
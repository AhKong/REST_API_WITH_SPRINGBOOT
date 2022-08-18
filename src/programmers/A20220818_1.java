class A202208180_1 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxHeight = 0;
        int maxWidth = 0;

        for(int i = 0 ; i<sizes.length;i++){
            int width =  Math.max(sizes[i][0],sizes[i][1]);
            int height = Math.min(sizes[i][0],sizes[i][1]);
         
            if(width>=maxWidth){
                maxWidth = width;
            }

            if(height>=maxHeight){
                maxHeight =height;
            }
        }


        return maxHeight * maxWidth;
    }
}

class Solution {
  public int[] solution(String[] wallpaper) {

        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE, rdx = Integer.MIN_VALUE, rdy = Integer.MIN_VALUE;

        for(int i = 0; i < wallpaper.length; i++){
            String[] fileLocation = wallpaper[i].split("");

            for(int j = 0; j < fileLocation.length; j++){
                if(fileLocation[j].equals("#")){
                    if(i < lux) lux = i;
                    if(j < luy) luy = j;
                    if(i > rdx) rdx = i;
                    if(j > rdy) rdy = j;
                }
            }
        }
        
        int[] answer = {lux, luy, rdx + 1, rdy + 1};
        return answer;
    }
}
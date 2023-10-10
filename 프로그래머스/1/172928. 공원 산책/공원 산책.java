
public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1;
        int height = park.length;
        int width = park[0].length();

        // 시작 위치 찾기
        for(int i=0;i<park.length;i++){
            if(park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }



        // 이동
        for(int i=0;i<routes.length;i++){
            String[] routeInfo = routes[i].split(" ");
            String direction = routeInfo[0];        //방향
            int distance =  Integer.parseInt(routeInfo[1]);  //거리
            int nowX = x;
            int nowY = y;

            if(direction.equals("E")){ //동
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    nowX++;
                    if(nowX >= width || park[nowY].charAt(nowX) =='X'){
                        flag = false;
                        break;
                    } 
                }
                if (flag) {
                    x = nowX;
                }
            }
            else if(direction.equals("W")){
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    nowX--;
                    if(nowX < 0 || park[nowY].charAt(nowX) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    x = nowX;
                }
            }
            else if(direction.equals("S")){
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    nowY++;
                    if(nowY >= height || park[nowY].charAt(nowX) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    y = nowY;
                }
            }
            else if(direction.equals("N")){
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    nowY--;
                    if(nowY < 0 || park[nowY].charAt(nowX) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    y = nowY;
                }
            }

        }

        answer[0] = y;
        answer[1] = x;

        return answer;
    }
}

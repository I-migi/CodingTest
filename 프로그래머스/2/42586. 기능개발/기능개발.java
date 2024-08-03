import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length;i++){
           queue.add((int)Math.ceil((100.0-progresses[i]) / speeds[i])); 
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int current = queue.poll();
        int count =1;
        
        while(!queue.isEmpty()) {
            int next = queue.poll();
            if(current >= next) {
                count ++;
            } else {
                list.add(count);
                current = next ;
                count = 1;
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

//스택을 사용해서 progresses 배열 뒤에서부터 스택에 삽입.
// 100 - 스택의 1번째 원소값 = A 
// A/speeds의 1 = B일
//100 - 스택의 2번째 원소값 =B
// B/sppeds의 2 = C일
// if B >= C  -> count ++
// else B < C -> return[n] = 1;

// for문을 이용해서 기능 별 완료 날짜를 계산한 후에 큐에 넣기
// 현재 출력되는 큐 값보다 작은 것들은 모두 묶어서 count ++ 해서 제거
// 현재 출력되는 큐 값보다 큰 것들은 새로운 return[i]에 넣기
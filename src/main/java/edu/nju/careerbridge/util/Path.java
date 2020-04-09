package edu.nju.careerbridge.util;

import java.util.*;

public class Path {
    static Map<String,LinkedList<String>> undirectedGraph = new LinkedHashMap<>();
    static Map<String,Boolean> visited = new HashMap();
    static Iterator<Map.Entry<String,LinkedList<String>>> it;
    public static int count;
    public static String start;
    public static int startInd;
    public static String tag[];
    public static int map[][];
    public static int max;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line = Integer.parseInt(scan.nextLine());
        while(line>0) {
            line--;
            String inputNum[] = scan.nextLine().split(" ");
            count = Integer.parseInt(inputNum[0]);
            map = new int[count][];
            start = inputNum[1];
            tag = scan.nextLine().split(" ");
            for(int i=0;i<count;i++)
                if(tag[i].equals(start))
                    startInd = i;

            for(int i = 0;i<count;i++){
                map[i] = new int[count];
                inputNum = scan.nextLine().split(" ");
                undirectedGraph.put(tag[i],new LinkedList());
                visited.put(tag[i],false);
                for(int j=1;j<=count;j++){
                    map[i][j-1]=Integer.parseInt(inputNum[j]);
                }
            }
            for(int i=0;i<count;i++){
                for(int j=0;j<count;j++){
                    if(map[i][j]>0){
                        undirectedGraph.get(tag[i]).add(tag[j]);
                    }
                }
            }
            max = 0;
            initBeforeTravel();
            DFS(start,0);
            System.out.println(max);
        }
    }

    /**
     * 递归深度优先遍历
     * @param start
     */
    static void DFS(String start,int length){
        length++;
        visited.put(start,true);
        LinkedList<String>  neighbor = undirectedGraph.get(start);
        boolean end = true;
        for(String i : neighbor){
            if(!visited.get(i)){
                end = false;
                DFS(i,length);
            }
        }
        if(end){
            if(length>max)
                max = length;
        }
    }

    /**
     * 非递归深度优先遍历
     * @param start
     */
    static void DFSwithStack(String start){
        Stack<String> st = new Stack();
        System.out.print(start+" ");
        st.push(start);
        visited.put(start,true);
        while(!st.isEmpty()){
            String node = st.peek();
            LinkedList<String>  neighbor = undirectedGraph.get(node);
            boolean flag = false;
            if(neighbor.size() != 0) {
                for (String next : neighbor) {
                    if (!visited.get(next)) {
                        st.push(next);
                        System.out.print(next + " ");
                        visited.put(next, true);
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag) {
                st.pop();
            }
        }
    }

    /**
     * 广度优先遍历
     */
    static void BFS(String start){
        Queue<String> q = new LinkedList();
        q.offer(start);
        String result = start+" ";
        visited.put(start,true);
        while(!q.isEmpty()){
            String node = q.poll();
            LinkedList<String> neighbor = undirectedGraph.get(node);
            for(String i : neighbor){
                if(!visited.get(i)){
                    q.offer(i);
                    result += i+" ";
                    visited.put(i,true);
                }
            }
        }
        result = result.trim();
        System.out.println(result);
    }

    static void initBeforeTravel(){
        Set<String> keys = visited.keySet();
        for(String key:keys){
            visited.put(key,false);
        }
        it = undirectedGraph.entrySet().iterator();
    }

}

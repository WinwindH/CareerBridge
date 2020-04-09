package edu.nju.careerbridge.util;

/**
 * 确定的有限自动机实体类
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class  DFA{
    /*状态集*/
    final static Map<String,Set<Integer>> Dstates = new HashMap<String,Set<Integer>>();
    /*状态转换：对应位置集*/
    final static Map<String,Map<Character,Set<Integer>>> Dtran = new HashMap<String,Map<Character,Set<Integer>>>();
    /*状态转换：对应状态*/
    final static Map<String,Map<Character,String>> UsableDtran=new HashMap<String,Map<Character,String>>();

    public DFA(){
    }

    /**
     * 自动构建状态转换集
     */
    public void trans(){
        for(Map.Entry<String,Map<Character,Set<Integer>>> entry:Dtran.entrySet()){
            Map<Character,Set<Integer>> map1=entry.getValue();
            Map<Character,String> newMap=new HashMap<Character,String>();
            for(Map.Entry<Character,Set<Integer>> en:map1.entrySet()){
                Set<Integer> set=en.getValue();
                String name="";
                for(Map.Entry<String,Set<Integer>> s:Dstates.entrySet()){
                    if(s.getValue().equals(set)){
                        name=s.getKey();
                        newMap.put(en.getKey(),name);
                        break;
                    }
                }
            }
            UsableDtran.put(entry.getKey(),newMap);
        }
    }
}

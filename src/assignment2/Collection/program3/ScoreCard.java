package assignment2.Collection.program3;

import java.util.*;
class ScoreCard{
    public static void main(String args[])
    {
        Map<String, Integer> ScoreCard  = new HashMap<String, Integer>();
        int sum =0, highest=0;
        String name = null;
        ScoreCard.put("Rahane", 20);
        ScoreCard.put("Kohli", 150);
        ScoreCard.put("Dhoni", 50);
        ScoreCard.put("Rahul", 30);
        ScoreCard.put("Lokesh",2);
        
        System.out.println("************Player who batted***********");
        for (Map.Entry mapElement : ScoreCard.entrySet()) {
            String key  = (String)mapElement.getKey();  
            System.out.println(key);
        }
        
        System.out.println("****************Scores By playes **************************");
        for (Map.Entry<String, Integer> me : ScoreCard.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
            if(highest<me.getValue()) {
            	highest = me.getValue();
            	name = me.getKey();
            	
            }
        }
        
        for (Map.Entry mapElement : ScoreCard.entrySet()) {     
            Integer value = (Integer)mapElement.getValue();
            sum += value;
        }
        
        System.out.println("Total Score : " + sum);
        
        System.out.println("Name of highest Scorer :" + name);
        System.out.println("Runs Scored by Dhoni : " + ScoreCard.get("Dhoni"));
        
    }
}
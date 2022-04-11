package interview_questions;

import java.util.*;

public class isErrorFree {
    public static Boolean isErrorFree(String[] log) {

        Boolean isDataErrorFree = true;
        Set<String> userIdKeys = new HashSet<>();
        ArrayList<String> userIdArray = new ArrayList<>();

        for (int i = 0; i < log.length - 1; i++) {

            String[] tempArray = log[i].split(":");
            userIdKeys.add(tempArray[1]);
        }

        for (String id : userIdKeys) {
            userIdArray.add(id);
        }


        for (int i = 0; i < userIdArray.size(); i++) {

            String result = "";
            String userIdTracker = "";

            for (Integer j = 0; j < log.length; j++) {
                if (log[j].contains(userIdArray.get(i))) {
                    String[] tempArrayTwo = log[j].split(":");
                    result += "" + tempArrayTwo[0];}

                userIdTracker = userIdArray.get(i);
            }
            Map<String, String> map = new HashMap<>();
            map.put(userIdTracker, result);


            for (Map.Entry<String, String> e: map.entrySet()) {

                if (e.getValue().contains("ABC")){
                    System.out.println("User ID have `ABC` pattern: ID#" + e.getKey());
                    isDataErrorFree = false;
                }
            }

        }
        return isDataErrorFree;
    }
}


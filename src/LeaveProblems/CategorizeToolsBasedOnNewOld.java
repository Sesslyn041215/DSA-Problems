package LeaveProblems;

import java.util.*;
import java.util.regex.*;


//Ayudha Pooja Tool Survey
//On the occasion of Ayudha Pooja, your parents have cleaned the tools in your house and want to categorize them as new or old. They need your assistance in creating a program to manage this task. Help them by grouping the tools based on their categories.
//Example:
//Cycle (1985|Old), Bike (2021|New) - Category: 'Vehicle'
//Desktop (2000|Old), Laptop (2022|New), Monitor (2022|New) - Category: 'Computer'

public class CategorizeToolsBasedOnNewOld {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine();

	        Map<String, List<String>> categories = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            String toolInfo = sc.nextLine();
	            String category = getCategory(toolInfo);
	            if (!categories.containsKey(category)) {
	                categories.put(category, new ArrayList<>());
	            }
	            categories.get(category).add(toolInfo);
	        }

	        for (Map.Entry<String, List<String>> entry : categories.entrySet()) {
	            System.out.print(entry.getKey() + ": ");
	            for (String toolInfo : entry.getValue()) {
	                System.out.print(toolInfo + ", ");
	            }
	            System.out.println();
	        }
	    }

	    private static String getCategory(String toolInfo) {
	        String regex = "\\((\\d{4})\\|\\w+\\)";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(toolInfo);
	        if (matcher.find()) {
	            int manufacturingYear = Integer.parseInt(matcher.group(1));
	            if (manufacturingYear >= 2020) {
	                return "New";
	            } else {
	                return "Old";
	            }
	        }
	        return "Other";
	    }
}

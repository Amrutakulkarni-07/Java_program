package DemoProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(
                Arrays.asList("Java", "Selenium", "Java", "Python", "Selenium", "C++"));

        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)) && !duplicates.contains(list.get(i)))
                
                {
                    duplicates.add(list.get(i));
                }
            }
        }

        System.out.println("Duplicates: " + duplicates);

	}

}

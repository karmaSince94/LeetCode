package com.vinay.practice.lc;

import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 

	A school has provided a teacher with a budget to purchase math notebooks that students need. Several stores sell bundles of notebooks at various prices. 
	The teacher wants to purchase as many notebooks as possible within the budget, but can only purchase full bundles.
	Determine the maximum number of notebooks the teacher can purchase.
	For example, the teacher has n = $50 and there are m = 2 stores. The first sells bundles of
	20 notebooks for $12 each. The second sells bundles of only 1 notebook for $2 each. The teacher can buy 4 bundles of 20 for $48 leaving $2. 
	The teacher can then go to the second store and purchase 1 more notebook for $2, for a total of 81 notebooks.
	
	Function Description
	Complete the function budgetShopping in the editor below.budgetShopping has the following parameter(s):
	int budget: the amount of money in the notebook budget 
	int bundleQuantities[n]: the number of notebooks in a bundle at shop[i] 
	int bundleCosts[n]: the cost of a bundle of notebooks at shop[i]. 
	Return int the maximum number of notebooks that can be purchased
	Constraints
	﻿﻿1 ≤ budget ≤ 104
	﻿﻿15ns 102
	﻿﻿1 s bundleQuantities[i] ≤ 20
	﻿﻿1 ≤ bundleCosts[i] ≤ 200
	
	----
	To solve this problem, we can use a dynamic programming approach. The idea is to maximize the number of notebooks that can be bought with a given budget at each store. 
	We iterate over each store and for each store, we try to buy as many bundles as possible, then we recursively check the remaining budget with the next stores.
	I will implement the budgetShopping function in Java, which will follow these steps:
	
	Create a table maxNotebooks to store the maximum number of notebooks that can be bought with a given budget.
	Iterate through each store and try to buy as many bundles as possible from that store.
	For each bundle purchase, recursively calculate the maximum notebooks that can be bought with the remaining budget.
	Return the maximum value from the maxNotebooks table. 
 */
class Result {
    public static int budgetShopping(int budget, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
        int n = bundleQuantities.size();
        int[] maxNotebooks = new int[budget + 1];

        for (int i = 0; i < n; i++) {
            int quantity = bundleQuantities.get(i);
            int cost = bundleCosts.get(i);

            for (int j = cost; j <= budget; j++) {
                maxNotebooks[j] = Math.max(maxNotebooks[j], maxNotebooks[j - cost] + quantity);
            }
        }

        return maxNotebooks[budget];
    }
}

public class FlexTrade1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int budget = Integer.parseInt(bufferedReader.readLine().trim());
        int bundleQuantitiesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> bundleQuantities = IntStream.range(0, bundleQuantitiesCount)
            .mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int bundleCostsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> bundleCosts = IntStream.range(0, bundleCostsCount)
            .mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.budgetShopping(budget, bundleQuantities, bundleCosts);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


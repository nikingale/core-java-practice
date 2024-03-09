package com.github.nikingale.applications.bank;

import java.util.*;

public class Egen {

    Map<String, Integer> accounts = new HashMap<>();
    Map<String, Integer> transactions = new HashMap<>();

    public String[] solution(String[][] queries) {
        List<String> result = new ArrayList<>();

        for (String[] query : queries) {
            String operation = query[0];
            String accountId = query[2];
            int amount = query.length > 3 ? Integer.parseInt(query[3]) : 0;

            switch (operation) {
                case "CREATE_ACCOUNT":
                    result.add(createAccount(accountId));
                    break;
                case "DEPOSIT":
                    result.add(deposit(accountId, amount));
                    break;
                case "PAY":
                    result.add(withdraw(accountId, amount));
                    break;
                case "TOP_ACTIVITY":
                    int n = Integer.parseInt(query[2]);
                    result.add(topActivity(n));
                    break;
                default:
                    break;
            }
        }

        return result.toArray(new String[0]);
    }

    private String createAccount(String accountId) {
        if (accounts.containsKey(accountId)) {
            return "false";
        } else {
            accounts.put(accountId, 0);
            transactions.put(accountId, 0);
            return "true";
        }
    }

    private String deposit(String accountId, int amount) {
        if (!accounts.containsKey(accountId)) {
            return "";
        } else {
            int currentBalance = accounts.get(accountId);
            int newBalance = currentBalance + amount;
            accounts.put(accountId, newBalance);
            transactions.put(accountId, transactions.get(accountId) + amount); // Record transaction
            return String.valueOf(newBalance);
        }
    }

    private String withdraw(String accountId, int amount) {
        if (!accounts.containsKey(accountId) || accounts.get(accountId) < amount) {
            return "";
        } else {
            int currentBalance = accounts.get(accountId);
            int newBalance = currentBalance - amount;
            accounts.put(accountId, newBalance);
            transactions.put(accountId, transactions.get(accountId) + amount); // Record transaction
            return String.valueOf(newBalance);
        }
    }

    private String topActivity(int n) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(transactions.entrySet());
        Collections.sort(sortedList, (a, b) -> {
            int compare = b.getValue().compareTo(a.getValue());
            if (compare == 0) {
                return a.getKey().compareTo(b.getKey());
            }
            return compare;
        });

        StringBuilder result = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedList) {
            result.append(entry.getKey()).append("(").append(entry.getValue()).append("), ");
            count++;
            if (count >= n) {
                break;
            }
        }

        return result.length() > 0 ? result.substring(0, result.length() - 2) : "";
    }

}

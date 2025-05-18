//* https://leetcode.com/problems/richest-customer-wealth/description/

package linear_search;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 6, 2, 2 } };

        int result = RichestCustomer(accounts);
        System.out.println("Richest wealth is: " + result);
    }

    static int RichestCustomer(int[][] accounts) {
        int answer = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (sum > answer)
                answer = sum;
        }
        return answer;
    }
}

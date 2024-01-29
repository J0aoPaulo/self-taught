package maximumWealth;

class maximumWealth {
    public int MaximumWealth(int[][] accounts) {
        int richest = 0, customer = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                customer += accounts[i][j];
            }
            if(richest < customer) richest = customer;
            customer = 0;
        }
        return richest;
    }
}
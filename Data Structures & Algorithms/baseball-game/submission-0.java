class Solution {
    public int calPoints(String[] operations) {
        // Use a Deque as a Stack (LIFO) storing Integers
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String s : operations) {
            if (s.equals("+")) {
                int top = stack.pop();
                int secondTop = stack.peek();
                int sum = top + secondTop;
                stack.push(top); // Put the top element back
                stack.push(sum); // Push the new sum
            } 
            else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (s.equals("C")) {
                stack.pop();
            } 
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        // Calculate the total sum of all scores in the stack
        int totalSum = 0;
        for (int score : stack) {
            totalSum += score;
        }
        return totalSum;
    }
}
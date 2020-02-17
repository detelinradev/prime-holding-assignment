package primeHolding.brothersInTheBar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BrothersInTheBarST {

    public static void main(String[] args) {

        String[] glasses = null;
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            bufferedReader.skip(11);
            glasses = bufferedReader.readLine().split("[ ,\\]]+");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long time1 = System.currentTimeMillis();
        int result = 0;
        if (glasses != null) {
            int arrayLength = glasses.length;
            if (arrayLength == 3) {
                if (glasses[0].equals(glasses[1]) && glasses[0].equals(glasses[2]))
                    result++;
            }
            if (arrayLength > 3) {
                Stack<String> stack = new Stack<>();
                stack.push(glasses[0]);
                stack.push(glasses[1]);
                int index = 2;
                String firstBeer;
                while (index < arrayLength - 1) {
                    if (stack.peek().equals(glasses[index])
                            && glasses[index + 1].equals(glasses[index])) {
                        result++;
                        stack.pop();
                        index += 2;
                    } else if (stack.peek().equals(glasses[index])
                            && !glasses[index].equals(glasses[index + 1])) {
                        firstBeer = stack.pop();
                        if (stack.peek().equals(firstBeer)) {
                            result++;
                            stack.pop();
                            index++;
                        } else {
                            stack.push(firstBeer);
                        }
                    } else {
                        if (stack.size() > 2) {
                            firstBeer = stack.pop();
                            if (stack.peek().equals(firstBeer)) {
                                String secondBeer = stack.pop();
                                if (stack.peek().equals(secondBeer)) {
                                    result++;
                                    stack.pop();
                                } else {
                                    stack.push(secondBeer);
                                    stack.push(firstBeer);
                                }
                            } else {
                                stack.push(firstBeer);
                            }
                        }
                    }
                    index++;
                    if (index <= arrayLength) {
                        stack.push(glasses[index - 1]);
                    }
                }
                if (index < arrayLength) {
                    if (stack.peek().equals(glasses[index])) {
                        firstBeer = stack.pop();
                        if (stack.peek().equals(firstBeer)) {
                            result++;
                        }
                    } else if (stack.size() > 3) {
                        firstBeer = stack.pop();
                        if (stack.peek().equals(firstBeer)) {
                            String secondBeer = stack.pop();
                            if (stack.peek().equals(secondBeer)) {
                                result++;
                                stack.pop();
                            } else {
                                stack.push(secondBeer);
                                stack.push(firstBeer);
                            }
                        } else {
                            stack.push(firstBeer);
                        }
                        if (stack.size() > 1) {
                            if (stack.peek().equals(glasses[index])) {
                                firstBeer = stack.pop();
                                if (stack.peek().equals(firstBeer)) {
                                    result++;
                                }
                            }

                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Array should not be null");
    }

        long time2 = System.currentTimeMillis() -time1;
        System.out.println("brothersInTheBar(glasses) = " + result);

}
}

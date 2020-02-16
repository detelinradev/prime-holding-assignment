package primeHolding.brothersInTheBar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BrothersInTheBarLL {
    public static void main(String[] args) {
        String[] input = null;
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in))) {
            bufferedReader.skip(11);
            input = bufferedReader.readLine().split("[ ,\\]]+");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> glasses;
        int result = 0;
        if (input != null) {
            glasses = new LinkedList<>(Arrays.asList(input));

            ListIterator<String> iterator = glasses.listIterator();
            if(glasses.size()>2) {
                String thirdBeer = iterator.next();
                String secondBeer = iterator.next();
                while (glasses.size() > 2 && iterator.hasNext()) {
                    String firstBeer = iterator.next();
                    if (thirdBeer.equals(secondBeer) && secondBeer.equals(firstBeer)) {
                        iterator.remove();
                        iterator.previous();
                        iterator.remove();
                        iterator.previous();
                        iterator.remove();
                        result++;

                        for (int i = 0; i < 2 && iterator.hasPrevious(); i++) {
                            iterator.previous();
                        }
                        if(glasses.size()>2) {
                            thirdBeer = iterator.next();
                            secondBeer = iterator.next();
                        }
                    } else {
                        thirdBeer = secondBeer;
                        secondBeer = firstBeer;
                    }
                }
            }
        }
        System.out.println(result);
    }
}

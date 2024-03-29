/**
Tom is a farmer who has a special apple tree in his garden. This apple tree is quite unique because its yield increases exponentially as more gates are passed through. To harvest apples from this tree, there are a series of gates that one must pass through. Each time a person passes through a gate, the number of apples they can pick from the tree doubles, plus one additional apple.
If Tom passes through 5 gates to harvest apples from the tree, how many apples does he pluck from the tree in total?

Sample Input/Output:
Input:
Enter number of Gates: 5

Output:
94 apples he pluck from tree

Explanation:
Tom passes through 5 gates to harvest apples from the tree. At each gate, the number of apples he can pick doubles, plus one additional apple. So, the calculation goes as follows:
At the first gate, he picks (1+1)*2 = 4 apples.
At the second gate, he picks (4+1)*2 = 10 apples.
At the third gate, he picks (10+1)*2 = 22 apples.
At the fourth gate, he picks (22+1)*2 = 46 apples.
At the fifth gate, he picks (46+1)*2 = 94 apples.
Therefore, Tom plucks a total of 94 apples from the tree.
*/

import java.util.Scanner;

public class One_apple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Gates");
        int gate = in.nextInt(),apple = 1;

        while (gate>0){
            apple=(apple+1)*2;
            gate--;
        }
        System.out.println(apple+" apple he pluck from tree");
    }
}

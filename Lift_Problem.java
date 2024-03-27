/*
Chef lives in a huge apartment building with
�
N floors, numbered
0
0 (ground floor) through
�
N (terrace). Unfortunately, it has only one lift. We say that when the lift travels from a floor
�
a to a floor
�
b, it travels
∣
�
−
�
∣
∣b−a∣ floors.

Initially, the lift is on the ground floor. Then, it receives
�
Q requests (numbered
1
1 through
�
Q). For each valid
�
i, the
�
i-th request is for the lift to move from its current floor to a source floor
�
�
f
i
​
 , where some people enter the lift, and then move to a destination floor
�
�
d
i
​
 , where they exit the lift. The lift should not stop anywhere in between moving to the floor
�
�
f
i
​
  or from the floor
�
�
f
i
​
  to the floor
�
�
d
i
​
 . The lift must serve the requests sequentially, i.e. completely fulfill request
1
1, then request
2
2 and so on. The lift does not move anywhere after serving the final request.

Find the total number of floors the lift needs to travel to fulfill all the requests.

Input
The first line of the input contains a single integer
�
T denoting the number of test cases. The description of
�
T test cases follows.
The first line of each test case contains two space-separated integers
�
N and
�
Q.
The following
�
Q lines describe requests. For each valid
�
i, the
�
i-th of these lines contains two space-separated integers
�
�
f
i
​
  and
�
�
d
i
​
 .
Output
For each test case, print a single line containing one integer ― the total number of floors travelled by the lift.

Constraints
1
≤
�
≤
250
1≤T≤250
1
≤
�
≤
1
0
6
1≤N≤10
6

1
≤
�
≤
1
0
5
1≤Q≤10
5

0
≤
�
�
,
�
�
≤
�
0≤f
i
​
 ,d
i
​
 ≤N for each valid
�
i
�
�
≠
�
�
f
i
​
 =d
i
​
  for each valid
�
i
the sum of
�
Q over all test cases does not exceed
1
0
5
10
5

Sample 1:
Input
Output
1
2 3
1 2
0 1
1 0
6
Explanation:
Example case 1: The lift travels
2
2 floors up to serve the first request,
3
3 floors (
2
2 down, then
1
1 up) to serve the second request and
1
1 floor down to serve the third request. Note that in this case, the lift returned to the ground floor, but it may end up at any floor.
* */
import java.util.Scanner;

public class Lift_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt(),n = sc.nextInt(),count=0,start=0;
        for(int i=0;i<n;i++){
            int cur = sc.nextInt();
            int req = sc.nextInt();
            count +=  Math.abs(start-cur);
            count +=  Math.abs(cur-req);
            start = req;
        }
        System.out.println(count);
    }
}

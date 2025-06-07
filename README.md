# M8Comp Car Simulator

A simple Java simulation of a BMW M8 Competition custom build with turbo upgrades and basic car controls.

## Features

- **Install Components:** Front grill, radiator, and twin turbo vents.
- **Engine Control:** Start and stop the engine with dependency checks.
- **RPM Management:** Increase and decrease RPM while engine is running.
- **Honking:** Simulate honking anytime.

## How to Use

1. **Create** an instance of `M8Comp`.
2. **Install** all required components (`installGrill()`, `installRadiator()`, `installTurboVents()`).
3. **Start** the engine (`startEngine()`) — only works if all parts are installed.
4. **Adjust RPM** with `increaseRPM(int)` and `decreaseRPM(int)` while the engine is on.
5. **Honk** anytime with `honk()`.
6. **Stop** the engine with `stopEngine()`.


 Quick Descriptions:
1️⃣ Climbing Stairs (k steps at a time)
You can take 1 to k steps at a time. How many ways to reach the top of n stairs?

✅ Use: Recursion → Memoization → Tabulation
🛠 Similar to: Dice Throw, Frog Jump, Min Steps to N

2️⃣ House Robber II
Same as House Robber I but now houses are in a circle.

✅ Use: Break into two subproblems: 0 to n-2 and 1 to n-1.
⛓ Test of handling circular array constraints in DP.

3️⃣ Max Sum of Non-Adjacent Elements
Given an array, return max sum of elements with no two adjacent selected.

🧠 Same logic as House Robber I.
✅ Use DP: dp[i] = max(dp[i-1], arr[i] + dp[i-2])

4️⃣ Jump Game I & II
You are at index 0 and can jump arr[i] steps forward. Can you reach the end?

Jump Game I → Just check if possible ✅

Jump Game II → Minimum jumps needed ✅

📈 Good combo of Greedy + DP thinking
🔥 FAANG love asking this.

5️⃣ Partition Equal Subset Sum
Can you split the array into two subsets with equal sum?

✅ Convert it to 0/1 Knapsack problem
dp[i][sum] = true/false


Move for today Topics to Cover :
Basic Queue (Array/LinkedList Implementation)

Operations: enqueue, dequeue, peek, isEmpty

Time Complexity

Circular Queue

Queue Using Two Stacks

Sliding Window Maximum (Monotonic Queue) [🔥 FAANG Favorite]

BFS using Queue (Graph traversal)

Real-life Problem:
👉 Design a Ticket Booking System using Queue logic

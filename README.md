### GitHub README

## Problem Description

You are given a binary tree, and your task is to return its **top view**.  

The **top view** of a binary tree is the set of nodes visible when the tree is viewed from the top.  

### Rules:
1. Nodes should be returned from the **leftmost** to the **rightmost** position.
2. If two nodes are at the same horizontal distance, only the first node encountered (from top to bottom) is included in the top view.

---

### Solution Approach

The solution utilizes a **Breadth-First Search (BFS)** approach to traverse the binary tree, maintaining a record of horizontal distances (HD) to determine the top view.  

**Steps**:  
1. **Use Two Queues**:  
   - One for nodes (`q`) and another for their respective horizontal distances (`hd`).  
2. **Track Horizontal Distances**:  
   - Use a `TreeMap` to map horizontal distances to the first node encountered at each HD.  
3. **Processing Nodes**:  
   - For each node, calculate its HD:
     - Left child: `currentHD - 1`
     - Right child: `currentHD + 1`
   - Add the node to the map if its HD is not already present.  
4. **Extract Results**:  
   - Traverse the map from leftmost HD to rightmost HD and store the values in the result list.  

### Time and Space Complexity

- **Time Complexity**: O(n), where `n` is the number of nodes in the binary tree. Each node is processed once.  
- **Space Complexity**: O(n), for the queues and the `TreeMap`.

---

For a detailed explanation of the approach, visit the [description here](https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1).

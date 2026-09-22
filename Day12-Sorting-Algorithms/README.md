# Sorting Algorithms & LeetCode

A collection of **sorting algorithm implementations and LeetCode problems** solved in Java.

This repository is focused on building a strong understanding of sorting algorithms, their time and space complexity, and how sorting techniques can be applied to solve real coding interview problems.

---

## 📚 Topics Covered

### Sorting Algorithms

* Bubble Sort
* Selection Sort
* Insertion Sort
* Merge Sort
* Quick Sort

### Problem-Solving Techniques

* Two Pointers
* Divide and Conquer
* Greedy Algorithms
* Custom Comparators
* Linked List Sorting
* In-place Algorithms
* Array Manipulation
* Time & Space Complexity

---

## 🧠 Sorting Algorithms

| Algorithm      |  Best Case | Average Case | Worst Case |     Space |
| -------------- | ---------: | -----------: | ---------: | --------: |
| Bubble Sort    |       O(n) |        O(n²) |      O(n²) |      O(1) |
| Selection Sort |      O(n²) |        O(n²) |      O(n²) |      O(1) |
| Insertion Sort |       O(n) |        O(n²) |      O(n²) |      O(1) |
| Merge Sort     | O(n log n) |   O(n log n) | O(n log n) |      O(n) |
| Quick Sort     | O(n log n) |   O(n log n) |      O(n²) | O(log n)* |

> *Quick Sort space complexity depends on the recursion depth and implementation.

---

## 💻 LeetCode Problems

| #    | Problem                                                                   | Difficulty | Main Concept         |
| ---- | ------------------------------------------------------------------------- | ---------- | -------------------- |
| 75   | [Sort Colors](https://leetcode.com/problems/sort-colors/)                 | 🟡 Medium  | Two Pointers         |
| 88   | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)   | 🟢 Easy    | Merge / Two Pointers |
| 147  | [Insertion Sort List](https://leetcode.com/problems/insertion-sort-list/) | 🟡 Medium  | Insertion Sort       |
| 912  | [Sort an Array](https://leetcode.com/problems/sort-an-array/)             | 🟡 Medium  | Merge Sort           |
| 148  | [Sort List](https://leetcode.com/problems/sort-list/)                     | 🟡 Medium  | Merge Sort           |
| 179  | [Largest Number](https://leetcode.com/problems/largest-number/)           | 🟡 Medium  | Custom Comparator    |
| 253  | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/)       | 🟡 Medium  | Sorting + Greedy     |
| 1051 | [Height Checker](https://leetcode.com/problems/height-checker/)           | 🟢 Easy    | Sorting              |

---

## 📂 Repository Structure

```text
sorting-algorithms/
│
├── README.md
│
├── algorithms/
│   │
│   ├── bubble-sort/
│   │   ├── BubbleSort.java
│   │   └── README.md
│   │
│   ├── selection-sort/
│   │   ├── SelectionSort.java
│   │   └── README.md
│   │
│   ├── insertion-sort/
│   │   ├── InsertionSort.java
│   │   └── README.md
│   │
│   ├── merge-sort/
│   │   ├── MergeSort.java
│   │   └── README.md
│   │
│   └── quick-sort/
│       ├── QuickSort.java
│       └── README.md
│
└── leetcode/
    │
    ├── 75-sort-colors/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 88-merge-sorted-array/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 147-insertion-sort-list/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 912-sort-an-array/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 148-sort-list/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 179-largest-number/
    │   ├── Solution.java
    │   └── README.md
    │
    ├── 253-meeting-rooms-ii/
    │   ├── Solution.java
    │   └── README.md
    │
    └── 1051-height-checker/
        ├── Solution.java
        └── README.md
```

---

## 🔍 Learning Path

The problems in this repository are organized to gradually build sorting knowledge.

### 1. Basic Sorting

Start by implementing the fundamental algorithms:

```text
Bubble Sort
     ↓
Selection Sort
     ↓
Insertion Sort
```

These algorithms are useful for understanding the fundamentals of comparison-based sorting.

### 2. Divide and Conquer

Next, move to more efficient algorithms:

```text
Merge Sort
     ↓
Quick Sort
```

These algorithms introduce the **Divide and Conquer** technique and achieve approximately `O(n log n)` average/guaranteed performance depending on the algorithm.

### 3. Apply Sorting to Problems

Finally, apply these concepts to LeetCode:

```text
Sorting
   ↓
Two Pointers
   ↓
Greedy
   ↓
Custom Comparator
   ↓
Linked List Sorting
```

---

## 📊 Complexity Overview

### Bubble Sort

Repeatedly compares adjacent elements and swaps them if they are in the wrong order.

```text
Best:    O(n)
Average: O(n²)
Worst:   O(n²)
Space:   O(1)
```

### Selection Sort

Finds the minimum element and places it at the correct position.

```text
Best:    O(n²)
Average: O(n²)
Worst:   O(n²)
Space:   O(1)
```

### Insertion Sort

Builds the sorted array one element at a time.

```text
Best:    O(n)
Average: O(n²)
Worst:   O(n²)
Space:   O(1)
```

### Merge Sort

Divides the array into smaller pieces and merges sorted pieces together.

```text
Best:    O(n log n)
Average: O(n log n)
Worst:   O(n log n)
Space:   O(n)
```

### Quick Sort

Chooses a pivot and partitions the array around it.

```text
Best:    O(n log n)
Average: O(n log n)
Worst:   O(n²)
Space:   O(log n)
```

---

## 🛠️ Language & Tools

**Language:**

```text
Java
```

**Topics:**

```text
Data Structures
Algorithms
Sorting
Arrays
Linked Lists
Recursion
Greedy Algorithms
Two Pointers
Divide and Conquer
```

---

## 🎯 Goals

The goals of this repository are to:

* Understand how common sorting algorithms work.
* Implement sorting algorithms from scratch.
* Analyze time and space complexity.
* Practice applying sorting to coding problems.
* Improve problem-solving skills.
* Prepare for technical interviews.
* Maintain organized and readable Java solutions.

---

## 🚀 Progress

* [x] Bubble Sort
* [x] Selection Sort
* [x] Insertion Sort
* [x] Merge Sort
* [x] Quick Sort
* [x] LeetCode 75 — Sort Colors
* [x] LeetCode 88 — Merge Sorted Array
* [x] LeetCode 147 — Insertion Sort List
* [x] LeetCode 912 — Sort an Array
* [x] LeetCode 148 — Sort List
* [x] LeetCode 179 — Largest Number
* [x] LeetCode 253 — Meeting Rooms II
* [x] LeetCode 1051 — Height Checker

---

## 📈 Future Topics

This repository will be expanded with additional DSA topics:

* [ ] Searching Algorithms
* [ ] Binary Search
* [ ] Two Pointers
* [ ] Sliding Window
* [ ] Hashing
* [ ] Stack
* [ ] Queue
* [ ] Linked List
* [ ] Trees
* [ ] Binary Search Trees
* [ ] Heaps
* [ ] Graphs
* [ ] Dynamic Programming
* [ ] Backtracking

---

## ✍️ Notes

Each problem contains:

1. Problem description
2. Approach
3. Algorithm
4. Java implementation
5. Example
6. Time complexity
7. Space complexity
8. Key takeaway

The goal is not only to solve the problems but also to understand **why the solution works and when the technique can be applied to other problems**.

---

## ⭐ Repository

If you find this repository useful, feel free to star it and follow the progress as more algorithms and LeetCode problems are added.


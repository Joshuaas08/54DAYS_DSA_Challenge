# Day 11 — Hashing

> **Topic:** Hashing
> **Language:** Java
> **Difficulty:** Medium
> **Problems:** 8 LeetCode Problems

---

## 📂 Folder Structure

```text
Day-11-Hashing/
│
├── README.md
│
├── 01-Group-Anagrams/
│   ├── solution.java
│   └── notes.md
│
├── 02-Top-K-Frequent-Elements/
│   ├── solution.java
│   └── notes.md
│
├── 03-Longest-Consecutive-Sequence/
│   ├── solution.java
│   └── notes.md
│
├── 04-Subarray-Sum-Equals-K/
│   ├── solution.java
│   └── notes.md
│
├── 05-Longest-Substring-Without-Repeating-Characters/
│   ├── solution.java
│   └── notes.md
│
├── 06-Longest-Repeating-Character-Replacement/
│   ├── solution.java
│   └── notes.md
│
├── 07-4Sum-II/
│   ├── solution.java
│   └── notes.md
│
├── 08-Contiguous-Array/
│   ├── solution.java
│   └── notes.md
│
└── Notes/
    └── hashing.md
```

---

# 🧠 What is Hashing?

Hashing is a technique used to store and retrieve data efficiently.

In Java, the main data structures used for hashing are:

* `HashMap`
* `HashSet`

Average time complexity for basic operations:

| Operation | Average |
| --------- | ------: |
| Insert    |  `O(1)` |
| Search    |  `O(1)` |
| Delete    |  `O(1)` |

---

# 🔑 HashMap

A `HashMap` stores data as:

```text
key → value
```

Example:

```java
Map<Integer, Integer> map = new HashMap<>();

map.put(10, 1);
map.put(20, 2);

System.out.println(map.get(10));
```

Output:

```text
1
```

### Common Methods

```java
map.put(key, value);

map.get(key);

map.containsKey(key);

map.remove(key);

map.getOrDefault(key, defaultValue);
```

### Frequency Counting

One of the most important HashMap patterns:

```java
Map<Integer, Integer> freq = new HashMap<>();

for (int num : nums) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```

---

# 🔑 HashSet

A `HashSet` stores unique values.

```java
Set<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);
```

The set contains:

```text
[10, 20]
```

### Common Methods

```java
set.add(x);

set.contains(x);

set.remove(x);

set.size();
```

Use `HashSet` when you mainly need:

* Fast lookup
* Duplicate detection
* Unique elements
* Sequence detection

---

# 📚 LeetCode Problems

## 1. Group Anagrams

**LeetCode #49**

### Pattern

```text
Frequency Array + HashMap
```

### Key Idea

Two strings are anagrams if they contain the same characters with the same frequencies.

Example:

```text
eat → a:1, e:1, t:1
tea → a:1, e:1, t:1
```

Use the character frequency as the HashMap key.

### Complexity

```text
Time:  O(N × K)
Space: O(N × K)
```

---

## 2. Top K Frequent Elements

**LeetCode #347**

### Pattern

```text
HashMap + Bucket Sort
```

### Key Idea

First count the frequency of every number.

Then create buckets where:

```text
bucket[index] = numbers appearing index times
```

Traverse the buckets from highest frequency to lowest.

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

## 3. Longest Consecutive Sequence

**LeetCode #128**

### Pattern

```text
HashSet
```

### Key Idea

Put all numbers into a HashSet.

A number is the beginning of a sequence if:

```java
!set.contains(num - 1)
```

Then keep checking:

```text
num + 1
num + 2
num + 3
...
```

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

## 4. Subarray Sum Equals K

**LeetCode #560**

### Pattern

```text
Prefix Sum + HashMap
```

### Key Idea

If:

```text
currentPrefix - previousPrefix = K
```

then:

```text
previousPrefix = currentPrefix - K
```

So store prefix sums in a HashMap.

```java
result += map.getOrDefault(prefixSum - k, 0);
```

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

## 5. Longest Substring Without Repeating Characters

**LeetCode #3**

### Pattern

```text
Sliding Window + HashMap
```

Maintain a window:

```text
[left ........ right]
```

Store the last position of every character.

When a duplicate appears:

```java
left = Math.max(left, lastSeen.get(ch) + 1);
```

### Complexity

```text
Time:  O(N)
Space: O(K)
```

---

## 6. Longest Repeating Character Replacement

**LeetCode #424**

### Pattern

```text
Sliding Window + Frequency Map
```

The important formula is:

```text
replacements = windowSize - maxFrequency
```

If:

```text
replacements > k
```

shrink the window.

### Complexity

```text
Time:  O(N)
Space: O(K)
```

---

## 7. 4Sum II

**LeetCode #454**

### Pattern

```text
Pair Sum + HashMap
```

Instead of checking every combination:

```text
A + B + C + D = 0
```

split it into:

```text
A + B = -(C + D)
```

Store all `A + B` sums in a HashMap.

Then search for the required opposite sum.

### Complexity

```text
Time:  O(N²)
Space: O(N²)
```

This improves the brute-force `O(N⁴)` solution significantly.

---

## 8. Contiguous Array

**LeetCode #525**

### Pattern

```text
Prefix Sum + HashMap
```

Convert:

```text
0 → -1
1 → +1
```

Now the problem becomes:

> Find the longest subarray whose sum is `0`.

If the same prefix sum appears at two positions, the elements between those positions have equal numbers of `0`s and `1`s.

### Complexity

```text
Time:  O(N)
Space: O(N)
```

---

# 🧩 Hashing Patterns to Remember

## 1. Frequency Map

When the problem asks:

> How many times does something occur?

Use:

```java
Map<Integer, Integer> freq = new HashMap<>();

for (int num : nums) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```

---

## 2. Fast Lookup

When the problem asks:

> Have I seen this before?

Use:

```java
Set<Integer> seen = new HashSet<>();

if (seen.contains(num)) {
    // already seen
}

seen.add(num);
```

---

## 3. Store Index

When you need to remember where something appeared:

```java
Map<Integer, Integer> indexMap = new HashMap<>();

indexMap.put(num, index);
```

Useful for:

* Two Sum
* Longest Substring
* Sliding Window

---

## 4. Prefix Sum + HashMap

For subarray problems:

```java
Map<Integer, Integer> map = new HashMap<>();

map.put(0, 1);

int prefixSum = 0;

for (int num : nums) {
    prefixSum += num;

    // Check required previous prefix
    int required = prefixSum - k;

    // Update map
    map.put(
        prefixSum,
        map.getOrDefault(prefixSum, 0) + 1
    );
}
```

---

## 5. Sliding Window + HashMap

For substring problems:

```text
[left ........ right]
```

Expand `right`.

If the window becomes invalid:

```text
move left →
```

Use a HashMap/HashSet to maintain information about the current window.

---

## 6. Pair Sum

For four-number problems:

```text
A + B + C + D = target
```

Try splitting:

```text
A + B = target - (C + D)
```

Store one pair's sums in a HashMap.

---

# 🚀 Pattern Recognition

| Problem Clue          | Pattern                        |
| --------------------- | ------------------------------ |
| Find duplicates       | `HashSet`                      |
| Check existence       | `HashSet`                      |
| Count frequency       | `HashMap`                      |
| Store index           | `HashMap`                      |
| Anagrams              | Frequency Map                  |
| Consecutive sequence  | `HashSet`                      |
| Subarray sum          | Prefix Sum + `HashMap`         |
| Equal 0s and 1s       | Prefix Sum + `HashMap`         |
| Unique substring      | Sliding Window + `HashMap`     |
| Character replacement | Sliding Window + Frequency Map |
| 4Sum                  | Pair Sum + `HashMap`           |

---

# ⚡ Java Hashing Cheat Sheet

### HashMap

```java
Map<Integer, Integer> map = new HashMap<>();
```

### HashSet

```java
Set<Integer> set = new HashSet<>();
```

### Add / Update

```java
map.put(key, value);
```

### Get

```java
map.get(key);
```

### Get with Default

```java
map.getOrDefault(key, 0);
```

### Check Key

```java
map.containsKey(key);
```

### Add to Set

```java
set.add(value);
```

### Check Set

```java
set.contains(value);
```

### Remove

```java
map.remove(key);
set.remove(value);
```

---

# 📊 Complexity Summary

| Data Structure |     Search |     Insert |     Delete |
| -------------- | ---------: | ---------: | ---------: |
| `HashMap`      | `O(1)` avg | `O(1)` avg | `O(1)` avg |
| `HashSet`      | `O(1)` avg | `O(1)` avg | `O(1)` avg |

> Hashing operations can degrade in pathological collision cases, but `O(1)` average is the standard complexity used in interview analysis.

---

# 🎯 Day 11 Goals

By the end of this topic, you should recognize these patterns:

```text
                    HASHING
                       │
        ┌──────────────┼──────────────┐
        ↓              ↓              ↓
    HashSet        HashMap       Prefix Sum
        │              │              │
   Existence       Frequency       Subarray
   Duplicates      Index           Sum K
   Sequences       Lookup          Equal Count
        │              │              │
        └──────────────┼──────────────┘
                       ↓
                 Sliding Window
                       │
                       ↓
                  Substrings
```

---

# ✅ Day 11 Checklist

* [ ] Group Anagrams — LC 49
* [ ] Top K Frequent Elements — LC 347
* [ ] Longest Consecutive Sequence — LC 128
* [ ] Subarray Sum Equals K — LC 560
* [ ] Longest Substring Without Repeating Characters — LC 3
* [ ] Longest Repeating Character Replacement — LC 424
* [ ] 4Sum II — LC 454
* [ ] Contiguous Array — LC 525

---

# 🧠 Final Takeaway

Before solving a Hashing problem, ask:

```text
1. Do I need fast existence checking?
        ↓
     HashSet

2. Do I need frequency/count?
        ↓
     HashMap

3. Do I need an index?
        ↓
     HashMap

4. Is it a subarray sum problem?
        ↓
     Prefix Sum + HashMap

5. Is it a substring/window problem?
        ↓
     Sliding Window + HashMap

6. Is it a combination/pair-sum problem?
        ↓
     Split + HashMap
```

**The goal is not to memorize 8 solutions.**

The goal is to recognize the **HashSet → HashMap → Prefix Sum → Sliding Window** patterns and apply them to new problems.


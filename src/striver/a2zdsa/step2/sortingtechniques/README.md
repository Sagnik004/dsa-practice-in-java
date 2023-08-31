# Criteria used for analyzing sorting algorithms

## Sorting techniques

#### <ins>Comparison based</ins>
- Bubble sort -- TC = O(n^2)
- Insertion sort -- TC = O(n^2) 
- Selection sort -- TC = O(n^2)
- Heap sort -- TC = O(n*logn)
- Merge sort -- TC = O(n*logn)
- Quick sort -- TC = O(n*logn)
- Tree sort -- TC = O(n*logn)
- Shell sort -- TC = O(n^3/2)

#### <ins>Indexed based</ins>
- Count sort -- TC = O(n), extra space is used
- Bucket/Bin sort -- TC = O(n), extra space is used
- Radix sort -- TC = O(n), extra space is used

## Criteria for analysis

1. Number of comparisons
2. Number of swaps
3. Adaptive i.e., if elements are already sorted does the sorting algo takes the minimum time?
4. Stable i.e., if duplicate elements are present whether the order of those duplicate elements is preserved or not?
5. Extra memory used?

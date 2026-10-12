package common;

/**
 * Algorithmic techniques used to categorize LeetCode solutions.
 */
public enum Technique {

    /** Uses a fixed or variable-size sliding window. */
    SLIDING_WINDOW,

    /** Uses two indices to traverse or compare elements. */
    TWO_POINTER,

    /** Uses a hash table for key-based lookup. */
    HASH_TABLE,

    /** Uses a hash set to track unique elements. */
    HASH_SET,

    /** Uses binary search to locate an element or boundary. */
    BINARY_SEARCH,

    /** Solves a problem using overlapping subproblems. */
    DYNAMIC_PROGRAMMING,

    /** Traverses a graph or tree breadth-first. */
    BFS,

    /** Traverses a graph or tree depth-first. */
    DFS,

    /** Processes array-based problems. */
    ARRAY,

    /** Processes string-based problems. */
    STRING
}
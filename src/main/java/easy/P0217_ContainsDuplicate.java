
package easy;

import common.Technique;
import java.util.HashSet;
import java.util.Set;

/**
 * <p><b>LeetCode 217: Contains Duplicate</b></p>
 *
 * <p>
 * Problem:
 * <a href="https://leetcode.com/problems/contains-duplicate/">
 * Contains Duplicate</a>
 * </p>
 *
 * <p>Determines whether the given array contains duplicate elements.</p>
 *
 * <p><b>Techniques:</b> {@code Technique.HASH_TABLE}</p>
 *
 * <h2>Complexity Analysis</h2>
 * <ul>
 *   <li>Time Complexity: O(n) average</li>
 *   <li>Space Complexity: O(n)</li>
 * </ul>
 *
 * @see common.Technique
 */
public class P0217_ContainsDuplicate {

    /**
     * Checks whether the array contains duplicate elements.
     *
     * @param nums the integer array to check
     * @return {@code true} if a duplicate exists; {@code false} otherwise
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }

        // Pre-size the HashSet to reduce resizing for mostly unique elements.
        int capacity = (int) (nums.length / 0.75f) + 1;
        Set<Integer> set = new HashSet<>(capacity);

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}

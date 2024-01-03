package MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        printList(mergedList1);

        // Example 2
        ListNode emptyList1 = null;
        ListNode emptyList2 = null;

        ListNode mergedList2 = solution.mergeTwoLists(emptyList1, emptyList2);
        printList(mergedList2);

        // Example 3
        ListNode emptyList3 = null;
        ListNode list3 = new ListNode(0);

        ListNode mergedList3 = solution.mergeTwoLists(emptyList3, list3);
        printList(mergedList3);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

/*
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
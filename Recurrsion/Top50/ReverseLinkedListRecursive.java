// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedListRecursive {

    // Recursive function to reverse the list
    public static ListNode reverse(ListNode head) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Recurse on the rest of the list
        ListNode newHead = reverse(head.next);

        // Reverse the current node's pointer
        head.next.next = head;
        head.next = null;

        return newHead;  // Return new head of reversed list
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        // Reverse using recursion
        head = reverse(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}

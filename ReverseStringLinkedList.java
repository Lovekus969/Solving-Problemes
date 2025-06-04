class CharNode {
    char data;
    CharNode next;

    CharNode(char data) {
        this.data = data;
    }
}

public class ReverseStringLinkedList {

    // Step 1: Build linked list from string
    public static CharNode buildLinkedList(String str) {
        if (str == null || str.length() == 0) return null;

        CharNode head = new CharNode(str.charAt(0));
        CharNode current = head;

        for (int i = 1; i < str.length(); i++) {
            current.next = new CharNode(str.charAt(i));
            current = current.next;
        }

        return head;
    }

    // Step 2: Reverse linked list using pointers
    public static CharNode reverse(CharNode head) {
        CharNode prev = null;
        CharNode current = head;

        while (current != null) {
            CharNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev; // new head
    }

    // Step 3: Traverse and print reversed string
    public static void printList(CharNode head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        String input = "king";
        CharNode head = buildLinkedList(input);

        System.out.print("Original: " + input + "\nReversed: ");
        CharNode reversedHead = reverse(head);
        printList(reversedHead);
    }
}

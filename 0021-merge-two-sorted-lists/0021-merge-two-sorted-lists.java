/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeHead = new ListNode(0);
        ListNode ptr = mergeHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ptr.next = list1;
                list1 = list1.next;
            }else{
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }
        ptr.next = list1 == null? list2 : list1;
        return mergeHead.next;
    }
}
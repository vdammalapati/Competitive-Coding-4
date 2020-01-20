// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


class Solution {
    public boolean isPalindrome(ListNode head) {
     
        ListNode slow = head;
        ListNode fast = head;
        if(head == null ) return true;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp1 = head;  
        ListNode temp = reverse(slow) ;
        
        while(temp != null && temp1 != null) {
            
            if(temp.val != temp1.val ) return false;
            
            temp = temp.next;
            temp1 = temp1.next;
        }
        
        return true;
    }
    
    
        ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            ListNode fast = head.next;
            
            while(fast != null) {
               curr.next = prev;
                prev = curr;
                curr = fast;
                fast = fast.next;
                
            }
            curr.next = prev;
            return curr;
            
        }
        
    
}

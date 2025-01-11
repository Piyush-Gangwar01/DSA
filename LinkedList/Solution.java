class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
  }
 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
    int lengthB = 0;
    ListNode temp1 = headA;
    ListNode temp2 = headB;

    while(temp1 != null){
        lengthA++;
        temp1=temp1.next;
    }

    while(temp2 != null){
        lengthB++;
        temp2=temp2.next;
    }

    temp1 = headA;
    temp2 = headB;
    if(lengthA>lengthB){
        int steps=lengthA-lengthB;
        for(int i=1;i<=steps;i++){
            temp1=temp1.next;
        }
    }else{
        int steps=lengthB-lengthA;
        for(int j=1;j<=steps;j++){
            temp2=temp2.next;
        }
    }
    while(temp1!=temp2){
        temp1=temp1.next;
        temp2=temp2.next;
    }
    return temp1;
        
    }
}
package org.yzy.nowcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yangzhiyue on 17-9-17.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}


public class N5 {
    public ListNode EntryNodeOfLoop(ListNode pHead){
        Set<ListNode> set = new HashSet<>();
        ListNode temp = pHead;
        while(true){
            if(!set.contains(temp)){
                set.add(temp);
            }else{
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}

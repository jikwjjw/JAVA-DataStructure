# JAVA链表
+ 链表节点
```
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
```
------------------------------
+ 链表计数
```
int totalNum = 0;
ListNode currentNode = head;
while(currentNode != null){
  totalNum++;
currentNode = currentNode.next;
}
```
---------------------------
+ [输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/Clone.java)
+ [合并多个有序链表](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/ListNodeMerge.java)
+ [合并链表](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/ListNodeMerge.java)
+ [删除倒数第K个链表](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/ListNodeMerge.java)
+ [链表反转](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/ReverseList.java)
+ [给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/RotateRight.java)
+ [给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/SwapPairs.java)
+ [给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。](https://github.com/jikwjjw/JAVA-DataStructure/blob/LinkNode/reverseKGroup.java)

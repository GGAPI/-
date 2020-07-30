/**
 * @ClassName
 * @Description TODO
 * @Author ZhangLu
 * @Date ${2019/10/16} ${20:30}
 * @Version 1.0
 **/
/**
 * @ClassName
 * @Description TODO
 * @Author ZhangLu
 * @Date ${2019/10/16} ${20:30}
 * @Version 1.0
 **/
public class MySignal{
    public static void main(String[] args) {
        MySignalList mySignalList=new MySignalList();
        mySignalList.addLast(1);
        mySignalList.addLast(2);
        mySignalList.addLast(3);
        mySignalList.addLast(4);
        mySignalList.addLast(6);
        mySignalList.addLast(7);
        mySignalList.display();
//        boolean flog=mySignalList.contains(2);
//        System.out.println(flog);
//        mySignalList.addIndex(3,4);
//        mySignalList.display();
        mySignalList.remove(4);
       mySignalList.display();
//        mySignalList.removeAllKey(5);
//        mySignalList.display();
//        ListNode node=mySignalList.reverseList();
//        mySignalList.display2(node);
//        ListNode node=mySignalList.middleNode();
//        System.out.println(node.data);
//        ListNode node1=mySignalList.findKthToTail(1);
//        System.out.println(node1.data);
//        ListNode node=mySignalList.partition(4);
//        mySignalList.display2(node);
//        ListNode node=mySignalList.deleteDuplication();
//        mySignalList.display2(node);
//        mySignalList.createLoop();
//        boolean flg=mySignalList.hasCycle();
//        System.out.println(flg);
//        ListNode node=mySignalList.detectCycle();
//        System.out.println(node.data);
    }




    public static void createCut(ListNode headA,ListNode headB) {

        headA.next.next = headB.next.next.next;
    }


}


class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}//节点类

class MySignalList{
    public ListNode head;

    public MySignalList() {
        this.head = null;
    }

    //头插法
    public void addFist(int data) {
        ListNode node = new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next=node;
        }

    }


    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }



    //求长度
    private int getLength() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //找到index-1的位置
    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        int count = 0;
        while (count < index - 1) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入，第一个数据节点为0号下标
    public boolean addIndex(int index, int data) {
        if (index < 0 | index > getLength()) {
            System.out.println("index不合法");
            return false;
        }
        if (index == 0) {
            addFist(data);
            return true;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
        return true;
    }
//
    private ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while (prev.next != null) {     //头已经判断了
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            System.out.println("单链表为空");
            return;
        }
        //0、删除的节点是否是头结点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }//1、找到key的前驱  如果返回空
        ListNode prev = searchPrev(key);
//        if (prev == null) {
//            return;
//        }//2、删除节点
        ListNode del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //反转单链表
    public ListNode reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(ListNode node){
        ListNode cur=node;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    //单链表的中间节点
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点。 让一个节点先走K步，然后同时走，走到末尾时即为倒数第K个节点
    public ListNode findKthToTail(int k) {
        if (this.head==null||k <= 0) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        ListNode cur = this.head;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null) {
            //cur.data < x
            if(cur.data < x) {
                //第一次插入
                if(beforeStart==null) {
                    beforeStart=cur;
                    beforeEnd=beforeStart;
                }else {
                    beforeEnd.next=cur;
                    beforeEnd=beforeEnd.next;
                }
            }else {
                //第一次插入
                if(afterStart == null) {
                    afterStart=cur;
                    afterEnd=cur;
                }else {
                    afterEnd.next=cur;
                    afterEnd=afterEnd.next;
                }
            }
            cur=cur.next;
        }
        if(beforeStart==null){
            return afterStart;
        }
        beforeEnd.next=afterStart;
        if(afterStart!=null){
            afterEnd.next=null;
        }
        return beforeStart;
    }
    // 在一个排序的链表中，存在重复的结点，请删除该链表中连续重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication() {
        ListNode node = new ListNode(-1);
        ListNode cur = this.head;
        ListNode tmp = node;
        while (cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                //1、循环
                while(cur.next != null &&cur.data == cur.next.data){
                    cur=cur.next;
                }
                //2、退出循环 cur要多走一步
                cur=cur.next;
            }else {
                //当前节点 不等于下一个节点的时候
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        tmp.next=null;
        return node.next;

    }
    //链表的回文结构    1>2>3<2<1
    public boolean chkPalindrome() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while (fast != null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p = slow.next;
        while (p != null) {
            ListNode pNext = p.next;
            p.next=slow;
            slow=p;
            p=pNext;   //反转
        }
        while(slow!=this.head){
            if(slow.data!=head.data){
                return false;
            }
            //偶数
            if(this.head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
        return  true;
        //slow往前    head 往后  .data不一样 返回false
        //直到相遇
    }
    // 给定一个链表，判断链表中是否有环。//定义两个引用，一个走一步，一个走两步
    public boolean hasCycle(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public void createLoop(){
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=this.head.next;
    }
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }



    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
        ListNode node=new ListNode(1);
        ListNode tmp=node;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
            if(headA!=null){
                tmp.next=headA;
            }
            if(headB!=null){
                tmp.next=headB;
            }
        }
        return node.next;

    }

    //防止内存泄漏
    //一个一个置为空
    public void clear(){
        while(this.head!=null){
            ListNode cur=this.head.next;
            this.head.next=null;
            this.head=cur;
        }

    }

    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

}



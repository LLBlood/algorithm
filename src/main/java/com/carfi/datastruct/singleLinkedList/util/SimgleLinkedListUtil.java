package com.carfi.datastruct.singleLinkedList.util;

import com.carfi.datastruct.singleLinkedList.pojo.Elem;
import com.carfi.datastruct.singleLinkedList.pojo.SingleLinkedList;

import java.util.Random;

/**
 * com.carfi.datastruct.singleLinkedList.util$
 *
 * @author ll
 * @date 2020-03-16 13:26:05
 **/
public class SimgleLinkedListUtil {
    
    /**
     * 获取链表第i个数据<br/>
     * 1、声明1个结点p指向链表的第一个结点，初始化j从1开始
     * 2、当j<i时，就遍历链表，让p的指针向后移动，不断指向下一结点，j累加1
     * 3、若到链表末尾p为空，则说明第i个元素不存在，
     * 4、若查找成功，返回p的数据
     * @author ll
     * @date 2020-03-16 13:28:05
     * @param simgleLinkedList
     * @param index
     * @param e
     * @return int
     **/
    public static boolean getElem(SingleLinkedList simgleLinkedList, int index, Elem e) {
        int j;
        SingleLinkedList p;
        p = simgleLinkedList.getNextList();
        j = 1;
        while (p != null && j < index) {
            p = p.getNextList();
            j++;
        }
        if (p == null || j > index) {
            return false;
        }
        e.setValue(p.getData());
        return true;
    }

    /**
     * 单链表第i个位置插入结点的算法思路<br/>
     * 1、声明一结点p指向链表第一个结点，初始化j从1开始；
     * 2、当j<i时，就遍历链表，让p的指针向后移动，不断指向下一个结点，j累加1
     * 3、若到链表末尾p为空，则说明第i个元素不存在，
     * 4、否则查找成功，在系统中生成一个空结点s
     * 5、将数据元素e赋值给s->data
     * 6、单链表的插入标准语句s->next=p->next p->next=s;
     * 7、返回成功
     * @author ll
     * @date 2020-03-16 13:44:01 
     * @param singleLinkedList
     * @param index
     * @param e
     * @return boolean
     **/
    public static boolean listInsert(SingleLinkedList singleLinkedList, int index, Elem e) {
        int j;
        SingleLinkedList p = singleLinkedList.getNextList();
        j = 1;
        while (p != null && j < index) {
            p = p.getNextList();
            j++;
        }
        if (p == null || j > index) {
            return false;
        }
        SingleLinkedList temp = new SingleLinkedList(e.getValue());
        temp.setNextList(p.getNextList());
        p.setNextList(temp);
        return true;
    }

    /**
     * 单链表删除第i个位置的算法思路<br/>
     * 1、声明一结点p指向链表第一个结点，初始化j从1开始；
     * 2、当j<i时，就遍历链表，让p的指针向后移动，不断指向下一个结点，j累加1
     * 3、若到链表末尾p为空，则说明第i个元素不存在，
     * 4、否则查找成功，将欲删除结点p->next赋值给q
     * 5、单链表的删除标准语句,p->next=q->next
     * 6、将q结点中的数据赋值给e作为返回
     * 7、释放q结点
     * 8、返回成功
     * @author ll
     * @date 2020-03-16 13:59:41
     * @param singleLinkedList
     * @param index
     * @param e
     * @return boolean
     **/
    public static boolean listDelete(SingleLinkedList singleLinkedList, int index, Elem e) {
        int j;
        SingleLinkedList p = singleLinkedList.getNextList();
        j = 1;
        while (p != null && j < index) {
            p = p.getNextList();
            j++;
        }
        if (p == null || j > index) {
            return false;
        }
        SingleLinkedList q = p.getNextList();
        p.setNextList(q.getNextList());
        e.setValue(q.getData());
        return true;
    }

    /**
     * 单链表整表创建头插法<br/>
     * 1、声明1结点p和计数器变量i;
     * 2、初始化一空链表L；
     * 3、让L的头结点的指针指向Null，即建立一个带头结点的单链表；
     * 4、循环：
     *      生成一新结点赋值给p；
     *      随机生成一数字赋值给p的数据域p->data
     *      将p插入到头结点与前一新结点之间
     * @author ll
     * @date 2020-03-16 14:17:14
     * @param index
     * @return void
     **/
    public static SingleLinkedList createListHead(int index) {
        SingleLinkedList p;
        Random random = new Random();
        SingleLinkedList singleLinkedList = new SingleLinkedList(null);
        for (int i = 0; i < index; i++) {
            p = new SingleLinkedList(random.nextInt(10));
            p.setNextList(singleLinkedList.getNextList());
            singleLinkedList.setNextList(p);
        }
        return singleLinkedList;
    }

    /**
     * 单链表整表创建尾插法<br/>
     * 1、声明1结点p和计数器变量i;
     * 2、初始化一空链表L；
     * 3、让L的头结点的指针指向Null，即建立一个带头结点的单链表；
     * 4、循环：
     *      生成一新结点赋值给p；
     *      随机生成一数字赋值给p的数据域p->data
     *      将p插入前一新结点后面
     * @author ll
     * @date 2020-03-16 14:17:14
     * @param index
     * @return void
     **/
    public static SingleLinkedList createListTail(int index) {
        SingleLinkedList p,r;
        Random random = new Random();
        SingleLinkedList singleLinkedList = new SingleLinkedList(null);
        r = singleLinkedList;
        for (int i = 0; i < index; i++) {
            p = new SingleLinkedList(random.nextInt(10));
            r.setNextList(p);
            r = p;
        }
        r.setNextList(null);
        return singleLinkedList;
    }
}

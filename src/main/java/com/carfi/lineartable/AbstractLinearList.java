package com.carfi.lineartable;

/**
 * com.carfi.lineartable$
 *
 * @author ll
 * @date 2019-12-24 15:27:21
 **/
abstract class AbstractLinearList<T>{

    T[] data;

    /**
     * 线性表当前长度
     */
    int length;

    /**
     * 数组最大长度
     */
    int maxSize = 20;

    /**
     * 初始化线性表
     */
    abstract void initList();

    /**
     * 若线性表为空，返回true，否则返回false
     * @param linearList 线性表
     * @return boolean true/false
     */
    abstract boolean listEmpty(AbstractLinearList<T> linearList);

    /**
     * 清空线性表
     * @param linearList 线性表
     */
    abstract void clearList(AbstractLinearList<T> linearList);

    /**
     * 将线性表L中的第i个位置元素返回给obj
     * @param linearList 线性表
     * @param index 第i个位置
     * @return T 返回参数
     */
    abstract T getElem(AbstractLinearList<T> linearList, int index);

    /**
     * 查找线性表中与obj相等的元素，返回序号，返回0表示失败
     * @param linearList 线性表
     * @param obj 元素对象
     * @return int 序号
     */
    abstract int locateElem(AbstractLinearList<T> linearList, T obj);

    /**
     * 在线性表L的第i个位置插入新元素obj
     * @param linearList 线性表
     * @param index 第i个位置
     * @param obj 元素对象
     */
    abstract void listInsert(AbstractLinearList<T> linearList, int index, T obj);

    /**
     * 删除线性表L中的第i个位置元素，并用obj返回其值
     * @param linearList 线性表
     * @param index 第i个位置
     * @return T 返回参数
     */
    abstract T listDelete(AbstractLinearList<T> linearList, int index);

    /**
     * 返回线性表L的元素个数
     * @param linearList 线性表
     * @return int 个数
     */
    abstract int listLength(AbstractLinearList<T> linearList);

}

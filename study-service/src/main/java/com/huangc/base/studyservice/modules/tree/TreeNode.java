package com.huangc.base.studyservice.modules.tree;

/**
 * @Author: huangl
 * @Date: 2019/12/20 14:06
 * @Description:
 */
public class TreeNode {

    /**
     * 左节点(儿子)
     */
    private TreeNode lefTreeNode;

    /**
     * 右节点(儿子)
     */
    private TreeNode rightNode;

    /**
     * 数据
     */
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode(int value) {

        this.value = value;
    }

    public TreeNode getLefTreeNode() {
        return lefTreeNode;
    }

    public void setLefTreeNode(TreeNode lefTreeNode) {
        this.lefTreeNode = lefTreeNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}

package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursive(root, key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {

		if (root == null) {
			return new MyBinaryNode<>(key);
		}
		int comRes = key.compareTo(root.key);
		if (comRes == 0)
			return root;
		if (comRes < 0) {
			root.left = addRecursive(root.left, key);
		} else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> root) {

		return root == null ? 0 : 1 + this.getSizeRecursive(root.left) + this.getSizeRecursive(root.right);
	}

	public void inOrder() {
		inOrderRec(this.root);
	}

	private void inOrderRec(MyBinaryNode<K> root) {

		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public Boolean search(K key) {
		return searchRecursive(root, key);
	}

	private Boolean searchRecursive(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return false;
		}
		if (key == current.key) {
			return true;
		}
		if (key.compareTo(current.key)<0)
			return searchRecursive(current.left, key);
		else
			return searchRecursive(current.right, key);
	}

//	public void preOrder() {
//		preOrderRec(this.root);
//	}
//	private void preOrderRec(MyBinaryNode<K> root) {
//		
//		if(root != null) {
//			System.out.println(root.key);
//			preOrderRec(root.left);
//			preOrderRec(root.right);
//		}
//	}
//	
//	public void postOrder() {
//		postOrderRec(this.root);
//	}
//	private void postOrderRec(MyBinaryNode<K> root) {
//		
//		if(root != null) {
//			postOrderRec(root.left);
//			postOrderRec(root.right);
//			System.out.println(root.key);
//		}
//	}
}
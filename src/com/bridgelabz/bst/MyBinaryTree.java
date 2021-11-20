package com.bridgelabz.bst;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursive(root, key);
	}

	private MyBinaryNode<K> addRecursive(MyBinaryNode<K> root, K key) {
		
		if(root == null) {
			return new MyBinaryNode<>(key);
		}
		int comRes = key.compareTo(root.key);
		if(comRes == 0) return root;
		if(comRes < 0) {
			root.left = addRecursive(root.left, key);
		}else {
			root.right = addRecursive(root.right, key);
		}
		return root;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> root) {
	
		return root == null ?0 : 1+this.getSizeRecursive(root.left)+this.getSizeRecursive(root.right);
	}
}
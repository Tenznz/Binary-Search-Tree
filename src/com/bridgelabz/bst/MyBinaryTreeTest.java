package com.bridgelabz.bst;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

	@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);

		binaryTree.add(30);
		binaryTree.add(70);

		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);

		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);

		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);

		binaryTree.add(67);
		binaryTree.inOrder();
		int size = binaryTree.getSize();
		Assert.assertEquals(13, size);
		System.out.println("Size of tree is " + size);
		Boolean check = binaryTree.search(63);
		Assert.assertTrue(check);
		System.out.print("63 -> " + check);
	}
}
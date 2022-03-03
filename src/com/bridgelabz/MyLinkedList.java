package com.bridgelabz;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/*
	 * This is the method to add new node to the last
	 */
	public void append(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<K> tempNode = this.tail;
			this.tail = newNode;
			tempNode.setNext(newNode);
		}

	}

	/*
	 * This is the method to search node
	 */
	public INode<K> search(K key) {
		INode tempNode = head;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
}

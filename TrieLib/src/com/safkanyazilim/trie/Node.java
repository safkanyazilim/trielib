package com.safkanyazilim.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node<T> {
	private Map<Character, Node<T>> children;
	private List<T> items;
	
	Node() {
		this.children = new HashMap<Character, Node<T>>();
		this.items = new ArrayList<T>();
	}
	
}

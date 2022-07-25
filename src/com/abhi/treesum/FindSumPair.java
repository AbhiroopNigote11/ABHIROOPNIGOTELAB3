package com.abhi.treesum;


import java.util.*;

class FindSumPair {
	public Node insert (Node root , int key) 
	
	{
		if(root== null)
			return new Node(key);
		
		if(key < root .nodeData)
			root.leftNode = insert(root.leftNode,key);
		else
			root.leftNode= insert (root.rightNode,key);
		
		return root;
	}
	public boolean findpairUtil(Node root,int sum,
			HashSet<Integer>set)
	{
		{
			if(root == null)
			return false;
			if(findpairUtil(root.leftNode,sum,set))
			return true;
			if(set.contains(sum - root.nodeData)) {
				System.out.println("pair is found ("
						+(sum - root.nodeData)+ "," 
						 + root.nodeData+")"); 
				return true;
			} 
			else
				set.add(root.nodeData);
			return findpairUtil(root.rightNode,sum,set);
		}
	
			
	}
	
	public void findPairWithGivenSum(Node root, int sum)
	{
		HashSet<Integer>set = new HashSet<Integer>();
		if(!findpairUtil(root,sum,set))
			System.out.print("Pairs do not exit"
					+ "\n");
		
		
		
	}
	
	
}

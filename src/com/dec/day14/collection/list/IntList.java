package com.dec.day14.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) {
		
		if(size > nums.length) {
			int [] temp = new int[nums.length+3];
			for(int i=0;i<nums.length;i++) {
				temp[i] = nums[i];
			}
			nums = temp;
		}
		
		nums[size] = num;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void remove(int index) {
		for(int i=index;i<nums.length-1;i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length-1] = 0;
	}
	
	
	// remove(), add() - 3개이상 넣을때 동작
	// -> 구현해보기
	public void clear() {
		nums = new int[3]; // 객체를 하나 만들어서 초기화
//		for(int num : nums) { // 원래 존재하던 객체를 초기화
//			num = 0;
//		}
		size = 0;
	}
	
}

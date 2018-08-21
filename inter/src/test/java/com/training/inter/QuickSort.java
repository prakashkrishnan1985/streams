package com.training.inter;

public class QuickSort {
	
	private int [] arr;
	
	public QuickSort(int[] arr) {
		this.arr = arr;
	}
	
	public void sort() {
		sortValues(0, arr.length-1);
	}
	
	public void printOutput() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public void sortValues(int low, int high) {
		if(low >= high) return;
		int pivot = partition(low, high);
		sortValues(low, pivot-1);
		sortValues(pivot+1, high);
	}
	
	private int partition(int low, int high) {
		int pivot = (high+ low)/2;
		int position = low;
		swap(pivot, high);
		for(int j = low; j < high; j++) {
			if(arr[j] <= arr[high]) {
				swap(j, position);
				position++;
			}
		}
		
		swap(position, high);
		return position;
	}
	private void swap(int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort(new int[] {12, 13, 9, 4, 6, 30});
		quickSort.sort();
		quickSort.printOutput();
	}
	
}

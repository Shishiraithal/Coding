
public class DS_MaxHeap {
	public static void main(String[] args) throws Exception {
		MaxHeap mh = new MaxHeap(5);
		 
		mh.insert(3);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(2);
		mh.printMaxHeap();
		System.out.println();
 
		mh.delete(1);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(15);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(5);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(4);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(45);
		mh.printMaxHeap();
		System.out.println();
 
		mh.insert(50);
		mh.printMaxHeap();
		System.out.println();
 
		System.out.println("Extracted max: " + mh.extractMax());
		mh.printMaxHeap();
		System.out.println();
 
		System.out.println("Max: " + mh.getMax());
		mh.printMaxHeap();
		System.out.println();
 
		mh.increaseKey(2,20);
		mh.printMaxHeap();
		System.out.println();
 
		System.out.println("Max: " + mh.getMax());
		mh.printMaxHeap();
	}
}

class MaxHeap {
	int capacity;
	int arr[];
	int size;
 
	public MaxHeap(int capacity) {
		this.capacity = capacity;
		arr = new int[this.capacity];
		this.size = 0;
	}
 
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
 
	int parent(int i) {
		return (i-1)/2;
	}
 
	int left(int i) {
		return 2*i + 1;
	}
 
	int right(int i) {
		return 2*i + 2;
	}
 
	int getMax() {
		if(size <= 0) {
			System.out.println("Heap underflow");
			return Integer.MIN_VALUE;
		}
		return arr[0];
	}
 
	int extractMax() {
		if(size <= 0) {
			System.out.println("Heap underflow");
			return Integer.MIN_VALUE;
		}
		if(size == 1) {
			size--;
			return arr[0];
		}
 
		int root = arr[0];
		arr[0] = arr[size-1];
		size--;
		maxHeapify(0);
 
		return root;
	}
 
	void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
 
		if(l < size && arr[l] > arr[largest])
			largest = l;
		if(r < size && arr[r] > arr[largest])
			largest = r;
 
		if(largest != i) {
			swap(arr,i,largest);
			maxHeapify(largest);
		}
	}
 
	void fixUpwards(int i) {
		while(i != 0 && arr[i] > arr[parent(i)]) {
			swap(arr,i,parent(i));
			i = parent(i);
		}
	}
 
	void increaseKey(int i, int newKey) {
		arr[i] = newKey;
		fixUpwards(i); 
	}
 
	void insert(int key) {
		if(size == capacity) {
			System.out.println("Heap overflow");
			return;
		}
 
		arr[size++] = key;
		fixUpwards(size-1);
	}
 
	void delete(int i) {
		increaseKey(i,Integer.MAX_VALUE);
		extractMax();
	}
 
	void printMaxHeap() {
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
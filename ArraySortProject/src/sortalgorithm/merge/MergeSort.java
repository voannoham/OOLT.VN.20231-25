package sortalgorithm.merge;

import sortalgorithm.SortAlgorithm;

public class MergeSort extends SortAlgorithm {
	
	public MergeSort(int[] array) {
		super(array);
	}

	@Override
	public void sort() {
		mergeSort(array,0, array.length - 1);
		addLogs(array, new int[array.length], new int[] {-1, -1});
	}
	
	  @Override
    public SortAlgorithm newInstance(int[] newArray) {
        return new MergeSort(newArray);
    }

	private void mergeSort(int array[],int start, int end) {
		if (start < end) {
			int mid = start + ((end - start) / 2);
			
			addLogs(array, new int[array.length], new int[] {mid, -1});
			mergeSort(array,start, mid);
			mergeSort(array,mid + 1, end);
			
			merge(array,start, mid, end);
		}
	}
	
	private void merge(int[] array,int start, int mid, int end) {
		int l = start;
		int r = mid + 1;
		int k = start;
		
		int[] partArray = new int[array.length];
		
		for (int i=start; i <= end; i++) {
			partArray[i] = array[i];
		}
		
		addLogs(array, partArray, new int[] {-1, -1});
		
		while (l <= mid && r <= end) {
			if (partArray[l] <= partArray[r]) {
				array[k] = partArray[l];
				addLogs(array, partArray, new int[] {k, l});
				l++;
				
			} else {
				array[k] = partArray[r];
				addLogs(array, partArray, new int[] {k, r});
				r++;
			}
			k++;
		}
		
		while (l <= mid) {
			array[k] = partArray[l];
			addLogs(array, partArray, new int[] {k, l});
					
			k++;
			l++;
		}
		while (r <= end) {
			array[k] = partArray[r];
			addLogs(array, partArray, new int[] {k, r});
					
			k++;
			r++;
		}
	}
}


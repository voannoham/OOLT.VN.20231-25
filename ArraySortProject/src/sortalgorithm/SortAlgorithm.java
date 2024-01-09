package sortalgorithm;

import java.util.Arrays;

import sortalgorithm.util.ArrayUtils;

public abstract class SortAlgorithm {
	public int[][] arrayLog;
	protected int [][] tempLog;
	protected int [][] pointerLog;
	
	int numSteps = 0;
	protected int[] array;
	//consstructor
	public SortAlgorithm(int[] array) {
		this.array = array;
		
		arrayLog = new int[1][array.length];
		tempLog = new int[1][array.length];
		pointerLog = new int[1][2]; // two pointers per step
	}

	public abstract void sort();
	// Thêm phương thức newInstance để tạo một thể hiện mới của SortAlgorithm với mảng mới
    public abstract SortAlgorithm newInstance(int[] newArray);

	public void setArray(int[] newArray) {
    	this.array = newArray;
    }

	public int[] getArray(){
		return array;
	}
	
	public int[][] getArrayLog() {
		return arrayLog;
	}

	public int[][] getTempLog() {
		return tempLog;
	}

	public int[][] getPointerLog() {
		return pointerLog;
	}

	public int getNumSteps() {
		return numSteps;
	}
	
	public void addLogs(int[] array, int[] temp, int[] pointer) {
		if (arrayLog.length == numSteps) {
			arrayLog = ArrayUtils.resizeIntegers(arrayLog);
			tempLog = ArrayUtils.resizeIntegers(tempLog);
			pointerLog = ArrayUtils.resizeIntegers(pointerLog);
		}
		
		arrayLog[numSteps] = array.clone();
		tempLog[numSteps] = temp.clone();
		pointerLog[numSteps] = pointer;
		
		numSteps++;
	}
	
	public void displaySteps() {
        System.out.println(Arrays.toString(array));
    }
}
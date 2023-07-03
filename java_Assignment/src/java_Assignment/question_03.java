package java_Assignment;

 public class question_03 {
	public int average(int[] num) {
		int sum=0;
		int average=0;
		for(int i=0;i<num.length-1;i++) {
			sum+=num[i];
			average=sum/num.length;
		}
return average;
	}

	
	
}


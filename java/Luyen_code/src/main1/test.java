package main1;

public class test {
	public static void main(String[] args) {
		int[] a = new int[]{-1, 150, 190, 170, -1, -1, 160,180};
		int[] b = new int[a.length];
	    int k = 0;
	    for(int i=0;i<a.length;i++){
	        if(a[i] != -1){
	        	b[k] = a[i];
		        k++;
	        }
	        
	    }
	    for(int i=1;i<b.length;i++){
	        int key = b[i];
	        int j= i-1;
	        while(j >= 0 && b[j] > key){
	            b[j+1] = b[j];
	            j-=1;
	        }
	        b[j+1] = key;
	    }
	    for(int i=0;i<b.length;i++) {
	    	System.out.println(b[i]+" ");
	    }
	}
}

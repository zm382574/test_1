package sort;

/**
 * ��ѡ������
 * @author MengZhou
 * @date 2017��1��9��
 * @description ����˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
				Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
 */
public class SelectSort {
	public static void main(String args[]){
		int a[]={1,54,6,3,78,34,12,45};  
	       int position=0;  
	       for(int i=0;i<a.length;i++){       
	           int j=i+1;  
	           position=i;  
	           int temp=a[i];  
	           for(;j<a.length;j++){  
	              if(a[j]<temp){  
	                 temp=a[j];  
	                 position=j;  
	              }  
	           }  
	           a[position]=a[i];  
	           a[i]=temp;  
	       }  
	  
	       for(int i=0;i<a.length;i++)  
	           System.out.println(a[i]);  
		
		
	}
}

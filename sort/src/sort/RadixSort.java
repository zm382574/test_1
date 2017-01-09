/**
 * 
 */
package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * 
 * @author MengZhou
 * @date 2017��1��9��
 * @description ����˼�룺�����д��Ƚ���ֵ����������ͳһΪͬ������λ���ȣ���λ�϶̵���ǰ�油�㡣Ȼ�󣬴����λ��ʼ�����ν���һ������
 *              ���������λ����һֱ�����λ��������Ժ�,���оͱ��һ���������С�
 */
public class RadixSort {

	int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99,
			98, 54, 101, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	public void radixSort() {
		sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void sort(int[] array) {
		// ����ȷ�����������;
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		int time = 0;
		// �ж�λ��;
		while (max > 0) {
			max /= 10;
			time++;
		}

		// ����10������;
		List<ArrayList> queue = new ArrayList<ArrayList>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> queue1 = new ArrayList<Integer>();
			queue.add(queue1);
		}

		// ����time�η�����ռ�;
		for (int i = 0; i < time; i++) {
			// ��������Ԫ��;
			for (int j = 0; j < array.length; j++) {
				// �õ����ֵĵ�time+1λ��;
				int x = array[j] % (int) Math.pow(10, i + 1)
						/ (int) Math.pow(10, i);
				ArrayList<Integer> queue2 = queue.get(x);
				queue2.add(array[j]);
				queue.set(x, queue2);
			}
			int count = 0;// Ԫ�ؼ�����;
			// �ռ�����Ԫ��;
			for (int k = 0; k < 10; k++) {
				while (queue.get(k).size() > 0) {
					ArrayList<Integer> queue3 = queue.get(k);
					array[count] = queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}

}

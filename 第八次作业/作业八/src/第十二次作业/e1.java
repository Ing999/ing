package ��ʮ������ҵ;

import java.util.*;
public class e1 {
	/**
	 * @author ���������������ľ��
	 * @date 00, 2020, 12, 23��  20:16
	 * ʹ��List��Map��Ŷ��ͼ����Ϣ��
	 * �����������������Ʒ���ԣ���ţ����ƣ����ۣ�������;
	 * ʹ����Ʒ�����ΪMap�е�key��
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Books e1= new Books(15623-03, "Java", 85.00, "��е��ҵ������");
	     Books e2= new Books(27384-01, "���ݽṹ", 57.00, "�廪��ѧ������");
	     Books e3= new Books(39662-00, "�ߵ���ѧ", 155.0, "�ߵȽ���������");
	     Books e4= new Books(53527-02, "������������ͳ��", 124.0, "�ߵȽ���������");
	     Books e5= new Books(286181, "��ѧӢ��", 56.80, "�Ϻ����������");
	     Books e6= new Books(82383-02, "��ѧ����", 88124.0, "�ߵȽ���������");
	     Books e7= new Books(89653-02, "��������ԭ��", 113.0, "�廪��ѧ������");
	     //Ȼ��Ž�HashMap��,Key��ͼ��ı��,value��ͼ�����
	     HashMap<Integer, Books> booksHashMap = new HashMap<>();
	     booksHashMap.put(e1.getNum(),e1);
	     booksHashMap.put(e2.getNum(),e2);
	     booksHashMap.put(e3.getNum(),e3);
	     booksHashMap.put(e4.getNum(),e4);
	     booksHashMap.put(e5.getNum(),e5);
	     booksHashMap.put(e6.getNum(),e6);
	     booksHashMap.put(e7.getNum(),e7);

	     List<HashMap<Integer, Books>> booksList = new ArrayList<>();
	     booksList.add(booksHashMap);
	     System.out.println("���\t����\t����\t������");
	        for (HashMap<Integer, Books> h : booksList) {
	            //��ȡkey
	            Set<Integer> key = h.keySet();
	            for (Integer i : key) {
	                //��ͨ��key��value
	                System.out.println(i+ "\t" + h.get(i).getName()+ "\t" + h.get(i).getPrice()+ "\t" + h.get(i).getPress());
	            }
	        }
	}
}
/**
 * Books(ͼ����)
 * ���ڴ��ͼ�������
 * num ���
 * name ����
 * price �۸�
 * press ������
 */
class Books {
	private int num;
    private String name;
    private double price;
    private String press;

    public Books() {
    }
    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }
    int getNum() {
        return num;
    }
    String getName() {
        return name;
    }
    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }
}
package admin;

import java.util.LinkedList;
import java.util.Scanner;

public class book {
	LinkedList<book> list = new LinkedList<>();
	Scanner in = new Scanner(System.in);
	private int id;
	private String name;
	private double price;
	public book(int id,String name,double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public book() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addbook() {//增加
		book bo = new book();
		System.out.print("书id:");
		bo.setId(in.nextInt());
		Scanner s = new Scanner(System.in);
		System.out.print("书名:");
		bo.setName(s.nextLine());
		System.out.print("价格:");
		bo.setPrice(s.nextDouble());
		list.add(bo);
		System.out.println("添加成功");
		System.out.println("------------------------");
		menu();
	}
	public void getById() {//根据id
		System.out.println("输入查询的id");
		int id = in.nextInt();
		int i=0;
		for(i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				System.out.println("查询成功");
				System.out.println("书Id:"+list.get(i).getId()+"书名："+list.get(i).getName()+"价格"+list.get(i).getPrice());
				break;
			}
		}
		if(i==list.size()) {System.out.println("查无此书");}
		System.out.println("任意键继续");
		int ting = in.nextInt();//停一下
		menu();
	}
	
	public void getByName() {//根据书名
		System.out.println("输入查询的id");
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		System.out.println("所有可能的书籍为：");
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {

				System.out.println("书Id:"+list.get(i).getId()+"书名："+list.get(i).getName()+"价格"+list.get(i).getPrice());

			}
		}

		System.out.println("任意键继续");
		int ting = in.nextInt();//停一下
		menu();
	}
	
	public void listall() {//所有书
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {

				System.out.println("书Id:"+list.get(i).getId()+"书名："+list.get(i).getName()+"价格"+list.get(i).getPrice());

			}
		}

		System.out.println("任意键继续");
		int ting = in.nextInt();//停一下
		menu();
	}
	
	void menu() {
		// TODO Auto-generated method stub
		System.out.println("请选择菜单");
		System.out.println("0-退出");
		System.out.println("1-增加一本书");
		System.out.println("2-根据id查找");
		System.out.println("3-根据书名模糊查找");
		System.out.println("4-查看所有书");
		System.out.println("----------------------------");
		int menu=in.nextInt();
		switch(menu) {
		case 0:
			System.exit(0);
		
		case 1:
			addbook();
			break;
			
		case 2:
			getById();
			break;
			
		case 3:
			getByName();
			break;
			
		case 4:
			listall();
			break;
		}
	}

}

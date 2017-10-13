/**
 * 
 */
package cn.jbit.epetShop.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.jbit.epetShop.dao.PetDao;
import cn.jbit.epetShop.dao.PetOwnerDao;
import cn.jbit.epetShop.dao.PetStoreDao;
import cn.jbit.epetShop.dao.impl.PetDaoImpl;
import cn.jbit.epetShop.dao.impl.PetOwnerDaoImpl;
import cn.jbit.epetShop.dao.impl.PetStoreDaoImpl;
import cn.jbit.epetShop.entity.Account;
import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.entity.PetOwner;
import cn.jbit.epetShop.entity.PetStore;
import cn.jbit.epetShop.service.PetOwnerService;
import cn.jbit.epetShop.service.PetStoreFactory;
import cn.jbit.epetShop.service.PetStoreService;
import cn.jbit.epetShop.service.impl.PetOwnerServiceImpl;
import cn.jbit.epetShop.service.impl.PetStoreFactoryImpl;
import cn.jbit.epetShop.service.impl.PetStoreServiceImpl;

/**
 *  入口类
 * 
 */
public class Main2 {
	Scanner input =new Scanner(System.in);
	PetOwnerServiceImpl petOwner = new PetOwnerServiceImpl();
	/**
	 * @param args
	 * void 系统入口方法
	 */
	public static void main(String[] args) {
		Main2 main2=new Main2();
		main2.startPetShop();
	}

	/**
	 * 系统启动
	 */
	public void startPetShop() {
		System.out.println(" 宠物商店启动");
		System.out.println("Wonderland醒来,所有宠物从MySQL中醒来");
		System.out
				.println("****************************************************");
		PetDao petDao = new PetDaoImpl();
		List<Pet> petList = petDao.getAllPet();
		System.out.println("序号\t" + "宠物名称\t");
		for (int i = 0; i < petList.size(); i++) {
			Pet pet = petList.get(i);
			System.out.println((i + 1)+"\t"+ pet.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		System.out.println("所有宠物主人从MySQL中醒来");
		PetOwnerDao ownerDao = new PetOwnerDaoImpl();
		List<PetOwner> ownerList = ownerDao.getAllOwner();
		System.out
				.println("****************************************************");
		System.out.println("序号\t" + "主人姓名\t" );
		for (int i = 0; i < ownerList.size(); i++) {
			PetOwner owner = ownerList.get(i);
			System.out.println((i + 1) +"\t"+ owner.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		System.out.println("所有宠物商店从MySQL中醒来");
		System.out
				.println("****************************************************");
		PetStoreDao storeDao = new PetStoreDaoImpl();
		List<PetStore> storeList = storeDao.getAllStore();
		System.out.println("序号\t" + "宠物商店名称\t");
		for (int i=0;i<storeList.size();i++) {
			PetStore store = storeList.get(i);
			System.out.println((i + 1) +"\t"+ store.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		Scanner input = new Scanner(System.in);
		System.out.println("请选择输入登录模式，输入1为宠物主人登录，输入2为宠物商店登录,输入0结束");
		boolean type = true;
		String num;
		while (type) {
			num = input.next();
			if ("1".equals(num)) {
				ownerLogin();
				type = false;
			} else if ("2".equals(num)) {
				storeLogin();
				type = false;
			}else {
				System.out.println("输入有误，请按照指定规则输入");
				System.out.println("请选择登录模式，输入1为宠物主人登录，输入2为宠物商店登录");
				type = true;
			}
		}
	}

	private  void ownerLogin() {
		PetOwner Owner = petOwner.login();
		if (null == Owner) {
			System.out.println("登录失败，请确认您的用户名和密码后重新输入");
			ownerLogin();
		} else {
			System.out.println("登录成功，您可以购买和卖出宠物，如果您想购买宠物请输入1，如果想卖出宠物请输入2");
			do{
				System.out.println("1：购买宠物");
				System.out.println("2：卖出宠物");
				System.out.println("0：退出登录");
					int num = input.nextInt();
					if (1 == num) {
						//Main.ownerBuy(Owner);
						System.out.println("输入购买宠物");
						continue;
					} else if (2 == num) {
						//Main.ownerSell(Owner);
						System.out.println("输入卖出宠物");
						continue;
					}else if (0 == num) {
						//Main.ownerSell(Owner);
						System.out.println("退出登录");
					}else {
						System.out.println("输入有误,请重新输入");
						continue;
					}
					break;
			}while(true);
		}
		
	}
	
	private  void storeLogin() {
		// TODO Auto-generated method stub
		
	}
}

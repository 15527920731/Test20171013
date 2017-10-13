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
 *  �����
 * 
 */
public class Main2 {
	Scanner input =new Scanner(System.in);
	PetOwnerServiceImpl petOwner = new PetOwnerServiceImpl();
	/**
	 * @param args
	 * void ϵͳ��ڷ���
	 */
	public static void main(String[] args) {
		Main2 main2=new Main2();
		main2.startPetShop();
	}

	/**
	 * ϵͳ����
	 */
	public void startPetShop() {
		System.out.println(" �����̵�����");
		System.out.println("Wonderland����,���г����MySQL������");
		System.out
				.println("****************************************************");
		PetDao petDao = new PetDaoImpl();
		List<Pet> petList = petDao.getAllPet();
		System.out.println("���\t" + "��������\t");
		for (int i = 0; i < petList.size(); i++) {
			Pet pet = petList.get(i);
			System.out.println((i + 1)+"\t"+ pet.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		System.out.println("���г������˴�MySQL������");
		PetOwnerDao ownerDao = new PetOwnerDaoImpl();
		List<PetOwner> ownerList = ownerDao.getAllOwner();
		System.out
				.println("****************************************************");
		System.out.println("���\t" + "��������\t" );
		for (int i = 0; i < ownerList.size(); i++) {
			PetOwner owner = ownerList.get(i);
			System.out.println((i + 1) +"\t"+ owner.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		System.out.println("���г����̵��MySQL������");
		System.out
				.println("****************************************************");
		PetStoreDao storeDao = new PetStoreDaoImpl();
		List<PetStore> storeList = storeDao.getAllStore();
		System.out.println("���\t" + "�����̵�����\t");
		for (int i=0;i<storeList.size();i++) {
			PetStore store = storeList.get(i);
			System.out.println((i + 1) +"\t"+ store.getName()+"\t");
		}
		System.out
				.println("****************************************************");
		System.out.print("\n");
		Scanner input = new Scanner(System.in);
		System.out.println("��ѡ�������¼ģʽ������1Ϊ�������˵�¼������2Ϊ�����̵��¼,����0����");
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
				System.out.println("���������밴��ָ����������");
				System.out.println("��ѡ���¼ģʽ������1Ϊ�������˵�¼������2Ϊ�����̵��¼");
				type = true;
			}
		}
	}

	private  void ownerLogin() {
		PetOwner Owner = petOwner.login();
		if (null == Owner) {
			System.out.println("��¼ʧ�ܣ���ȷ�������û������������������");
			ownerLogin();
		} else {
			System.out.println("��¼�ɹ��������Թ�����������������빺�����������1���������������������2");
			do{
				System.out.println("1���������");
				System.out.println("2����������");
				System.out.println("0���˳���¼");
					int num = input.nextInt();
					if (1 == num) {
						//Main.ownerBuy(Owner);
						System.out.println("���빺�����");
						continue;
					} else if (2 == num) {
						//Main.ownerSell(Owner);
						System.out.println("������������");
						continue;
					}else if (0 == num) {
						//Main.ownerSell(Owner);
						System.out.println("�˳���¼");
					}else {
						System.out.println("��������,����������");
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

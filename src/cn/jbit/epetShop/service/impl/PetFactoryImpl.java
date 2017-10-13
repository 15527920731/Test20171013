 /**
 * 
 */
package cn.jbit.epetShop.service.impl;

import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.service.PetFactory;

/**
 * ���﹤��ʵ����
 */
public class PetFactoryImpl implements PetFactory {
	/**
	 * ���﹤��������Ʒ�ֳ���
	 */
	public Pet breadNewPet(String[] petParam) {
		Pet pet = new Pet();
		pet.setName(petParam[0]);
		pet.setTypeName(petParam[1]);
		pet.setHealth(Integer.parseInt(petParam[2]));
		pet.setLove(Integer.parseInt(petParam[3]));
		pet.setStoreId(Integer.parseInt(petParam[4]));
		return pet;
	}
}
/**
 * 
 */
package cn.jbit.epetShop.service;

import cn.jbit.epetShop.entity.Pet;

/**
 *  ���﹤���ӿ�
 */
public interface PetFactory {
	/**
	 * ������Ʒ�ֳ���
	 */
	public Pet breadNewPet(String[] petParam);
}

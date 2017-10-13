/**
 * 
 */
package cn.jbit.epetShop.service;

import cn.jbit.epetShop.entity.Pet;

/**
 *  宠物工厂接口
 */
public interface PetFactory {
	/**
	 * 培育新品种宠物
	 */
	public Pet breadNewPet(String[] petParam);
}

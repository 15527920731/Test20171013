/**
 * 
 */
package cn.jbit.epetShop.service;

import cn.jbit.epetShop.entity.Pet;

/**
 *宠物卖接口
 */
public interface Sellable {
	/**
	 * 卖宠物
	 */
	public void sell(Pet pet);
}

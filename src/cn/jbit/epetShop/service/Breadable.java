/**
 * 
 */
package cn.jbit.epetShop.service;

import cn.jbit.epetShop.entity.Pet;

/**
 * @author 北大青鸟 宠物培育接口
 * 
 */
public interface Breadable {
	/**
	 * 宠物繁殖
	 */
	public Pet bread(String pet);
}

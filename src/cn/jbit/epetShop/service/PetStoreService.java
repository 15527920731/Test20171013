/**
 * 
 */
package cn.jbit.epetShop.service;

import java.util.List;

import cn.jbit.epetShop.entity.Pet;
import cn.jbit.epetShop.entity.PetOwner;
import cn.jbit.epetShop.entity.PetStore;

/**
 * @author 北大青鸟 宠物商店接口
 */
public interface PetStoreService extends Accountable, Breadable, Buyable, Sellable {
	/**
	 * 查询出所有库存宠物
	 */
	public List<Pet> getPetsInstock(long storeId);

	/**
	 * 查询出所有新培育的宠物
	 */
	public List<Pet> getPetsBread();

	/**
	 * 查询出所有新培育的宠物
	 */
	public double charge(Pet pet);

	/**
	 * 根据宠物主人信息修改宠物信息
	 */
	public int modifyPet(Pet pet, PetOwner petOwner,
			PetStore store);

	/**
	 * 修改宠物主人信息
	 */
	public int modifyOwner(PetOwner owner, Pet pet, int type);

	/**
	 * 根据宠物商店标识符查询宠物商店
	 */
	public PetStore getPetStore(long id);

	/**
	 * 修改宠物商店信息
	 */
	public int modifyStore(Pet pet, int type);

	/**
	 * 宠物商店登录
	 */
	public PetStore login();

	/**
	 * 查询出所有宠物主人正在出售的宠物
	 */
	public List<Pet> getPetSelling();
}

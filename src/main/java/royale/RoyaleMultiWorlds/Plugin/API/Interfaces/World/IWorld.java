package royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World;

import java.util.UUID;

import royale.RoyaleMultiWorlds.Plugin.API.Exceptions.RoyaleMultiWorldsException;
import royale.RoyaleMultiWorlds.Plugin.API.Exceptions.RoyaleMultiWorldsException.Type;

/**
 * Class which contains all the data of a world registered on the plugin.
 * 
 * @author DarkPanda73
 */
public interface IWorld {

	/**
	 * @return The ID of the world.
	 */
	public String getId();

	/**
	 * @return The display name of the world.
	 */
	public String getDisplayName();

	/**
	 * @return The UUID of the owner.
	 */
	public UUID getOwnerUuid();

	/**
	 * @return The Name of the owner
	 */
	public String getOwnerName();

	/**
	 * @param playerUuid UUID of the player you're looking for.
	 * @return The {@link IMember} instance of the player you've specified, or null
	 *         if not found.
	 */
	public IMember getMember(UUID playerUuid);

	/**
	 * @param playerUuid UUID of the player you're looking for.
	 * @return If the specified player is currently a member or not.
	 */
	public boolean isMember(UUID playerUuid);

	/**
	 * Adds a new member to the world, and saves this information to the database.
	 * 
	 * @param playerUuid UUID of the member to be added
	 * @return {@link IMember} instance of the added player.
	 */
	public IMember addMemberAndSave(UUID playerUuid);

	/**
	 * Removes an existent member from the world, and saves this information to the
	 * database.
	 * 
	 * @param playerUuid UUID of the member to be removed
	 */
	public void removeMemberAndSave(UUID playerUuid);

	/**
	 * @param playerUuid UUID of the player you're looking for.
	 * @return If the specified player is currently banned or not.
	 */
	public boolean isBanned(UUID playerUuid);

	/**
	 * Adds a new banned player to the world, and saves this information to the
	 * database.
	 * 
	 * @param playerUuid UUID of the banned player to be added
	 */
	public void addBannedAndSave(UUID playerUuid);

	/**
	 * Removes an existent banned player from the world, and saves this information
	 * to the database.
	 * 
	 * @param playerUuid UUID of the banned player to be removed
	 */
	public void removeBannedAndSave(UUID playerUuid);

	/**
	 * @return If someone has requested the removal for this world or not.
	 */
	public boolean isRemovalRequested();

	/**
	 * @return The time (in millis) when the removal request was made.
	 */
	public Long getRemovalRequestedTime();

	/**
	 * Requests the removal of the player, removing it permanently, or setting it
	 * pending to be removed depending on the current settings on the plugin. The
	 * world will be unloaded in this process.
	 * 
	 * @throws RoyaleMultiWorldsException An exception if any error occurs. Check
	 *                                    the existent types of exceptions in
	 *                                    {@link Type}.
	 */
	public void requestRemoval() throws RoyaleMultiWorldsException;

	/**
	 * Requests the recover of the world, loading it again if it was pending to be
	 * removed.
	 * 
	 * @throws RoyaleMultiWorldsException An exception if any error occurs. Check
	 *                                    the existent types of exceptions in
	 *                                    {@link Type}.
	 */
	public void requestRecover() throws RoyaleMultiWorldsException;

}

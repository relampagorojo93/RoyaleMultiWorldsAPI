package royale.RoyaleMultiWorlds.Plugin.API.Services.WorldsService;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import royale.RoyaleMultiWorlds.Plugin.API.Exceptions.RoyaleMultiWorldsException;
import royale.RoyaleMultiWorlds.Plugin.API.Exceptions.RoyaleMultiWorldsException.Type;
import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World.IWorld;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.CreateWorldRequestInput.WorldData;

/**
 * Service which contains methods used to manage the worlds' information.
 * 
 * @author DarkPanda73
 */
public interface WorldsService {

	/**
	 * Based on a {@link WorldData} instance, generates a new world integrated on
	 * the plugin.
	 * 
	 * @param worldData The {@link WorldData} instance which contains the
	 *                  information about the world to be created.
	 * @return A {@link IWorld} instance based on the input information.
	 * @throws RoyaleMultiWorldsException An exception if any error occurs. Check
	 *                                    the existent types of exceptions in
	 *                                    {@link Type}.
	 */
	public IWorld create(WorldData worldData) throws RoyaleMultiWorldsException;

	/**
	 * Deletes a world from the plugin.
	 * 
	 * @param worldId ID of the world to be deleted.
	 * @throws RoyaleMultiWorldsException An exception if any error occurs. Check
	 *                                    the existent types of exceptions in
	 *                                    {@link Type}.
	 */
	public void delete(String worldId) throws RoyaleMultiWorldsException;

	/**
	 * @return A collection with all the existent worlds in the server registered in
	 *         RoyaleMultiWorlds.
	 */
	public Collection<? extends IWorld> getWorlds();

	/**
	 * @param id ID of the world to be returned.
	 * @return The {@link IWorld} related to the specified ID, or null if not found.
	 */
	public IWorld findById(String id);

	/**
	 * @param ownerUuid UUID of the player who must be the owner of the worlds
	 *                  you're looking for.
	 * @return A list with {@link IWorld} instances where the owner is the specified
	 *         owner.
	 */
	public List<? extends IWorld> findByOwnerUuid(UUID ownerUuid);

	/**
	 * @param ownerUuid UUID of the player who must be the owner of the deleted
	 *                  worlds you're looking for.
	 * @return A list with {@link IWorld} instances where the owner is the specified
	 *         owner and are deleted.
	 */
	public List<? extends IWorld> findDeletedByOwnerUuid(UUID ownerUuid);

	/**
	 * @param playerUuid UUID of the player who must be allowed on the worlds you're
	 *                   looking for.
	 * @return A list with {@link IWorld} instances where the specified player is
	 *         allowed.
	 */
	public List<? extends IWorld> findAllowedByPlayerUuid(UUID playerUuid);

	/**
	 * @param playerUuid UUID of the player who must be allowed on the worlds you're
	 *                   looking for and which has to be public.
	 * @return A list with {@link IWorld} instances where the specified player is
	 *         allowed to access and which are public.
	 */
	public List<? extends IWorld> findPublicsByPlayerUuid(UUID playerUuid);

}

package royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World;

import java.util.UUID;

/**
 * Class which contains all the data of a member registered on the plugin.
 * 
 * @author DarkPanda73
 */
public interface IMember {

	/**
	 * @return UUID of the player related to this member.
	 */
	public UUID getUuid();

	/**
	 * @return If the player is allowed to build in its related world.
	 */
	public boolean isCanBuild();

	/**
	 * @return If the player is allowed to use WorldEdit in its related world.
	 */
	public boolean isCanUseWE();

}

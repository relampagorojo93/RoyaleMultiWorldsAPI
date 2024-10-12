package royale.RoyaleMultiWorlds.Plugin.API;

import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.PlayerInteractionsService;
import royale.RoyaleMultiWorlds.Plugin.API.Services.WorldsService.WorldsService;

/**
 * API which contains access to the registered services in the plugin.
 * 
 * @author DarkPanda73
 */
public abstract class RoyaleMultiWorldsAPI {

	private static RoyaleMultiWorldsAPI instance;

	/**
	 * Constructor of the {@link RoyaleMultiWorldsAPI} class.
	 * 
	 * WARNING! Do not attempt to create a new instance based on this class.
	 */
	public RoyaleMultiWorldsAPI() {
		RoyaleMultiWorldsAPI.instance = this;
	}

	/**
	 * @return The current instance of the {@link PlayerInteractionsService}.
	 */
	public abstract PlayerInteractionsService getPlayerInteractionsService();

	/**
	 * @return The current instance of the {@link WorldsService}.
	 */
	public abstract WorldsService getWorldsService();

	/**
	 * @return The current instance of the {@link RoyaleMultiWorldsAPI}.
	 */
	public static RoyaleMultiWorldsAPI getInstance() {
		return instance;
	}

}

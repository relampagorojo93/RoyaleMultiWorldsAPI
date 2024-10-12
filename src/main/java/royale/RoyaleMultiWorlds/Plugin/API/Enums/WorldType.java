package royale.RoyaleMultiWorlds.Plugin.API.Enums;

/**
 * Types of worlds which are allowed in the plugin.
 * 
 * @author DarkPanda73
 */
public enum WorldType {

	FLAT, NORMAL, NETHER, THE_END, VOID;

	/**
	 * @return The {@link WorldType} found next to the current {@link WorldType}.
	 */
	public WorldType next() {
		return WorldType.values()[(WorldType.values().length + this.ordinal() + 1) % WorldType.values().length];
	}

	/**
	 * @return The {@link WorldType} found previous to the current
	 *         {@link WorldType}.
	 */
	public WorldType previous() {
		return WorldType.values()[(WorldType.values().length + this.ordinal() - 1) % WorldType.values().length];
	}

}
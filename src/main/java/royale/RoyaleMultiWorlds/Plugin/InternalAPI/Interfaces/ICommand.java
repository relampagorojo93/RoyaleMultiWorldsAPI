package royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces;

import java.util.List;

/**
 * Class which contains the information of the retrieved command.
 * 
 * @author DarkPanda73
 */
public interface ICommand {

	/**
	 * @return The parent command of this actual command. May be null if there's no
	 *         parent.
	 */
	public ICommand getParent();

	/**
	 * @return The ID of this command. This ID is used to set a static name for the
	 *         command, to offer a way to always be able to retrieve this command if
	 *         the name is customized.
	 */
	public String getId();

	/**
	 * @return The current name set in this command on the configuration file.
	 */
	public String getCurrentName();

	/**
	 * @return The current description set in this command on the configuration
	 *         file.
	 */
	public String getCurrentDescription();

	/**
	 * @return The current usage information set in this command on the
	 *         configuration file.
	 */
	public String getCurrentUsage();

	/**
	 * @return The current permission set in this command on the configuration file.
	 */
	public String getCurrentPermission();

	/**
	 * @return The current aliases set in this command on the configuration file.
	 */
	public List<String> getCurrentAliases();

}

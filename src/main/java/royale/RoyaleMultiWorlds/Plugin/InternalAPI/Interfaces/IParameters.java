package royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces;

import java.util.List;

import royale.RoyaleMultiWorlds.Plugin.InternalAPI.Objects.Pair;

/**
 * Class which contains the information of the parameters used to execute a
 * command.
 * 
 * @author DarkPanda73
 */
public interface IParameters {

	/**
	 * @return The alias used to execute this command. It only contains the alias
	 *         used for the current command, not the parent ones.
	 */
	public String getCommandAlias();

	/**
	 * @return All the parameters which are placed after the command.
	 */
	public List<String> getParameters();

	/**
	 * @return Any parameter which is not managed by the current command. Any
	 *         command which is not a key or a value of a key are found in this
	 *         list.
	 */
	public List<String> getUnprocessedParameters();

	/**
	 * @return Any parameter which is registered on the command as a key-only
	 *         parameter. Ex: '--confirm', '--confirm' is the key.
	 */
	public List<String> getKeyOnlyParameters();

	/**
	 * @return Any parameter which is registered on the command as a key-value
	 *         parameter. Ex: '--days 30', '--days' is the key, '30' is the value.
	 */
	public List<Pair<String, String>> getKeyValueParameters();

}

package darkpanda73.InternalAPI.PandaCommandsModule.Events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import darkpanda73.InternalAPI.PandaCommandsModule.Interfaces.IPandaCommand;
import darkpanda73.InternalAPI.PandaCommandsModule.Interfaces.IPandaParameters;

/**
 * Event which is generated on the usage of every command.
 * 
 * @author DarkPanda73
 */
public class PandaCommandUsageEvent extends Event implements Cancellable {

	private static final HandlerList handlerList = new HandlerList();

	public static HandlerList getHandlerList() {
		return handlerList;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HandlerList getHandlers() {
		return handlerList;
	}

	private String pluginName;
	private IPandaCommand command;
	private IPandaParameters parameters;
	private boolean cancelled;

	public PandaCommandUsageEvent(String pluginName, IPandaCommand command, IPandaParameters parameters) {
		super();
		this.pluginName = pluginName;
		this.command = command;
		this.parameters = parameters;
	}

	/**
	 * @return The name of the plugin related to the executed command.
	 */
	public String getPluginName() {
		return this.pluginName;
	}

	/**
	 * @return The instance of the executed command.
	 */
	public IPandaCommand getCommand() {
		return this.command;
	}

	/**
	 * @return The instance of parameters which were used to execute the command.
	 */
	public IPandaParameters getParameters() {
		return this.parameters;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}

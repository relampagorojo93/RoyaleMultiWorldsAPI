package royale.RoyaleMultiWorlds.Plugin.InternalAPI.Events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces.ICommand;
import royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces.IParameters;

public abstract class CommandUsageEvent extends Event implements Cancellable {

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

	private ICommand command;
	private IParameters parameters;

	public CommandUsageEvent(ICommand command, IParameters parameters) {
		super();
		this.command = command;
		this.parameters = parameters;
	}

	public ICommand getCommand() {
		return this.command;
	}

	public IParameters getParameters() {
		return this.parameters;
	}

	public abstract boolean isCancelled();

	public abstract void setCancelled(boolean cancelled);

}

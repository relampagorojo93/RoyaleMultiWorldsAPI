package royale.RoyaleMultiWorlds.Plugin.API.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.ICommand;
import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.IParameters;

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

	private Player player;
	private ICommand command;
	private IParameters parameters;

	public CommandUsageEvent(Player player, ICommand command, IParameters parameters) {
		super();
		this.player = player;
		this.command = command;
		this.parameters = parameters;
	}

	public Player getPlayer() {
		return this.player;
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

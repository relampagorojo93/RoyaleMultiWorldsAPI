package royale.RoyaleMultiWorlds.Plugin.InternalAPI.Events;

import java.io.File;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces.IWorld;

public abstract class WorldImportEvent<T extends IWorld> extends Event implements Cancellable {

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

	private T world;
	private File worldFolder;
	private boolean cancelled;

	public WorldImportEvent(T world, File worldFolder) {
		super();
		this.world = world;
		this.worldFolder = worldFolder;
	}

	public T getWorld() {
		return this.world;
	}

	public File getWorldFolder() {
		return this.worldFolder;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}

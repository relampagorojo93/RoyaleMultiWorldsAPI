package royale.RoyaleMultiWorlds.Plugin.API.Events;

import java.io.File;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.CreateWorldRequestInput.WorldData;

public class WorldImportEvent extends Event implements Cancellable {

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

	private WorldData worldData;
	private File worldFolder;
	private boolean cancelled;

	public WorldImportEvent(WorldData world, File worldFolder) {
		super();
		this.worldData = world;
		this.worldFolder = worldFolder;
	}

	public WorldData getWorldData() {
		return this.worldData;
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

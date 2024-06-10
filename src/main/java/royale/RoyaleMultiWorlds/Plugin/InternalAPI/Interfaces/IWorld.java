package royale.RoyaleMultiWorlds.Plugin.InternalAPI.Interfaces;

import java.util.UUID;

public interface IWorld {

	public String getWorldName();

	public String getWorldDisplayName();

	public UUID getOwnerUuid();

	public String getOwnerName();

}

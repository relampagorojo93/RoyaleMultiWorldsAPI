package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions;

import royale.RoyaleMultiWorlds.Plugin.API.Exceptions.RoyaleMultiWorldsException;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.CreateWorldRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.DeleteWorldRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.RecoverWorldRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Banneds.BanPlayerRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Banneds.UnbanPlayerRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Members.AddMemberRequestInput;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Members.RemoveMemberRequestInput;

public abstract class PlayerInteractionsService {

	public abstract void createWorldRequest(CreateWorldRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void deleteWorldRequest(DeleteWorldRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void recoverWorldRequest(RecoverWorldRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void addMemberRequest(AddMemberRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void removeMemberRequest(RemoveMemberRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void banPlayerRequest(BanPlayerRequestInput input) throws RoyaleMultiWorldsException;

	public abstract void unbanPlayerRequest(UnbanPlayerRequestInput input) throws RoyaleMultiWorldsException;

}

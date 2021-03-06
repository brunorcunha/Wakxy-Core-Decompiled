package com.ankamagames.wakfu.client.console.command.debug.anim;

import com.ankamagames.baseImpl.client.proxyclient.base.console.command.*;
import org.apache.log4j.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.command.descriptors.*;
import java.util.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.wakfu.client.core.game.characterInfo.*;

public class SetSkinCommand implements Command
{
    private static final Logger m_logger;
    
    @Override
    public void execute(final ConsoleManager manager, final CommandPattern pattern, final ArrayList<String> args) {
        final LocalPlayerCharacter localPlayer = WakfuGameEntity.getInstance().getLocalPlayer();
        if (localPlayer == null) {
            manager.err("pas de localPlayer");
            return;
        }
        if (args.size() != 3) {
            return;
        }
        localPlayer.getActor().setGfx(args.get(2));
    }
    
    @Override
    public boolean isPassThrough() {
        return false;
    }
    
    static {
        m_logger = Logger.getLogger((Class)SetSkinCommand.class);
    }
}

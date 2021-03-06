// 
// Decompiled by Procyon v0.5.30
// 

package com.bdoemu.core.network.sendable;

import com.bdoemu.commons.network.SendByteBuffer;
import com.bdoemu.core.network.sendable.utils.WriteCharacterInfo;
import com.bdoemu.gameserver.model.creature.player.Player;

public class SMRefreshPcCustomizationCache extends WriteCharacterInfo {
    private final Player player;

    public SMRefreshPcCustomizationCache(final Player player) {
        this.player = player;
    }

    protected void writeBody(final SendByteBuffer buffer) {
        buffer.writeD(this.player.getGameObjectId());
        buffer.writeQ(this.player.getObjectId());
        buffer.writeD(this.player.getPcCustomizationCacheCount());
        this.writeAppearanceData(buffer, this.player);
    }
}

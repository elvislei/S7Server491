// 
// Decompiled by Procyon v0.5.30
// 

package com.bdoemu.core.network.receivable;

import com.bdoemu.commons.network.ReceivablePacket;
import com.bdoemu.commons.network.SendablePacket;
import com.bdoemu.core.network.GameClient;
import com.bdoemu.core.network.sendable.SMAddFriendList;
import com.bdoemu.gameserver.model.creature.player.Player;

public class CMAddFriendList extends ReceivablePacket<GameClient> {
    public CMAddFriendList(final short opcode) {
        super(opcode);
    }

    protected void read() {
    }

    public void runImpl() {
        final Player player = ((GameClient) this.getClient()).getPlayer();
        if (player != null) {
            this.sendPacket((SendablePacket) new SMAddFriendList(player.getFriendHandler().getFriendsReqList()));
        }
    }
}

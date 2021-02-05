package com.nukkitx.protocol.bedrock.v410.serializer;

import com.nukkitx.protocol.bedrock.BedrockPacketHelper;
import com.nukkitx.protocol.bedrock.packet.CommandRequestPacket;
import com.nukkitx.protocol.bedrock.v291.serializer.CommandRequestSerializer_v291;
import io.netty.buffer.ByteBuf;

public class CommandRequestSerializer_v410 extends CommandRequestSerializer_v291 {
    public static final CommandRequestSerializer_v410 INSTANCE = new CommandRequestSerializer_v410();

    @Override
    public void serialize(ByteBuf buffer, BedrockPacketHelper helper, CommandRequestPacket packet) {
        super.serialize(buffer, helper, packet);
        buffer.writeByte(packet.getUnknown());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockPacketHelper helper, CommandRequestPacket packet) {
        super.deserialize(buffer, helper, packet);
        packet.setUnknown(buffer.readByte());
    }
}
